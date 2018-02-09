/**
 * 
 */
package com.example.demo;

import java.util.List;

import javax.sound.midi.SysexMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author spaneos
 *
 */
@Controller
@EnableAutoConfiguration
public class HomeController {

	@Autowired
	private StudentService service;

	public HomeController() {
		System.err.println("Controller");
	}
	@GetMapping("/")
	public String showHome() {
		System.err.println("Show home page");
		return "home"; 
	}

	@GetMapping("/registration_form")
	public String openForm() {
		System.err.println("Show form page");
		return "register"; 
	}

	@PostMapping("/register")
	public String register(Model model,@ModelAttribute Student student, BindingResult result) {
		int number=-1;
		System.err.println("register");
		if(result.hasErrors()) {
			System.err.println("Error "+result);
			model.addAttribute("message", "Oops somethimng went wrong. Contact admin!!");
			return "register";
		}
		List<Student> list= service.retriveStudents();
		if(list!=null) {
			for (Student student2 : list) {
				if(student2.getRegNo()==student.getRegNo()) {
					number=student.getRegNo();
				}
			}
		} 
		if(number==-1) {
			String response=service.register(student);
			System.err.println("Response of add "+response);
			model.addAttribute("message", "Registration Successfull!!");
			return "home";
		}
		else {
			model.addAttribute("message", "Registration failed!! Registeration number is chosen already!!!");
			return "register";
		}

		
	}   
	
	@PostMapping("/update")
	public String updateStudent(Model model,@ModelAttribute Student student, BindingResult result) {
		System.err.println("register");
		if(result.hasErrors()) {
			System.err.println("Error "+result);
			return "register";
		}
		else {
			String response=service.register(student);
			System.err.println("Response of add "+response);
			model.addAttribute("message", "Details has been updated Successfully!!");
			return "home";	
		}
	}
	
	@GetMapping("/student/{regNo}")
	public String edit(Model model, @PathVariable("regNo") int regNo) {
		Student student=service.retriveSpecificStudent(regNo);
		model.addAttribute("student", student);
		return "edit_form";
	}

	@GetMapping("/view")
	public String viewAllStudents(Model model) {
		List<Student> students=service.retriveStudents(); 
		if(students!=null) {
			model.addAttribute("students", students);
		}
		System.err.println("View map "+students);
		return "studentsList";

	}
	@DeleteMapping("/student/{regNo}")
	public String delete(Model model, @PathVariable("regNo") int regNo) {
		String response=service.delete(regNo);
		model.addAttribute("message", "Deleted successfully!!!");
		return "home";
	}



}

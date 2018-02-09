/**
 * 
 */
package com.spaneos.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author spaneos
 *
 */
@Controller
@EnableWebMvc
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
		if(result.hasErrors()) {
			System.err.println("Error "+result);
			model.addAttribute("message", "Oops somethimng went wrong. Contact admin!!");
			return "register";
		}
		else {
			List<Student> list= service.retriveStudents();
			if(list.size()!=0) {
				for (Student student2 : list) {
					if(student2.getRegNo()==student.getRegNo()) {
						number=student.getRegNo();
					}
				}
			}
			if(number==-1) {
				service.register(student);
				model.addAttribute("message", "Registration Successfull!!");
				return "home";

			}
			else {
				model.addAttribute("message", "Register number is already choosen!!!");
				return "register";
			}

		} 
	}

	@GetMapping("/view")
	public String viewAllStudents(Model model) {
		List<Student> students=service.retriveStudents(); 
		if(students.size()!=0) {
			model.addAttribute("students", students);
		}
		else {
			model.addAttribute("error", "There are no students!!!");
		}
		model.addAttribute("students", students);
		return "studentsList"; 

	}

	@GetMapping("/student/{regNo}")
	public String edit(Model model, @PathVariable("regNo") int regNo) {
		System.err.println("Edit");
		Student student=service.retriveSpecificStudent(regNo);
		model.addAttribute("student", student);
		return "edit_form";
	}

	@PostMapping("/update")
	public String updateStudent(Model model,@ModelAttribute Student student, BindingResult result) {
		System.err.println("update");
		if(result.hasErrors()) {
			System.err.println("Error "+result);
			model.addAttribute("message", "Oops Something bad happened. Contact admin!!!");
			return "home";
		}
		System.err.println("student "+student);
		String response=service.register(student);
		System.err.println("Response of add "+response);
		model.addAttribute("message", "Details has been updated Successfully!!");
		return "home";		
	}

	@GetMapping("/delete/{regNo}")
	public String delete(Model model, @PathVariable("regNo") int regNo) {
		String response=service.delete(regNo);
		model.addAttribute("message", "Deleted successfully!!!");
		return "home";
	}

	@GetMapping("/cse_students")
	public String viewCseStudent(Model model) {
		List<Student> students=service.retriveCseStudents();
		if(students.size()!=0) {
			model.addAttribute("students", students);
		}
		else {
			model.addAttribute("error", "There are no Computer science students!!!");
		}
		model.addAttribute("students", students);
		return "studentsList"; 

	}

	@GetMapping("/birth_may")
	public String birthOnMay(Model model) {
		List<Student> students=service.retriveBirthOnMay(); 
		if(students.size()!=0) {
			model.addAttribute("students", students);
		}
		else {
			model.addAttribute("error", "There are no students who are born in May!!!");
		}
		model.addAttribute("students", students);
		return "studentsList"; 

	}

	@GetMapping("/name_kumar")
	public String nameKumar(Model model) {
		List<Student> students=service.retriveKumar(); 
		if(students.size()!=0) {
			model.addAttribute("students", students);
		}
		else {
			model.addAttribute("error", "There are no students whose name is Kumar!!!");
		}
		model.addAttribute("students", students);
		return "studentsList"; 
	}

	@GetMapping("/letter_i")
	public String letterContainI(Model model) {
		List<Student> students=service.retriveNameContainsI();
		if(students.size()!=0) {
			model.addAttribute("students", students);
		}
		else {
			model.addAttribute("error", "There are no students whose name contain the letter 'I'!!!");
		}
		model.addAttribute("students", students);
		return "studentsList"; 

	}



}

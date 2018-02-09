package com.spaneos.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public StudentService() {
		System.err.println("Service");
	}

	public String register(Student student) {
		repository.save(student);
		return "SUCCESS";
	}
	
	public List<Student> retriveStudents(){
		List<Student> listOfStudents=repository.findAll();
		return listOfStudents;
	}
	
	public Student retriveSpecificStudent(int regNo){
		Student student=repository.findOne((int) regNo);
		return student;
	}
	
	public String delete(int regNo) {
		repository.delete((int)regNo);
		return "SUCCESS";
	}
	
	public List<Student> retriveCseStudents(){
		List<Student> listOfStudents=repository.findAllByBranch("Computer Science");
		return listOfStudents;
	}
	
	public List<Student> retriveKumar(){
		List<Student> listOfStudents=repository.findAllByNameIgnoreCaseContaining("kumar");
		return listOfStudents;
	}
	
	public List<Student> retriveNameContainsI(){
		List<Student> listOfStudents=repository.findAllByNameIgnoreCaseContaining('i');
		return listOfStudents;
	}
	
	public List<Student> retriveBirthOnMay(){
		List<Student> listOfStudents=new ArrayList<Student>();
		List<Student> all=repository.findAll();
		for (Student student : all) {
			if(student.getDob().substring(5,7).equals("05")) {
				listOfStudents.add(student);
			}
		}
		return listOfStudents;
	}
}

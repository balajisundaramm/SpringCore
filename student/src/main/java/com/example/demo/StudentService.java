package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class StudentService {

	public StudentService() {
		System.err.println("Service");
	}

	private static Map<Integer, Student> students;

	public String register(Student student) {
		if(students==null) {
			students=new LinkedHashMap<Integer, Student>();
		}
		students.put(student.getRegNo(),student);
		System.err.println("List of students "+students);
		return "SUCCESS";
	}

	public List<Student> retriveStudents(){
		List<Student> listOfStudents=null;
		if(students!=null) {
			listOfStudents=new ArrayList<Student>();
			for (Map.Entry<Integer, Student> entry : students.entrySet()) {
				listOfStudents.add(entry.getValue());
			}
		}
		return listOfStudents;
	}

	public Student retriveSpecificStudent(int regNo){
		Student student=null;
		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			if(entry.getKey()==regNo) {
				student=entry.getValue();
			}
		}
		return student;
	}

	public String delete(int regNo) {
		students.remove(regNo);
		return "SUCCESS";
	}
}

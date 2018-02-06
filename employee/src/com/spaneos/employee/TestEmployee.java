package com.spaneos.employee;

import java.io.File;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author spaneos
 *
 */
public class TestEmployee {
	public static void main(String[] args) {
		System.out.println("Exist test: " + new File("src/com/spaneos/employee/spring.xml").exists());
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/com/spaneos/employee/spring.xml");
		Address address=(Address)context.getBean("Address.class");
		address.setStreet("First Cross");
		address.setCity("Rajaji nagar");
		address.setState("Bangalore");
		
		Employee employee=(Employee)context.getBean("Employee.class");
		employee.setAddress(address);
		employee.setEmployeeName("Ravi");
		employee.setEmail("ravi@gmail.com");
		employee.setEmployeeNo("123");
		employee.setSalary(750000);
		employee.setMobile("8124641817");
		
		System.out.println("Employee details : "+employee);
		
	}
}

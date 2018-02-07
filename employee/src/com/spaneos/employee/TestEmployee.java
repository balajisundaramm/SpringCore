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
		Employee employee=(Employee)context.getBean("employee");
		System.out.println("Employee details : "+employee);
		
	}
}

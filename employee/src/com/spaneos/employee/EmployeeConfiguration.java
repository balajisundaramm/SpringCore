package com.spaneos.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author spaneos
 *
 */
@Configuration
public class EmployeeConfiguration {
	@Bean
	public Employee getEmployee(){
		return new Employee();
	}
	
	@Bean
	public Address getAddress(){
		return new Address();
	}
	
	
}

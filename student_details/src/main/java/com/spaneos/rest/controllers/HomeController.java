package com.spaneos.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

import com.spaneos.rest.services.StudentService;

@Controller
@EnableAutoConfiguration
public class HomeController {
	@Autowired
	private StudentService service;
	
	public HomeController(){
		System.err.println("Controller");
	}
	
	public String showHome(){
		return "home";
	}
}

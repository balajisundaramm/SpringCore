package com.spaneos.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaneos.rest.service.StudentService;

@Controller
@EnableAutoConfiguration
public class HomeController {
	
	@Autowired
	private StudentService service;
	
	public HomeController() { 
		System.err.println("Controller ");
	}

	@RequestMapping("/")
	public String showHome(Model model) {
		System.err.println("Controller--> show home()");
		return "home";
	}
	
}

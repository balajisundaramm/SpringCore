package com.spaneos.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	public HomeController() {
		System.out.println("Controller ");
	}

	@RequestMapping("/")
	public String showHome() {
		System.out.println("Controller--> show home()");
		return "home";
	}
	
	@RequestMapping("/getDetails")
	public String getProductDetails(@ModelAttribute ProductBean bean,
            BindingResult result, Model model){
		model.addAttribute("product",bean);
		return "details";
	}
}

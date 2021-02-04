package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Khan Bilal");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("name", "Sanky Solutions");
		return "about";
	}
}

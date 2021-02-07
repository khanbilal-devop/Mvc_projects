package com.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entities.Admin;
import com.spring.entities.Student;
import com.spring.service.AdminService;
import com.spring.service.Service;
import com.spring.service.StudentService;

@Controller
public class MainController {

	@Autowired
	WebApplicationContext ctxt;
	Service sc;
	static String message;

	@RequestMapping(path = "/registerStudent", method = RequestMethod.POST)
	public String registerSt(@ModelAttribute Student st, Model m) {
		sc = ctxt.getBean("scst", StudentService.class);
		message = sc.register(st);
		m.addAttribute("message", message);
		return "responsest";

	}

	@RequestMapping("/authenticateStudent")
	public String authenticateSt(@RequestParam("emailid") String email, @RequestParam("password") String password,
			Model m) {
		sc = ctxt.getBean("scst", StudentService.class);
		message = sc.authenticate(email, password);
		m.addAttribute("message", message);
		return "authenticatest";

	}

	@RequestMapping("/searchSt")
	public ModelAndView searchSt(@RequestParam("attribute") String attribute, @RequestParam("value") String value,
			ModelAndView m) {
		sc = ctxt.getBean("scst", StudentService.class);
		attribute = attribute.trim();
		value = value.trim();
		Object ob =  sc.search(attribute, value);
		
		if (ob instanceof String) {
			String s = (String)ob;
			m.addObject("message", s);

		} else {
			ArrayList<Student> al = (ArrayList<Student>) ob;
			m.addObject("List", al);
			m.addObject("message", "Required results");
		}
		m.setViewName("searchst");
		return m;
	}

	@RequestMapping("/registerAdmin")
	public String registerAd(@ModelAttribute Admin ad, Model m) {
		sc = ctxt.getBean("scad", AdminService.class);
		message = sc.register(ad);
		m.addAttribute("message", message);
		return "responsead";
	}

	@RequestMapping("/authenticateAdmin")
	public ModelAndView authenticateAd(@RequestParam("emailid") String email, @RequestParam("password") String password,
			ModelAndView m) {
		sc = ctxt.getBean("scad", AdminService.class);
		message = sc.authenticate(email, password);
		m.addObject("message", message);
		m.setViewName("authenticatead");
		return m;
	}

	@RequestMapping("/searchAd")
	public Model searchAd(@RequestParam("attribute") String attribute, @RequestParam("value") String value, Model m) {
		sc = ctxt.getBean("scad", AdminService.class);
		ArrayList<Admin> li = (ArrayList<Admin>) sc.search(attribute, value);
		m.addAttribute("List", li);
		return null;
	}

}

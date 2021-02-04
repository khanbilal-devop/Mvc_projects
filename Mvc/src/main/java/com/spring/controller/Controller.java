package com.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.entities.Student;
import com.spring.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	StudentService sc;
	Map<String, Object> mp ;
	
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute Student st, Model m) {
		System.out.println(st);
		m.addAttribute("operation", "Successfully added");
	    mp =(HashMap<String , Object>)sc.add(st);
	    if(mp.containsKey("success")){
	    	return "success";
	    		}
	    else {
	    	m.addAttribute("exception",(Exception)mp.get("error") );
	    	return "error";
	    }
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@ModelAttribute Student st, Model m) {
		m.addAttribute("operation", "Successfully updated");
		mp =(HashMap<String , Object>)sc.update(st);
	    if(mp.containsKey("success")){
	    	return "success";
	    		}
	    else {
	    	m.addAttribute("exception",(Exception)mp.get("error") );
	    	return "error";
	    }
	}

	@RequestMapping(value = "delete")
	public String delete(@RequestParam(name ="id") int id, Model m) {
		m.addAttribute("operation", "Successfully deleted");
		mp =(HashMap<String , Object>)sc.delete(id);
	    if(mp.containsKey("success")){
	    	return "success";
	    		}
	    else {
	    	m.addAttribute("exception",(Exception)mp.get("error") );
	    	return "error";
	    }
	}

	@RequestMapping(value = "getall")
	public String getAll(Model m) {
		mp =(HashMap<String , Object>)sc.getAll(Student.class);
	    if(mp.containsKey("success")){
	    	m.addAttribute("allstudents", (ArrayList<Student>)mp.get("success"));
	    	return "allstudents";
	    		}
	    else {
	    	m.addAttribute("exception",(Exception)mp.get("error") );
	    	return "error";
	    }
	}
}

package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

@Controller
public class Learning {
    
	@Autowired
	WebApplicationContext ctxt;
	
	@RequestMapping("/add")
	public void add() {
	New nw = (New) ctxt.getBean("new1");
	System.out.println(nw);
	New1 nw1 = ctxt.getBean("new2",New1.class);
	System.out.println(nw1);
	}
}

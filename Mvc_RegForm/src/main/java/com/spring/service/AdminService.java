package com.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.Dao;
import com.spring.entities.Admin;
import com.spring.entities.Entities;


@org.springframework.stereotype.Service("scad")
public class AdminService implements Service{
	
    @Autowired
	Dao dao;
    
	public String register(Entities en) {
	  return dao.register(en);
		
	}

	public String authenticate(String emailid, String password) {
		return dao.authenticate(emailid, password,Admin.class);
	}

	public Object search(String attribute,String value) {
		// TODO Auto-generated method stub
		return (List<? extends Entities>) dao.search(attribute,value,Admin.class);
	}



}

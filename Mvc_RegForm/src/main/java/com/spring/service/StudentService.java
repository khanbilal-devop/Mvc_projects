package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.dao.Dao;
import com.spring.entities.Admin;
import com.spring.entities.Entities;
import com.spring.entities.Student;

@org.springframework.stereotype.Service("scst")
public class StudentService implements Service{
	
	@Autowired
    Dao dao;
	public String register(Entities en) {
		// TODO Auto-generated method stub
		return dao.register(en);
	}

	public String authenticate(String emailid, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(emailid, password,Student.class);
	}

	public Object search(String attribute,String value) {
		// TODO Auto-generated method stub
		return  dao.search(attribute,value,Student.class);
	}

}

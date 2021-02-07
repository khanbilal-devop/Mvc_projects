package com.spring.service;

import java.util.List;

import com.spring.entities.Entities;

public interface Service {
   
	public String register(Entities en);
	public String authenticate(String emailid, String password);
	public Object search(String attribute,String value);
}

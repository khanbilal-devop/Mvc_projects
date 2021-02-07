package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Entities;

public interface Dao {
    
	
	public String register(Entities en);
	public String authenticate(String emailid,String name,Class c);
	public Object search(String attribute,String value,Class c);
	

}

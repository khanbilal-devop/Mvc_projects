package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entities.Admin;
import com.spring.entities.Entities;
import com.spring.entities.Student;

@Repository
public class DaoImpl implements Dao {

	@Autowired
	HibernateTemplate hibernate;

	@Transactional
	public String register(Entities en) {
		// TODO Auto-generated method stub
		if (en instanceof Student) {
			Student st = hibernate.get(Student.class, ((Student) en).getEmailid());
			if (st == null) {
				hibernate.persist(en);
				return "Successfully Registered";
			} else
				return "Already Registered";
		} else {
			Admin ad = hibernate.get(Admin.class, ((Admin) en).getEmailid());
			if (ad == null) {
				hibernate.persist(en);
				return "Successfully Registered";
			} else
				return "Already Registered";
		}
	}

	public String authenticate(String emailid, String password, Class c) {
		// TODO Auto-generated method stub
		if (c == Student.class) {
			Student st = (Student) hibernate.get(c, emailid);
			if (st == null) {
				return "please register first";
			} else {
				if (st.getPassword().equals(password))
					return "Welcome to your profile";
				else
					return "Wrong password";
			}
		}
		else {
			Admin ad = (Admin) hibernate.get(c, emailid);
			if (ad == null) {
				return "please register first";
			} else {
				if (ad.getPassword().equals(password))
					return "Welcome to your profile";
				else
					return "Wrong password";
			}
		}

	}

	public Object search(String attribute,String value, Class c) {
		// TODO Auto-generated method stub
	    	if(c == Student.class) {
	    	    String query = "from Student where "+attribute+"=:x";
	    	   List<Entities> al=  (List<Entities>) hibernate.findByNamedParam(query,"x", value);
	    	   System.out.println("dao impl "+ al);
	    	   if (al.isEmpty())
	    		   return "No such data";
	    	   else 
	    		   return al;
	    	}
	    	else{
	    		String query = "from Admin where "+attribute+"=:x";
	    		ArrayList<Entities> al =(ArrayList <Entities>) hibernate.findByNamedParam(query, "x", value);
	    	   	   if (al == null)
		    		   return "No such data";
		    	   else 
		    		   return al;  
	    	}
    
	}

}

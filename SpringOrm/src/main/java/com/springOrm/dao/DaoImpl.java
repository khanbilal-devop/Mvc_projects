package com.springOrm.dao;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springOrm.entities.Entity;
import com.springOrm.entities.Student;
import com.springOrm.entities.Teacher;

public class DaoImpl {

	@Autowired
	HibernateTemplate hibernate;

	// this annotation is used for transaction management
	@Transactional
	public void insert(Entity en) {
		hibernate.save(en);
	}

	@Transactional
	public void update(Entity en) {
		hibernate.update(en);	
	}

	
	@Transactional
	  public void delete(Entity en) { 
		  hibernate.delete(en);
	  }
	 
	
	public  Entity fetch(int id,Class c) {
	 return	(Entity) hibernate.get(c, id);
	}

	
	@Transactional
	public ArrayList<? extends Entity> fetchAll(Class c) {
		return (ArrayList<? extends Entity>) hibernate.loadAll(c);
	}
	
	public List<? extends Entity> findByAge(String attribute) {
		List<? extends Entity> list=(ArrayList<? extends Entity>) hibernate.findByNamedParam("from Student where age=:age", "age",attribute);
		return  list;
	}
	


}

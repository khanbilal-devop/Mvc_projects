package com.spring.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entities.Student;

@Repository
public class Dao {
	HashMap<String, Object> mp = new HashMap<String, Object>();

	@Autowired
	HibernateTemplate hibernate;
    
	@Transactional
	public Object add(Student st) {
		try {
			hibernate.save(st);
			mp.put("success", null);
			return mp;
		} catch (Exception e) {
			mp.put("error", e);
			return mp;
		}

	}
    @Transactional
	public Object update(Student st) {
		try {
			hibernate.update(st);
			 mp.put("success", null);
			 return mp;
		} catch (Exception e) {
			mp.put("error", e);
			return mp;
		}
	}
    @Transactional
	public Object delete(int id) {
		try {
			Student st = hibernate.get(Student.class, id);
			hibernate.delete(st);
			mp.put("success", null);
			return mp;
		} catch (Exception e) {
			mp.put("error", e);
			return mp;
		}

	}

	public Object getAll(Class c) {
		try {
			List<Student> li = hibernate.loadAll(c);
		mp.put("success", li);
		return mp;
		} catch (Exception e) {
		mp.put("error", e);
		return mp;
		}
	}

//	public Object getById(List<Integer> li) {
//		
//		return 

//	}

}

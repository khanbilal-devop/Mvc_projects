package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.dao.Dao;
import com.spring.entities.Student;

@Service
public class StudentService {
	@Autowired
    Dao dao;
    
	public Object add(Student st) {
		return dao.add(st);
	}

	public Object update(Student st) {
		// TODO Auto-generated method stub
		return dao.update(st);
	}

	public Object delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	public Object getAll(Class cl) {
		// TODO Auto-generated method stub
		return  dao.getAll(cl);
	}
}

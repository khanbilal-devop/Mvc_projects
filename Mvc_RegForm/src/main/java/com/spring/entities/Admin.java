package com.spring.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;


@javax.persistence.Entity
public class Admin implements Entities {
	@Id
	String emailid;
    String designation;
 	String name;
 	String password;
// 	String city;
// 	String country;
// 	String state;

 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public String getPassword() {
 		return password;
 	}
 	public void setPassword(String password) {
 		this.password = password;
 	}
 	public String getEmailid() {
 		return emailid;
 	}
 	public void setEmailid(String emailid) {
 		this.emailid = emailid;
 	}
// 	public String getCity() {
// 		return city;
// 	}
// 	public void setCity(String city) {
// 		this.city = city;
// 	}
// 	public String getCountry() {
// 		return country;
// 	}
// 	public void setCountry(String country) {
// 		this.country = country;
// 	}
// 	public String getState() {
// 		return state;
// 	}
// 	public void setState(String state) {
// 		this.state = state;
// 	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	 
}

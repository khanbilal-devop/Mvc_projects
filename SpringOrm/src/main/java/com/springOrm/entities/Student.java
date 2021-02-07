package com.springOrm.entities;

import javax.persistence.Id;
import javax.persistence.Table;



@javax.persistence.Entity (name = "Student")
@Table(name = "student_info") 
public class Student extends Entity{  
	   @Id
	   int id;
	   String name;
	   String age;
	   String profession;
	   String gender;

	  public Student(String name, String age, String profession, String gender,int id) {
			this.name = name;
			this.age = age;
			this.profession = profession;
			this.gender = gender;
			this.id=id;
	}
     
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", profession=" + profession + ", gender="
				+ gender + "]";
	}
	  
}


	
	

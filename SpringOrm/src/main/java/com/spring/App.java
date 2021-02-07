package com.spring;

import com.springOrm.entities.*;

import java.util.*;

import com.springOrm.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	static ApplicationContext ctxt = new ClassPathXmlApplicationContext("Config.xml");
	DaoImpl dao;

	public static void main(String[] args) {
		// Creating an Application                                  
//		boolean status= true;
//		while (status) {
//			System.out.println("Welcome to The Application .........");
//			System.out.println("Press 1 to add ");
//			System.out.println("Press 2 to update ");
//			System.out.println("Press 3 to delete ");
//			System.out.println("Press 4 to fetch by Id  ");
//			System.out.println("Press 5 to fetchAll ");
//			System.out.println("Press 6 to exit");
//			try {
//			Scanner sc = new Scanner(System.in);
//			int i = sc.nextInt();
//			
//				switch (i) {
//				case 1:
//					break;
//				case 2:
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//				case 5:
//					break;
//				case 6: status=false;
//					break;
//				}
//			}
//				catch (Exception e) {
//					System.out.println("Invalid input");
//				}
//		}
//		System.out.println("Exited");
		//System.exit(0);
	

		App app = (App) ctxt.getBean("app");
		app.dao = ctxt.getBean("dao", DaoImpl.class);

		// Insering Students into Database
//		app.insert("student1");
//		app.insert("student2");
//		app.insert("student3");
//		app.insert("student4");
//		app.insert("student5");

		// inserting Tecahers into database
//		app.insert("teacher1");
//		app.insert("teacher2");
//		app.insert("teacher3");
//		app.insert("teacher4");
//		app.insert("teacher5");

		// updating of id-105 student
//		app.update("updatedstudent5");

		// updating teacher of 101 teacher
//		app.update("updatedteacher1");

		// deleting updated records
//		app.delete("updatedstudent5");
//		app.delete("updatedteacher1");

//		fetching single object
//		System.out.println(app.fetch(105, "Teacher"));
//		System.out.println(app.fetch(101, "Student"));

		// fetching multiple objects
//		System.out.println("All the students in database are :");
//		app.fetchAll("STudent")
//				.forEach(a -> System.out.print("Id is : " + a.getId() + " Name is : " + a.getName() + " Age is "
//						+ a.getAge() + " Gender is " + a.getGender() + " Profession is " + a.getProfession() + "\n"));
//		System.out.println("All teachers in database are :");
//		app.fetchAll("Teacher")
//				.forEach(a -> System.out.print("Id is : " + a.getId() + " Name is : " + a.getName() + " Age is "
//						+ a.getAge() + " Gender is " + a.getGender() + " Profession is " + a.getProfession() + "\n"));
		
		
		
		
	         ArrayList<? extends Entity> li = (ArrayList<? extends Entity>) app.findByAge("30");
		     System.out.println(li);

	}
	
	
	  public List<? extends Entity> findByAge(String attribute){
	          return	dao.findByAge(attribute);
	}

	ArrayList<? extends Entity> fetchAll(String className) {
		if (className.equalsIgnoreCase("student")) {
			return dao.fetchAll(Student.class);
		} else {
			return dao.fetchAll(Teacher.class);
		}
	}

	public DaoImpl getDao() {
		return dao;
	}

	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}

	void insert(String entity) {
		Entity en = ctxt.getBean(entity, Entity.class);
		dao.insert(en);
	}

	void update(String entity) {
		Entity en = ctxt.getBean(entity, Entity.class);
		dao.update(en);
	}

	Entity fetch(int id, String className) {
		if (className.equals("Student")) {
			return dao.fetch(id, Student.class);
		} else {
			return dao.fetch(id, Teacher.class);
		}
	}

	void delete(String entity) {
		Entity en = ctxt.getBean(entity, Entity.class);
		dao.delete(en);
	}

}

package com.spring;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * Hello world!
 *
 */
public class App 
{    
	 
	 HibernateTemplate hibernate;
	static ApplicationContext ctxt = new ClassPathXmlApplicationContext("config.xml");
   
	
    public static void main( String[] args )
    { System.out.println(ctxt.getBean("transactionManager"));
        
        new App().add();
        System.out.println(ctxt.getBean("transactionManager"));
} 
	@Transactional(readOnly = false)
	void add() {
		 
		  hibernate = (HibernateTemplate) ctxt.getBean("hibernateTempelate");
		 // hibernate.setCheckWriteOperations(false);
		// hibernate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		  hibernate.persist(new Teacher(101,"bilal",25));
		  hibernate.save(new Teacher(101,"bilal",25));
	      hibernate.save(new Teacher(102,"khan",25));
	      hibernate.save(new Teacher(103,"killer",25));
	      hibernate.save(new Teacher(104,"polik",35));
	      hibernate.save(new Teacher(105,"solik",35));
	      //hibernate.setCheckWriteOperations(true);
	      System.out.println("Done saving");
	}

}
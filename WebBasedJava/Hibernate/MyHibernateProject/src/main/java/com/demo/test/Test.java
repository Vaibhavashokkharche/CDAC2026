package com.demo.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.demo.model.MyUser1;

public class Test {
	
	public static void main(String[] args) {
		
		//create a connection with database using hibernate.cfg.xml file
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		//org.hibernate.SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// u1 and u2 are transiet state
		MyUser1 u1=new MyUser1(1,"Rushikesh","323232232","rr@gmail.com");
		MyUser1 u2=new MyUser1(2,"Vaibhav","65522555","vk@gmail.com");
		org.hibernate.Session session=sf.openSession();
		org.hibernate.Transaction tr= session.beginTransaction();
		//u1 and u2 are persit state
		session.persist(u1);
		session.persist(u2);
		tr.commit();
		
		
		
		
		
	}

}

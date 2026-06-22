package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Person;

public class TestJointable {
	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr= session.beginTransaction();
		com.demo.beans.Person p=new Employee(1,"Vaibhav","7218964006",23800.90,10);
		Person p1=new Customer(2,"Vaibhav","7218964006","Buldhana","Gold");
		Person p2=new Employee(3,"Rushikesh","7798722355",25000.90,20);
		Person p3=new Customer(4,"Raju","88055446616","Pune","Silver");	
		session.persist(p);
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
	   tr.commit();
	   session.close();
	}
	
	 
	

}

package com.demo.test;



import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;



public class EmpTest {
	
	
	public static void main(String[] args)  {
	  
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
	/*	Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//now the three objects is e1,e2,e3 are transiet state
        Employee e= new Employee(104,"Saavi","SDE",55000.00,LocalDate.now());
        Employee e1= new Employee(105,"Ovi","QA",35000.00,LocalDate.now());
        Employee e2= new Employee(106,"Riya","Ui",32000.00,LocalDate.now());
		//Three object in e1,e2,e3 are in persistant state;
        session.persist(e);
        session.persist(e1);
        session.persist(e2);
		tr.commit();
		session.close(); */
		
		//Retriving the data from database;
		Session session1=sf.openSession();
	
		Transaction tr1 =session1.beginTransaction();
		//by default the find method as Eager fetch (means it fire the query immidately when these line get executed);
		//Lazy fetch means it confirm the us to be object is there but not fire the query to db and wait until the object is used
		//Employee obj= session1.find(Employee.class, 101);
		Employee obj=session1.getReference(Employee.class ,104); //by default lazy fetch
		
		System.out.println(obj);
		
		
		
		
		
	}
	

}

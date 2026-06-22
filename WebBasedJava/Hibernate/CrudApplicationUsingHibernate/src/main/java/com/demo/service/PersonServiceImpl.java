package com.demo.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;
import com.demo.model.Address;
import com.demo.model.Person;


public class PersonServiceImpl implements PersonService {
	private PersonDao pdao;
	

	public PersonServiceImpl() {
	pdao=new PersonDaoImpl();
	}


	@Override
	public boolean addNewPerson() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter pid");
		int pid =sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter mobile");
		String mob= sc.next();
		Set<Address> addrset=new HashSet<>();
		String ans=null;
		do {
		System.out.println("enter aid");
		int aid=sc.nextInt();
		System.out.println("enter street");
		String street=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter state");
		String state=sc.next();
		Address addr=new Address(aid,street,city,state,null);
		addrset.add(addr);
		System.out.println("if you want to store the more address yes/no");
		 ans= sc.next();
		
		}while(ans.equals("yes"));
		
		Person p=new Person(pid,pname,mob,addrset);
		
		
		
		
		
		return pdao.save(p);
	}


	@Override
	public Person displayPersonById(int pid) {
	
		return pdao.findPersonById(pid);
	}


	@Override
	public boolean updatePerson(int pid, String pname, String mob) {
		
		return pdao.modifyById(pid,pname,mob);
	}


	@Override
	public boolean deletePersonById(int pid) {
		
		return pdao.removePersonByid(pid);
	}



	
	
	
	
	
	
	
	
	

}

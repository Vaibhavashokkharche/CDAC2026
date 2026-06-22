package com.demo.test;

import java.util.Scanner;

import com.demo.model.Person;
import com.demo.service.AddressService;
import com.demo.service.AddressServiceImpl;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;

public class TestCrudApplication {
public static void main(String[] args) {
	AddressService aservice =new AddressServiceImpl();
	 
	Scanner sc=new Scanner(System.in);
	int choice=0;
	PersonService pservice=new PersonServiceImpl();
	
	do {
		System.out.println("1. add new Person\n2. display Person\n3. update Person\n4. delete Person");
		System.out.println("5. add new Address\n6. display Address\n7. update Address\n8. delete Address");
		System.out.println("9. add existing address to existing person\n10. Remove one address from a person");
		System.out.println("11. Display all  Person\n12. Find Persons by city\n 13. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=pservice.addNewPerson();
			if(status) {
				System.out.println("Person added successfully");
			}else {
				System.out.println("Person cannot be added");
			}
		}
		case 2->{
		System.out.println("enter pid to search");
		int pid=sc.nextInt();
			Person p=pservice.displayPersonById(pid);
			if(p!=null) {
				System.out.println(p.getPname()+p.getMobile());
		}else {
				System.out.println(pid + " Person not found");
			}
		}
		case 3->{
			System.out.println("enter pid");
			int pid=sc.nextInt();
			System.out.println("enter pname");
			String pname=sc.next();
			System.out.println("enter mob");
			String mob=sc.next();
			boolean  status=pservice.updatePerson(pid,pname,mob);
			
			
		}
		case 4->{
			System.out.println("enter pid");
			int pid=sc.nextInt();
			boolean status=pservice.deletePersonById(pid);
			if(status) {
				System.out.println("Person Deleted successfully");
			}else {
				System.out.println(pid+ "cannot be added");
			}
			
			
		}
		case 5->{
			boolean status=aservice.addNewAddress();
			if(status) {
				System.out.println("Address added successfully");
			}else {
				System.out.println("Address cannot be added");
			}
			
			
		}
		case 6->{
			System.out.println("enter the aid");
			int aid =sc.nextInt();
			boolean status=aservice.displayAddress(aid);
			if(status) {
				System.out.println("Address added successfully");
			}else {
				System.out.println("Address cannot be added");
			}
			
		}
		case 7->{}
		case 8->{}
		case 9->{}
		case 10->{}
		case 11->{}
		case 12->{}
		case 13->{
			System.out.println("Thank you for visiting.........");
			sc.close();
		}
		default->{
			System.out.println("Wrong choice");
		}
		
		}
		
	}while(choice!=13);

	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}

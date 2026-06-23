package com.demo.test;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {
	

	public static void main(String[] args) {
		StudentService stservice=new StudentServiceImpl();
		int choice=0;
		
		
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1:Display All Student\n 2:SearchById\n 3:SearchByName\n 4:CalculateGpaforStudent\n 5:Exit\n Enter your choice:");
		choice=sc.nextInt();
    switch(choice) {
    case 1->{
    	List<Student> slist=stservice.getAll();
    	for(Student s:slist) {
    		System.out.println(s);
    	}
    	
    }
    case 2->{
    	System.out.println("enter id");
    	int id=sc.nextInt();
    	Student s=stservice.getById(id);
    	if(s!=null) {
    		System.out.println(s);
    	}
    	else {
    		System.out.println("Not Found");
    	}
    }
    case 3->{
    	System.out.println("enter name");
    	String nm=sc.next();
    	List<Student>slist=stservice.getbyName(nm);
    	if(slist!=null) {
    	slist.forEach(System.out::println);
    	}else {
    		System.out.println("not found");
    	}
    }
    case 4->{}
    case 5->{
    	sc.close();
    	System.out.println("Thank You for visting");
    	
    }
    default->{
    	System.out.println("opps!! Wrong Choice");
    }
    
    }
    
    
		
		
		
		
	} while (choice!=5);	
		
		

}
}
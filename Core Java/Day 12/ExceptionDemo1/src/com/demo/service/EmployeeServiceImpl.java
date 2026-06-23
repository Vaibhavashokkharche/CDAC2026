package com.demo.service;

import java.util.Scanner;

import com.demo.exceptions.InvalidSalaryException;
import com.demo.exceptions.AgeException;
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean addNewEmployee() throws InvalidSalaryException, AgeException{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enetr salary");
			double s=sc.nextDouble();
			if(s<10000) {
				     throw new InvalidSalaryException("salary shoud be > 10000");
			}
			System.out.println("enetr age");
		   int age=sc.nextInt();
		   if((age<18) || (age >60)) {
			   throw new AgeException("age should be in range 10 and 60");
		   }
			return true;
		
	}

}

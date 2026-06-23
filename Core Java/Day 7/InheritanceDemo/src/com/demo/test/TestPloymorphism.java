package com.demo.test;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class TestPloymorphism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Salaried \n 2. Contract \n 3. Vendor\n choice");
		int choice=sc.nextInt();
		Employee e=null;
		switch(choice) {
		case 1->{
			e=new SalariedEmp(12,"xxxx","4444","hr","mgr",45678);
			//System.out.println(e.calculateSal());
			System.out.println(((SalariedEmp)e).calculateBonus(0.3f));
		}
		case 2->{
			 e=new ContractEmp(12,"xxxx","4444","hr","mgr",67,4568);
		      //System.out.println(e.calculateSal());}
		}
		case 3->{
			//e=new Vendor();
			 //System.out.println(e.calculateSal());}
		}
		case 4->{
			sc.close();
			System.out.println("Thank you for visiting.........");
		}
		default->{
			System.out.println("invalid choice");
		}
		}
		//dynamic polymorphism
		 System.out.println(e.calculateSal());

	}

}

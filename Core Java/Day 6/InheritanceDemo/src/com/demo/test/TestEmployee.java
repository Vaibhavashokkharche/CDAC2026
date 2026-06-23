package com.demo.test;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		//Employee e=new Employee();
		//Employee e1=new Employee(12,"xxxx","3456","Hr","mgr");
		//System.out.println(e1);
		//System.out.println(e1.getPname());
		SalariedEmp se=new SalariedEmp(13,"yyyyy","341156","Hr","mgr",34567);
		ContractEmp ce=new ContractEmp(14,"zzzzzz","3422256","Hr","mgr",45,5678);
		System.out.println(se);
		System.out.println(se.calculateSal());
		System.out.println(se.calculateBonus(0.30f));
		System.out.println(ce);
		System.out.println(ce.calculateSal());
	}

}

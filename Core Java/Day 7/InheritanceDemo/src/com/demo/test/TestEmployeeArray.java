package com.demo.test;

import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.service.EmployeeService;
import com.demo.model.Employee;
public class TestEmployeeArray {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
	
		do {
			System.out.println("1. add new employee \n 2. delete employee\n 3. search employee by id\n4. update employee salary");
			System.out.println("5. display All\n 6. display by name\n 7. calculate net salary\n 8. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("1. SalariedEmp\n2. ContractEmp\n3.vendor");
				int ch=sc.nextInt();
				boolean status=EmployeeService.addNewEmployee(ch);
				if(status) {
					System.out.println("employee added successfully");
				}else {
					System.out.println("employee not added");
				}
			}
			case 2->{
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=EmployeeService.deleteById(id);
				if(status) {
					System.out.println("employee deleted successfully");
				}else {
					System.out.println("employee not found");
				}
			}
			case 3->{
				System.out.println("enter id");
				int id=sc.nextInt();
				Employee e=EmployeeService.findById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enetr new salary");
				double sal=sc.nextDouble();
				boolean status=EmployeeService.updateById(id,sal);
				if(status) {
					System.out.println("employee salary updated successfully");
				}else {
					System.out.println("employee not found");
				}
			}
			case 5->{
				Employee[] emparr=EmployeeService.getAll();
				for(Employee e:emparr) {
					if(e!=null) {
						  System.out.println(e);
					}else {
						break;
					}
				}
			}
			case 6->{
				System.out.println("enetr name");
				String nm=sc.next();
				Employee[] arr=EmployeeService.findByName(nm);
				if(arr!=null){
					for(Employee e:arr) {
						if(e!=null) {
							  System.out.println(e);
						}else {
							break;
						}
					}
				}
				else
					System.out.println("name not found");
			}
			case 7->{
				System.out.println("enter id");
				int id=sc.nextInt();
				double netsal=EmployeeService.findNetSalary(id);
				if(netsal!=-1) {
					  System.out.println("Net salary for "+id+ ":" +netsal);
				}else {
					System.out.println("employee not found");
				}
			}
			case 8->{
				sc.close();
				System.out.println("Thank you for visiting...............");
			}
			default->{
				  System.out.println("wrong choice");
			}
			
			}
			
		}while(choice!=8);

	}

}

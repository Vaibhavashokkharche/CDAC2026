package com.demo.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeService {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					" 1:Add new employee\n 2:Delete employee\n 3:FindByid \n 4:update employee\n 5:display All");
			System.out.println(" 6:display by name\n 7:CalculateNetSalary\n 8:Exit\n choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println(" 1:SalaryEmp\n 2:Contract Emp\n 3:VendorEmp\n choice");
				// System.out.println("enter the choice");
				int ch = sc.nextInt();
				boolean status = EmployeeService.addNewEmployee(ch);
				if (status) {
					System.out.println("emp added successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
			}
			case 2 -> {

			}
			case 3 -> {
				System.out.println("enter emid");
				int id = sc.nextInt();
				Employee e = EmployeeService.findById(id);
				if (e != null) {

					System.out.println(e);
				} else {
					System.out.println("employee not found");
				}
			}
			case 4 -> {
			}
			case 5 -> {
				Employee arr[] = EmployeeService.displayAll();
				for (Employee e : arr) {
					if (e != null) {
						System.out.println(e);
					} else {
						break;
					}
				}
			}
			case 6 -> {
				System.out.println("Enter name");
				String nm=sc.next();
				Employee arr[]=EmployeeService.displayByName(nm);
				for (Employee e : arr) {
					if(e!=null) {
						System.out.println(e);
					}
					else {
						System.out.println("no emp found");
					}
					
				}

			}
			case 7 -> {
			}
			case 8 -> {
				System.out.println("Thank you for visting! Visit Again");
				sc.close();

			}
			default -> {
				System.out.println("Please enter the valid choice");
			}
			}

		} while (choice != 8);

	}
	
	
	

}

package com.demo;

import com.demo.exceptions.AgeException;
import com.demo.exceptions.InvalidSalaryException;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestException4 {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceImpl();
        boolean status;
		try {
			       status = eservice.addNewEmployee();
			       if(status) {
			        	System.out.println("employee added");
			        }
		} catch (InvalidSalaryException|AgeException e) {
			System.out.println("employee not generated"+e.getMessage());
		} /*catch (AgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
       
	}

}

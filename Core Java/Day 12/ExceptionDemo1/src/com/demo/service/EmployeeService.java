package com.demo.service;

import com.demo.exceptions.AgeException;
import com.demo.exceptions.InvalidSalaryException;

public interface EmployeeService {

	boolean addNewEmployee() throws InvalidSalaryException, AgeException;

}

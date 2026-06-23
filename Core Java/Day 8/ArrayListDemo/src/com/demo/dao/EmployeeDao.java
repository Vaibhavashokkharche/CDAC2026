package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	boolean  save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);

}

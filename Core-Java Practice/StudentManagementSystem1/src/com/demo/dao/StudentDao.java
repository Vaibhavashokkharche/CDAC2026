package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {

	List<Student> findAll();

	Student getById(int id);

	List<Student> getByName(String nm);

}

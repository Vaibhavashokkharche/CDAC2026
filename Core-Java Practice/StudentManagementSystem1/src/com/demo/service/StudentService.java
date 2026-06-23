package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> getAll();

	Student getById(int id);

	List<Student> getbyName(String nm);

}

package com.demo.service;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService {
private StudentDao sdao;
public StudentServiceImpl() {
	this.sdao=new StudentDaoImpl();
	
}
	
	@Override
	public List<Student> getAll() {
		return sdao.findAll();
	}

	@Override
	public Student getById(int id) {
		
		return sdao.getById(id);
	}

	@Override
	public List<Student> getbyName(String nm) {
		// TODO Auto-generated method stub
		return sdao.getByName(nm);
	}

	

}

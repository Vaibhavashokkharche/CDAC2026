package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {
static List<Student> slist;

static {
	slist=new ArrayList<>();
	//Student(int id, String name, float m1, float m2, float m3)
	slist.add(new Student(101,"Vaibhav",65,75,85));
	slist.add(new Student(102,"Shubham",65,75,85));
	slist.add(new Student(103,"Prajkata",75,65,92));
	slist.add(new Student(104,"Rohini",52,72,82));
	
}

@Override
public List<Student> findAll() {
	
	return slist;
}

@Override
public Student getById(int id) {  //103
	for (Student s :slist ) {
		if(s.getId()==id) {
       return s;
			
		}
	}
	
	
	return null;
}

@Override
public List<Student> getByName(String nm) {
	List<Student> list=new ArrayList<>();
//for(int i=0;)

	
	
	return null;

}
}
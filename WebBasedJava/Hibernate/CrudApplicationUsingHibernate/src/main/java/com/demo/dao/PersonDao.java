package com.demo.dao;

import com.demo.model.Person;

public interface PersonDao {

	boolean save(Person p);

	Person findPersonById(int pid);

	boolean modifyById(int pid, String pname, String mob);

	boolean removePersonByid(int pid);

}

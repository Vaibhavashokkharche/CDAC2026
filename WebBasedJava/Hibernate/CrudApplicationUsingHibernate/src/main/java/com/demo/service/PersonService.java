package com.demo.service;

import com.demo.model.Person;

public interface PersonService {

	boolean addNewPerson();

	Person displayPersonById(int pid);

	boolean updatePerson(int pid, String pname, String mob);

	boolean deletePersonById(int pid);

}

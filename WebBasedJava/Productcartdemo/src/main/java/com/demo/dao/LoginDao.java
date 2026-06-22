package com.demo.dao;

import com.demo.model.User;

public interface LoginDao {

	User authenticateUser(String uname, String pass);

}

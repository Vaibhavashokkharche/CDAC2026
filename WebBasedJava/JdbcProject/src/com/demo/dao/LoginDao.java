package com.demo.dao;

import java.sql.Connection;

public interface LoginDao {

	String authenticate(String uname, String pwd);

	void closeConnection();



}

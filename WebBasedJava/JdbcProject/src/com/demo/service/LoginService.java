package com.demo.service;

public interface LoginService {

	String validateUser(String uname, String pwd);

	void closeConnection();

}

package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService {
     @Autowired
	private LoginDao ldao;

	 @Override
	 public MyUser ValidateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,pass);
	 }
	
	
	
	
}

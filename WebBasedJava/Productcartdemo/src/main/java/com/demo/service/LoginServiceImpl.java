package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.User;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		ldao=new LoginDaoImpl();
		
	}

	@Override
	public User validateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,pass);
	}

}

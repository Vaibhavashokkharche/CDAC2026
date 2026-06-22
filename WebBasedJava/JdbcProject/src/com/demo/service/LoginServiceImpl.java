package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;

	public LoginServiceImpl() {
		ldao=new LoginDaoImpl();
	}

	@Override
	public String validateUser(String uname, String pwd) {
		// TODO Auto-generated method stub
		return ldao.authenticate(uname,pwd);
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		ldao.closeConnection();
	}

}

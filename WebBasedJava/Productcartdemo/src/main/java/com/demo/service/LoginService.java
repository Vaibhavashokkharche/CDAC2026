package com.demo.service;

import com.demo.model.User;

public interface LoginService {

	User validateUser(String uname, String pass);

}

package com.lt.service;

import java.util.List;

import com.lt.bean.User;
import com.lt.dao.UserDao;

public class UserService implements UserServiceInterface{
	static  private UserDao userDao = new UserDao();
	
	@Override
	 public List<User> loginUsers() {
		return userDao.loginUsers();
	}

	public void createNewRegistrationScreen() {
		userDao.createRegistrationScreen(null);
	}
	 

}

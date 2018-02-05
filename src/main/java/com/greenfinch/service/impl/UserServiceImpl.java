package com.greenfinch.service.impl;

import java.sql.SQLException;

import com.greenfinch.dao.UserDao;
import com.greenfinch.service.UserService;

/**
 * UserServiceImpl
 * @author juliocesaradias
 *
 */
public class UserServiceImpl implements UserService
{
	private UserDao userDao;

	public UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException {
		return userDao.isValidUser(username, password);
	}
	
	@Override
	public boolean userRegistration(String username, String password) throws SQLException {
		return userDao.registerUser(username, password);
	}

}
package com.greenfinch.service;

import java.sql.SQLException;

/**
 * User Service Interface
 * @author juliocesaradias
 *
 */
public interface UserService {
	public boolean isValidUser(String username, String password) throws SQLException;
	public boolean userRegistration(String username, String password) throws SQLException;
}
package com.greenfinch.dao;

import java.sql.SQLException;

/**
 * DAO Interface
 * @author juliocesaradias
 *
 */
public interface UserDao {
	public boolean isValidUser(String username, String password) throws SQLException;
	public boolean registerUser(String username, String password) throws SQLException;
}

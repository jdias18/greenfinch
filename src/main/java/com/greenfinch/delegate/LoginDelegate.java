package com.greenfinch.delegate;

import java.sql.SQLException;
import com.greenfinch.service.UserService;

/**
 * Delegate
 * @author juliocesaradias
 *
 */
public class LoginDelegate
{
	private UserService userService;

	public UserService getUserService() {
		return this.userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public boolean isValidUser(String username, String password) throws SQLException {
	    return userService.isValidUser(username, password);
	}
	
	public boolean userRegistration(String username, String password) throws SQLException {
	    return userService.userRegistration(username, password);
	}
}
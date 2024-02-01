package com.rmsc.auth;
//2.Login class
public class Login {

	private String username;

	private String password;

	private boolean isAuthenticated;

	public Login(String username, String password) {

		this.username = username;

		this.password = password;

		this.isAuthenticated = false;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean authenticate(String enteredUsername, String enteredPassword) {

		if (enteredUsername.equals(username) && enteredPassword.equals(password)) {

			isAuthenticated = true;

			return true;

		} else {

			isAuthenticated = false;

			return false;

		}

	}

	public boolean isAuthenticated() {

		return isAuthenticated;

	}

}
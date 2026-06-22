package com.demo.model;

public class User {
	private String username;
	private String Password;
	private String role;

	public User() {
		super();
	}

	public User(String username, String password, String role) {
		super();
		this.username = username;
		Password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", Password=" + Password + ", role=" + role + "]";
	}

}

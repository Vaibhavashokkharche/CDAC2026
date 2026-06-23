package com.demo.beans;

public class MyUser {
	private String username;
	private String role;

	public MyUser() {
		super();
	}

	public MyUser(String username, String role) {
		super();
		this.username = username;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", role=" + role + "]";
	}

}

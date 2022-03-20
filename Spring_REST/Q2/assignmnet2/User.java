package com.springboot.assignmnet2;

public class User {
	private String username;
	private String Password;
	public User(String username, String password) {
		super();
		this.username = username;
		Password = password;
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", Password=" + Password + "]";
	}
	

}

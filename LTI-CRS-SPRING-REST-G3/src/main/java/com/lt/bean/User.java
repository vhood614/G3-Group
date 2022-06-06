package com.lt.bean;

import java.util.Date;

public class User {

	private Long Id;
	private String name;
	private String password;
	private String username;
	private String role;
	
	public User() {
		
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(Long id, String name, String password, String username, String role) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
		this.username = username;
		this.role = role;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", password=" + password + ", username=" + username + ", role="
				+ role + "]";
	}

}

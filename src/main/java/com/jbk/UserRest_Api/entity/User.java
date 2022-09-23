package com.jbk.UserRest_Api.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private int id;
	private String username;
	private String password;
	private String gender;
	private String role;
	private String email;
	public User(int id,String username, String password, String gender, String role, String email) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ",username=" + username + ", password=" + password + ", gender=" + gender + ", role=" + role
				+ ", email=" + email + "]";
	}
	

}

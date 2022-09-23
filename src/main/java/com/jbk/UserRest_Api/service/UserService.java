package com.jbk.UserRest_Api.service;

import java.util.List;

import com.jbk.UserRest_Api.entity.User;

public interface UserService {
	
	public List<User> saveUser();
	public User getUserByUserId(int userId);
	public User addUser(User user);
	
	public User updateUser(User user);
	
}

package com.jbk.UserRest_Api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.UserRest_Api.entity.User;
import com.jbk.UserRest_Api.service.UserService;

@RestController
public class UserController {
	// all Mapping
	
	@Autowired
	private UserService userService;
	
	
//	@GetMapping(value="/home")
//	public String home() {
//		
//		return "Welcome to User Application";
//		
//	}
	
	// Get all Users
	@GetMapping(value="/allUser")
	public List<User> saveUser(){
		
		
		return this.userService.saveUser();
		
	}
	
	// get user using id							
	@GetMapping(value="/user/{userId}")//for to get value using @Pathvariable
	public User getUserByUserId(@PathVariable String userId) {
		
		return this.userService.getUserByUserId(Integer.parseInt(userId));
		 
	}
	
	// add user
	@PostMapping(value="/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
		
	}
	
	//update user using put request
	@PutMapping(value="/updateUser")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
		
	}
	
	
	
	
		
}


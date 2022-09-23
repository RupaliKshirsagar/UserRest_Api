package com.jbk.UserRest_Api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbk.UserRest_Api.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list;
	
	public UserServiceImpl() {
		list=new ArrayList<>();
		list.add(new User(1,"Rupali","r123","Female","SoftDeveloper","rupali@gmail.com"));
		list.add(new User(2,"Ishita","i123","Female","SoftEngg","Ishita@gmail.com"));
	}
	
	@Override
	public List<User> saveUser() {
		
		return list;
	}

	@Override
	public User getUserByUserId(int userId) {
		User usr=null;
		for (User user : list) {
			if(user.getId()==userId) {
				usr=user;
				break;
			}
		}
		return usr;
	}

	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		list.forEach(e ->{          
			if(e.getId()==user.getId()) {
				e.setUsername(user.getUsername());
				e.setPassword(user.getPassword());
				e.setEmail(user.getEmail());
				e.setRole(user.getRole());
			}
		});
		
		return user;
	}

	
}

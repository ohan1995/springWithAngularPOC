package com.gaurav.myapp.service;

import java.util.List;

import com.gaurav.myapp.model.User;

public interface UserService {
	
	public boolean save(User user);
	
	public List<User> getUser();
}

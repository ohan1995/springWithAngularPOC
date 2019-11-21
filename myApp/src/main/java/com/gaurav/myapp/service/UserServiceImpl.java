package com.gaurav.myapp.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.myapp.model.User;
import com.gaurav.myapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userDao;
	
	@Override
	public boolean save(User user) {
		System.out.println("Before Insertion");
		
		try {
			userDao.save(user);
			return true;
		}catch(Exception ex) {
			System.out.println("Exception Occur");
			return false;
		}
	}

	@Override
	public List<User> getUser() {
		return userDao.findAll();
	}

}

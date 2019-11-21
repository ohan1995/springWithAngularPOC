package com.gaurav.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.myapp.model.User;
import com.gaurav.myapp.service.LoginService;
import com.gaurav.myapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public boolean saveUser(@RequestBody User user) {
		boolean flag = service.save(user);
		return flag;
	}
	
	@ResponseBody
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public int checkUser(String username, String password) {
		int user = loginService.checkLogin(username, password);
		return user;
	}
	
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public List<User> getUser() {
		return service.getUser();
	}
	
}

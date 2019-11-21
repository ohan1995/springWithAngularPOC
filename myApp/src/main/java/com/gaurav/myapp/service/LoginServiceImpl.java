package com.gaurav.myapp.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.myapp.model.User;
import com.gaurav.myapp.repository.UserRepository;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userDao;
	
	@Override
	public int checkLogin(String username, String password) {
		List<User> userData = userDao.findAll();
		
		for (Object result : userData) {
			@SuppressWarnings("rawtypes")
			HashMap map = (HashMap) result;
            
            for (Object key : map.keySet()) {
                System.out.print(key + " = " + map.get(key) + "; ");
                
                // if any usrename is equal to the entered usrname from DB then it will return 1 else 0
                if(username.equals(map.get(key)) && password.equals(map.get(key))){
                	return 1;
                }
            }
            System.out.println();
        }
		return 0;
	}
}

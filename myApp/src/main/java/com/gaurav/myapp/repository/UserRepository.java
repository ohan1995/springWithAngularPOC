package com.gaurav.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gaurav.myapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select username,password from user")
	public List<User> findUsernameAndPassword();
}

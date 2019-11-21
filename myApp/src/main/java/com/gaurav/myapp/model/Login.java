package com.gaurav.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "login")
public class Login {
	
	@Id
	private int id;
	private String username;
	private String password;
}

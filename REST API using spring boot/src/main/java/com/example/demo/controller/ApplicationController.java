package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;



@RestController
public class ApplicationController {
	@Autowired
	UserRepository repo;
	
	@PostMapping("/register")
	public User addUser( User user)
	{
		repo.save(user);
		return user;
	}

}

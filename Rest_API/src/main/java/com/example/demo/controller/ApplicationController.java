package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.UserAuthenticationService;
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
	
	
	@NonNull
	  UserAuthenticationService authentication;
	
	@GetMapping("/login")
	public String login(@RequestParam ("username") String username, @RequestParam("password") String password) {
		return authentication
			      .login(username, password)
			      .orElseThrow(() -> new RuntimeException("invalid login and/or password"));
	}
	
	
	
	
	    
	

}

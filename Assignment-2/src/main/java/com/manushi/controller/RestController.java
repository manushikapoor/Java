package com.manushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manushi.model.User;
import com.manushi.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "this is home page";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String name,@RequestParam String address,@RequestParam int phone,@RequestParam String email, @RequestParam String exp) {
		User user=new User(name,address,phone,email,exp);
		userService.saveMyUser(user);
		return "User Saved";
	}

}

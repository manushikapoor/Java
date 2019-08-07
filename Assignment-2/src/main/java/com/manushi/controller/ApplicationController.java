package com.manushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	
	@RequestMapping("/welcome")
public String Welcome() {
	return "welcomepage";
}
	@RequestMapping("/register")
	public String registration() {
		return "welcomepage";
	}
}

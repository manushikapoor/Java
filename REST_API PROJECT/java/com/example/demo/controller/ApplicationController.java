package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.MyUserDetailsService;
import com.example.demo.config.UserValidator;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.resetpassword.EnterOtp;
import com.example.demo.sendmail.SendMail;

@RestController
public class ApplicationController {

	@Autowired
	UserRepository repo;
	@Autowired
	private UserValidator userValidator;

	@PostMapping("/register")
	public String addUser(User user, BindingResult bindingResult) {
		if (!repo.existsByUsername(user.getUsername())) {
			userValidator.validate(user, bindingResult);
			if (bindingResult.hasErrors()) {
				return "Fill out all the fields";
			}
			repo.save(user);
			return "successfully registered";
		} else
			return "username already exists";
	}

	@NonNull
	MyUserDetailsService myuser;

	@GetMapping("/login")
	public  UserDetails login(@RequestParam("username") String username, @RequestParam("password") String password) {
		return myuser.loadUserByUsername(username);
		
	}

	@Autowired
	private SendMail sendmail;

	@RequestMapping(value = "/forgot", method = RequestMethod.POST)
	public String MailSender(@RequestParam("email") String userEmail) {
		if (sendmail.sendMail(userEmail)) {
			return "An otp has been sent to " + userEmail;
		} else
			return "We didn't find an account for that e-mail address.";
	}

	@Autowired
	private EnterOtp resetPassword;

	@RequestMapping(value = "/reset", method = RequestMethod.POST)
	public String resetPassword(@RequestParam("token") String token, @RequestParam("password") String password) {
		if (resetPassword.reset(token)) {
			resetPassword.newPassword(password);
			return "Correct OTP, new password set successfully";
		} else
			return "That is an invalid OTP";
	}

}

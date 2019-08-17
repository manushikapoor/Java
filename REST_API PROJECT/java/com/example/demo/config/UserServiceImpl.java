package com.example.demo.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public Optional findUserByResetToken(String resetToken) {
		return userRepository.findByResetToken(resetToken);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}
}



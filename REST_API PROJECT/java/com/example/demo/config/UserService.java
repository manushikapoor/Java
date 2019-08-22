package com.example.demo.config;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
@Transactional
public interface UserService {
	public Optional<User> findUserByEmail(String email);

	public Optional<User> findUserByResetToken(String resetToken);

	public void save(User user);
}
package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);

	Optional<User> findByEmail(String email);

	Optional<User> findByResetToken(String resetToken);

	boolean existsByUsername(String username);
}

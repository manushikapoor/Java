package com.example.config;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.model.User;



public interface UserService {
    public Optional<User> findUserByEmail(String email);
    public Optional<User> findUserByResetToken(String resetToken);
    public void save(User user);
}
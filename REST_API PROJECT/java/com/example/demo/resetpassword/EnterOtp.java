package com.example.demo.resetpassword;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.config.UserService;
import com.example.demo.model.User;

@Service
@Transactional
public class EnterOtp {

	@Autowired
	private UserService userService;

	@Autowired
	User user;

	public boolean reset(@RequestParam("token") String token) {
		Optional<User> user = userService.findUserByResetToken(token);

		if (user.isPresent()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean newPassword(@RequestParam("password") String password) {
		user.setPassword(password);
		user.setResetToken(null);
		userService.save(user);
		return true;
	}

}

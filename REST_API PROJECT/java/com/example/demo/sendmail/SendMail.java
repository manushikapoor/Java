package com.example.demo.sendmail;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.config.EmailService;
import com.example.demo.config.UserService;
import com.example.demo.model.User;
import com.example.demo.otp.OtpGenerator;

@Service
@Transactional
public class SendMail {

	@Autowired
	private UserService userService;

	@Autowired
	private EmailService emailService;

	public boolean sendMail(@RequestParam("email") String userEmail) {
		Optional<User> optional = userService.findUserByEmail(userEmail);
		if (!optional.isPresent()) {
			return false;
		} else {

			OtpGenerator otpg = new OtpGenerator();
			User user = optional.get();
			String otp = otpg.generateOTP();
			user.setResetToken(otp);

			userService.save(user);

			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
			passwordResetEmail.setFrom("${spring.mail.username}");
			passwordResetEmail.setTo(user.getEmail());
			passwordResetEmail.setSubject("Password Reset Request");
			passwordResetEmail.setText("To reset your password,fill the otp - " + user.getResetToken());

			emailService.sendEmail(passwordResetEmail);

			return true;

		}
	}
}
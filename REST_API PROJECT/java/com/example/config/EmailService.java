package com.example.config;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	public void sendEmail(SimpleMailMessage email);
}

package com.example.demo.config;

import javax.transaction.Transactional;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
@Service
@Transactional
public interface EmailService {

	public void sendEmail(SimpleMailMessage email);
}

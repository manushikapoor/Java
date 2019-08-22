package com.example.demo.config;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.example.demo.model.User;

@Component
public class UserValidator implements Validator {

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (user.getUsername().length() < 6) {
			errors.rejectValue("username", "Username cannot be less than 6 characters");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getPassword().length() < 8) {
			errors.rejectValue("password", "password cannot be less than 8 characters");
		}

		ValidationUtils.rejectIfEmpty(errors, "email", "NotEmpty", "Provide an email");

	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.equals(clazz);
	}
}

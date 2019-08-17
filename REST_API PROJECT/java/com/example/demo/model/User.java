package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="rest_api")
public class User {
	
	@Id
	@Column(name="username")
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name = "reset_token")
	private String resetToken;
	
	public String getResetToken() {
		return resetToken;
	}
	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
	
	public User() {
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + username + ",  email=" + email + ", password=" + password
				+ "]";
	}
	
	
	

}
package com.manushi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="java2")
public class User {
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="exp")
	private String exp;
	
	
	public User(String name, String address, int phone, String email, String exp) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", exp=" + exp
				+ "]";
	}
	
	
	

}

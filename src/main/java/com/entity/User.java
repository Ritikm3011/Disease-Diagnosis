package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String bloodGroup;
	private String gender;
	private String password;
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String email, String phone, String dob, String bloodGroup, String gender,
			String password, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.password = password;
		this.address = address;
	}

	public User(String name, String email, String phone, String dob, String bloodGroup, String gender, String password,
			String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.password = password;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

package com.login.loginReg.beans;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int e_id;
	
	@NotEmpty
	@Column
	private String e_name;
	
	@NotEmpty
	@Column
	private String e_dob;
	
	@NotEmpty
	@Column
	private String e_gender;

	@NotEmpty
	@Column
	private String e_address;
	
	@NotEmpty
	@Column
	private String e_city;
	
	@NotEmpty
	@Column
	private String e_state;
	
	@NotEmpty
	@Column
	private String e_loginId;
	
	@NotEmpty
	@Column
	private String e_password;
	
	//setters And getters

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_dob() {
		return e_dob;
	}

	public void setE_dob(String e_dob) {
		this.e_dob = e_dob;
	}

	public String getE_gender() {
		return e_gender;
	}

	public void setE_gender(String e_gender) {
		this.e_gender = e_gender;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

	public String getE_city() {
		return e_city;
	}

	public void setE_city(String e_city) {
		this.e_city = e_city;
	}

	public String getE_state() {
		return e_state;
	}

	public void setE_state(String e_state) {
		this.e_state = e_state;
	}

	public String getE_loginId() {
		return e_loginId;
	}

	public void setE_loginId(String e_loginId) {
		this.e_loginId = e_loginId;
	}

	public String getE_password() {
		return e_password;
	}

	public void setE_password(String e_password) {
		this.e_password = e_password;
	}
	

	
	
	
	
}

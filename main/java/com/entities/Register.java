package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registration")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String email;
	private String password;
	private String rep_pasword;
	
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRep_pasword() {
		return rep_pasword;
	}
	public void setRep_pasword(String rep_pasword) {
		this.rep_pasword = rep_pasword;
	}
	public Register( String name, String email, String password, String rep_pasword) {
		super();
		//this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.rep_pasword = rep_pasword;
	}
	public Register(String name, long phone, String password, String rep_pasword) {
		super();
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.rep_pasword = rep_pasword;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.home.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;
	
	public LoginBean(){}
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

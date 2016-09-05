package com.korea.dto;

public class Receiver {
	private String email;
	private String regno;
	private String tempPwd; 

	public Receiver(String email, String regno, String tempPwd) {
		this.email = email;
		this.regno = regno;
		this.tempPwd = tempPwd;
	}
	
	public String getEmail() {
		return email;
	}

	public String getRegno() {
		return regno;
	}

	public String getTempPwd() {
		return tempPwd;
	}

	
	
}

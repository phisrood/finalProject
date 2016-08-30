package com.korea.dto;

public class Receiver {
	private String email;
	private String regno;

	public Receiver(String email, String regno) {
		this.email = email;
		this.regno = regno;
	}
	
	public String getEmail() {
		return email;
	}

	public String getRegno() {
		return regno;
	}

	
}

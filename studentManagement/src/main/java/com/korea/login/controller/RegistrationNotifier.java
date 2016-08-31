package com.korea.login.controller;

import com.korea.dto.Receiver;


public interface RegistrationNotifier {
	
	public void sendMail(Receiver member);

}

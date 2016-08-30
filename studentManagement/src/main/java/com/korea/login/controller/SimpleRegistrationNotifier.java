package com.korea.login.controller;


import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.korea.dto.Receiver;

public class SimpleRegistrationNotifier implements RegistrationNotifier {

	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public void sendMail(Receiver member) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("[Simple] 회원 가입 안내");
		message.setFrom("hdh2688@naver.com");
		message.setText("회원 가입을 환영합니다.");
		message.setTo(member.getEmail());
		try {
			mailSender.send(message);
		} catch (MailException ex) {
			ex.printStackTrace();
		}

	}
}

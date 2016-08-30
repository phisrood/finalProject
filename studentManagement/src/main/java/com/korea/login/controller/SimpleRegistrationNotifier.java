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
		message.setSubject("[한국대학교 학사관리팀] 비밀번호 초기화 안내");
		message.setFrom("hdh2688@naver.com");
		message.setText("비밀번호 초기화 안내");
		message.setText("회원님의 주민번호 앞자리("+member.getRegno()+")로 비밀번호가 초기화 되었습니다.");
		message.setTo(member.getEmail());
		try {
			mailSender.send(message);
		} catch (MailException ex) {
			ex.printStackTrace();
		}

	}
}

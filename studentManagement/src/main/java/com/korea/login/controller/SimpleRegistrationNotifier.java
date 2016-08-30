package com.korea.login.controller;


import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.korea.dto.Receiver;

public class SimpleRegistrationNotifier implements RegistrationNotifier {

	private JavaMailSender mailSender;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public void sendMail(Receiver member) {
		MimeMessage message = mailSender.createMimeMessage();
		try{
			message.setSubject("[한국대학교 학사관리팀] 비밀번호 초기화 안내", "utf-8");
			//String htmlContent = "회원님의 주민번호 앞자리("+member.getRegno()+")로 비밀번호가 초기화 되었습니다.";
			//String htmlContent = "<a href='localhost/common/loginForm'>ttt</a>";
			String htmlContent = "주민번호 앞자리로 비밀번호초기화완료";
			message.setText(htmlContent, "utf-8", "html");
			message.setFrom(new InternetAddress("hdh2688@naver.com"));
			message.addRecipient(RecipientType.TO, new InternetAddress(member.getEmail()));
			mailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

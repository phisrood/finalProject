package com.korea.login.controller;


import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

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
			message.setSubject("[한국대학교 학사관리팀] 임시비밀번호 초기화 안내", "utf-8");
			String htmlContent = "임시비밀번호(   <strong>"+member.getTempPwd()+"</strong>   ) 되었습니다.";
			message.setText(htmlContent, "utf-8", "html");
			message.setFrom(new InternetAddress("hdh2688@naver.com"));
			message.addRecipient(RecipientType.TO, new InternetAddress(member.getEmail()));
			mailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

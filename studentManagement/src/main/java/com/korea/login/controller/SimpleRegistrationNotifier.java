package com.korea.login.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 비밀번호 찾기 메일발송 소스코드
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.06.   한돈희                  개발완료
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */

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
	
	/**
	 * 메일발송 코드
	 * @param member
	 * @return void
	 */
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

package com.korea.login.controller;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.korea.dto.ProfessorVO;
import com.korea.dto.Receiver;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;

public class MailSenderMain {

	public static void sendMailInfoStu(StudentVO studentVO) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
			= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(studentVO.getStud_email()));
		
		ctx.close();

	}
	public static void sendMailInfoPro(ProfessorVO professorVO) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(professorVO.getPro_email()));
		
		ctx.close();
		
	}
	public static void sendMailInfoEmp(School_PersonVO school_PersonVO) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(school_PersonVO.getSp_email()));
		
		ctx.close();
		
	}
}

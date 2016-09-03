package com.korea.login.controller;


import org.springframework.context.support.GenericXmlApplicationContext;

import com.korea.dto.ProfessorVO;
import com.korea.dto.Receiver;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;

public class MailSenderMain {

	public static void sendMailInfoStu(StudentVO studentVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
			= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(studentVO.getStud_email(), studentVO.getStud_regno1(), tempPwd));
		
		ctx.close();

	}
	public static void sendMailInfoPro(ProfessorVO professorVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(professorVO.getPro_email(), professorVO.getPro_regno1(), tempPwd));
		
		ctx.close();
		
	}
	public static void sendMailInfoEmp(School_PersonVO school_PersonVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(school_PersonVO.getSp_email(), school_PersonVO.getSp_regno1(), tempPwd));
		
		ctx.close();
		
	}
}

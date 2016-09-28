package com.korea.login.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 메일발송 메인
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

import org.springframework.context.support.GenericXmlApplicationContext;

import com.korea.dto.ProfessorVO;
import com.korea.dto.Receiver;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;

public class MailSenderMain {

	/**
	 * 메일발송(학생)
	 * @param studentVO, tempPwd
	 * @return void
	 */
	public static void sendMailInfoStu(StudentVO studentVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
			= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(studentVO.getStud_email(), studentVO.getStud_regno1(), tempPwd));
		
		ctx.close();

	}
	/**
	 * 메일발송(교수)
	 * @param professorVO, tempPwd
	 * @return void
	 */
	public static void sendMailInfoPro(ProfessorVO professorVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(professorVO.getPro_email(), professorVO.getPro_regno1(), tempPwd));
		
		ctx.close();
		
	}
	/**
	 * 메일발송(행정)
	 * @param school_PersonVO, tempPwd
	 * @return void
	 */
	public static void sendMailInfoEmp(School_PersonVO school_PersonVO, String tempPwd) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:config-mail.xml");
		
		SimpleRegistrationNotifier simpleNotifier 
		= ctx.getBean("simpleNotifier", SimpleRegistrationNotifier.class);
		simpleNotifier.sendMail(new Receiver(school_PersonVO.getSp_email(), school_PersonVO.getSp_regno1(), tempPwd));
		
		ctx.close();
		
	}
}

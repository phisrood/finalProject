package com.korea.login.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 메일발송 Interface
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
import com.korea.dto.Receiver;


public interface RegistrationNotifier {
	/**
	 * 메일발송
	 * @param member
	 * @return void
	 */
	public void sendMail(Receiver member);

}

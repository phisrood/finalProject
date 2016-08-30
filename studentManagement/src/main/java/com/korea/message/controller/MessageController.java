package com.korea.message.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.dto.MessageVO;
import com.korea.dto.UsersVO;
import com.korea.message.service.MessageService;

@Controller
public class MessageController {
	
	@Autowired
	MessageService service;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지함 리스트 더보기 출력 제이쿼리구현
	@RequestMapping(value={"/stu/messageAllList","/pro/messageAllList","/emp/messageAllList"}, method=RequestMethod.GET)
	public String messageAllList(){
		String url="/common/messageAllList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지조회
	@RequestMapping(value="/stu/messageInfo", method=RequestMethod.GET)
	public String messageInfo(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수신사용자검색
	@RequestMapping(value="/common/messageUserSearch", method=RequestMethod.GET)
	public String messageUserSearch(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지발신
	@RequestMapping(value="/common/messageSend", method=RequestMethod.GET)
	public String messageSend(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지삭제
	@RequestMapping(value="/common/messageDelete", method=RequestMethod.GET)
	public String messageDelete(){
		String url="";
		
		return url;
	}
}

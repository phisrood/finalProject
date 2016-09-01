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
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
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
	//쪽지함 리스트 더보기 출력
	@RequestMapping(value={"/stu/messageAllList","/pro/messageAllList","/emp/messageAllList"}, method=RequestMethod.GET)
	public String messageAllList(HttpSession session, Model model){
		String url="/common/messageAllList";
		
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String id = usersVO.getUse_id();
		List<MessageVO> messageAllList = null;
		if(id.equals("")){
			url="redirect:/common/loginForm";
		}else{
			messageAllList = service.getMessageAllList(id);
		}
		model.addAttribute("messageAllList", messageAllList);
		model.addAttribute("id",id);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//받은쪽지조회
	@RequestMapping(value="/common/messageSendInfo", method=RequestMethod.GET)
	public void messageSendInfo(@RequestParam(value="message_no")String message_no,
			HttpServletResponse response){
		
		MessageVO messageInfo = service.updateMessageInfo(message_no);
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(messageInfo);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	//보낸쪽지조회
	@RequestMapping(value="/common/messageReciveInfo", method=RequestMethod.GET)
	public void messageReciveInfo(@RequestParam(value="message_no")String message_no,
			HttpServletResponse response){
		
		MessageVO messageInfo = service.getMessageInfo(message_no);
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(messageInfo);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수신사용자검색
	@RequestMapping(value="/common/messageUserSearchForm", method=RequestMethod.GET)
	public String messageUserSearchForm(){
		String url="/common/messageMemberSearch";
		
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
	public void messageUserSearch(Model model, HttpServletResponse response){
		
		List<MessageViewVO> usersList = service.getMessageUserSearch();
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(usersList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지발신
	@RequestMapping(value={"/stu/messageSend","/pro/messageSend", "/emp/messageSend", "/common/messageSend"}, method=RequestMethod.POST)
	public String messageSend(MessageVO messageVO, HttpSession session){
		String url="redirect:/common/error";
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		messageVO.setMes_send_use_id(loginUser.getUse_id());
		service.insertMessage(messageVO);
		if(loginUser.getAuthority().equals("ROLE_STU")){
			url = "redirect:/stu/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_PRO")){
			url = "redirect:/pro/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_EMP")){
			url = "redirect:/emp/messageAllList";
		}
		
		
		return url;
	}
	/**
	 * 쪽지삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//받은쪽지삭제
	@RequestMapping(value="/common/messageSendDelete", method=RequestMethod.GET)
	public String messageSendDelete(@RequestParam(value="message_no", defaultValue="")int message_no,
								@RequestParam(value="delyn")String delyn,
								HttpSession session){
		String url="redirect:/common/error";
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		
		service.updateSendMessageDel(message_no, delyn);
		
		if(loginUser.getAuthority().equals("ROLE_STU")){
			url = "redirect:/stu/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_PRO")){
			url = "redirect:/pro/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_EMP")){
			url = "redirect:/emp/messageAllList";
		}
		return url;
	}
	/**
	 * 쪽지삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//보낸쪽지삭제
	@RequestMapping(value="/common/messageReciveDelete", method=RequestMethod.GET)
	public String messageReciveDelete(@RequestParam(value="message_no", defaultValue="")int message_no,
			@RequestParam(value="delyn")String delyn,
			HttpSession session){
		String url="redirect:/common/error";
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		
		service.updateReciveMessageDel(message_no, delyn);
		
		if(loginUser.getAuthority().equals("ROLE_STU")){
			url = "redirect:/stu/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_PRO")){
			url = "redirect:/pro/messageAllList";
		}else if(loginUser.getAuthority().equals("ROLE_EMP")){
			url = "redirect:/emp/messageAllList";
		}
		return url;
	}
	/**
	 * 쪽지답장폼
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지답장
	@RequestMapping(value="/common/messageReplyForm", method=RequestMethod.GET)
	public String messageReplyForm(String send, Model model, HttpSession session){
		String url="/common/messageReply";
		
		session.setAttribute("loginUser",session.getAttribute("loginUser"));

		model.addAttribute("send", send);
		return url;
	}
}

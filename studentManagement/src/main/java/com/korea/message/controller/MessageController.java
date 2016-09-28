package com.korea.message.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 메시지 컨트롤러
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	한돈희        		최초생성
 *    2016.09.11.   한돈희			개발완료
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import java.io.IOException;
import java.io.PrintWriter;
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
	 * 메시지 전체리스트
	 * @param session, model
	 * @return String
	 */
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
	 * 받은쪽지조회
	 * @param message_no, response
	 * @return void
	 */
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
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 보낸쪽지조회
	 * @param message_no, response
	 * @return void
	 */
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
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 메시지 수신 사용자 검색폼
	 * @return String
	 */
	@RequestMapping(value="/common/messageUserSearchForm", method=RequestMethod.GET)
	public String messageUserSearchForm(){
		String url="/common/messageMemberSearch";
		
		return url;
	}
	/**
	 * 메시지 수신 사용자 검색 리스트
	 * @param model, response
	 * @return void
	 */
	@RequestMapping(value="/common/messageUserSearch", method=RequestMethod.GET)
	public void messageUserSearch(Model model, HttpServletResponse response){
		
		List<MessageViewVO> usersList = service.getMessageUserSearch();
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(usersList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 메시지 발신
	 * @param messageVO, session
	 * @return String
	 */
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
	 * 보낸 메시지 삭제
	 * @param message_no, delyn, session
	 * @return String
	 */
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
	 * 받은 메시지 삭제
	 * @param message_no, delyn, session
	 * @return String
	 */
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
	 * 받은 메시지 체크박스 선택삭제
	 * @param session, mes_no
	 * @return String
	 */
	@RequestMapping(value={"/stu/messageSendChkDel","/pro/messageSendChkDel", "/emp/messageSendChkDel"}, method=RequestMethod.POST)
	public String messageSendChkDel(HttpSession session, @RequestParam("sendChk")String[] mes_no){
		String url="redirect:/common/error";
		MessageVO messageVO = new MessageVO();
		String mes_delyn = "";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		for (int i = 0; i < mes_no.length; i++) {
			messageVO = service.getMessageInfo(mes_no[i]);
			mes_delyn = messageVO.getMes_delyn();
			service.updateSendMessageDel(Integer.parseInt(mes_no[i]), mes_delyn);
			
		}
		
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
	 * 보낸 메시지 체크박스 선택삭제
	 * @param session, mes_no
	 * @return String
	 */
	@RequestMapping(value={"/stu/messageReciveChkDel","/pro/messageReciveChkDel", "/emp/messageReciveChkDel"}, method=RequestMethod.POST)
	public String messageReciveChkDel(HttpSession session, @RequestParam("reciveChk")String[] mes_no){
		String url="redirect:/common/error";
		MessageVO messageVO = new MessageVO();
		String mes_delyn = "";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		for (int i = 0; i < mes_no.length; i++) {
			messageVO = service.getMessageInfo(mes_no[i]);
			mes_delyn = messageVO.getMes_delyn();
			service.updateReciveMessageDel(Integer.parseInt(mes_no[i]), mes_delyn);
			
		}
		
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
	 * 메시지 답장 폼
	 * @param send, model, session
	 * @return String
	 */
	@RequestMapping(value="/common/messageReplyForm", method=RequestMethod.GET)
	public String messageReplyForm(String send, Model model, HttpSession session){
		String url="/common/messageReply";
		
		session.setAttribute("loginUser",session.getAttribute("loginUser"));

		model.addAttribute("send", send);
		return url;
	}
	
	/**
	 * 메시지 답장 
	 * @param messageVO, session, response
	 * @return void
	 */
	@RequestMapping(value="/common/messageReplySend", method=RequestMethod.POST)
	public void messageReplySend(MessageVO messageVO, HttpSession session, HttpServletResponse response){
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		messageVO.setMes_send_use_id(loginUser.getUse_id());
		service.insertMessage(messageVO);

		PrintWriter out;
		try {
			out = response.getWriter();
			out.print("<script> window.close();</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

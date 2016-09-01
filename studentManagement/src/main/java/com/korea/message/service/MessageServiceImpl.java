package com.korea.message.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;
import com.korea.message.dao.MessageDAO;

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
@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageDAO dao;
	/**
	 * 새로운 안읽은 쪽지 출력
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageVO> getMessageNewList(UsersVO usersVO) {
		return dao.getMessageNewList(usersVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageVO> getMessageAllList(String id) {
		// TODO Auto-generated method stub
		return dao.getMessageAllList(id);
		
	}
	/**
	 * 쪽지조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public MessageVO updateMessageInfo(String message_no) {
		
		//수신 완료
		dao.updateMessageRead(message_no);
		//정보가져오기
		MessageVO messageVO = dao.getMessageInfo(message_no);
		
		return messageVO;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageViewVO> getMessageUserSearch() {
		return dao.getMessageUserSearch();
	}
	/**
	 * 쪽지발신
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertMessage(MessageVO messageVO) {
		dao.insertMessage(messageVO);
	}
	/**
	 * 받은쪽지삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateSendMessageDel(int message_no, String delyn) {
		String mes_delyn = "";
		MessageVO messageVO = new MessageVO();
		if(delyn.equals("1")){
			mes_delyn = "2";
			messageVO.setMes_no(message_no);
			messageVO.setMes_delyn(mes_delyn);
			dao.updateMessageDel(messageVO);
		}else if(delyn.equals("3")){
			mes_delyn = "4";
			messageVO.setMes_no(message_no);
			messageVO.setMes_delyn(mes_delyn);
			dao.updateMessageDel(messageVO);
		}
		
		
	}
	/**
	 * 보낸쪽지삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateReciveMessageDel(int message_no, String delyn) {
		String mes_delyn = "";
		MessageVO messageVO = new MessageVO();
		if(delyn.equals("1")){
			mes_delyn = "3";
			messageVO.setMes_no(message_no);
			messageVO.setMes_delyn(mes_delyn);
			dao.updateMessageDel(messageVO);
		}else if(delyn.equals("2")){
			mes_delyn = "4";
			messageVO.setMes_no(message_no);
			messageVO.setMes_delyn(mes_delyn);
			dao.updateMessageDel(messageVO);
		}
		
		
	}
	/**
	 * 보낸쪽지조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public MessageVO getMessageInfo(String message_no) {
		return dao.getMessageInfo(message_no);
	}

	

}

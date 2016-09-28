package com.korea.message.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;
import com.korea.message.dao.MessageDAO;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageDAO dao;

	@Override
	public List<MessageVO> getMessageNewList(UsersVO usersVO) {
		return dao.getMessageNewList(usersVO);
	}
	@Override
	public List<MessageVO> getMessageAllList(String id) {
		return dao.getMessageAllList(id);
		
	}
	@Override
	public MessageVO updateMessageInfo(String message_no) {
		//수신 완료
		dao.updateMessageRead(message_no);
		//정보가져오기
		MessageVO messageVO = dao.getMessageInfo(message_no);
		
		return messageVO;
	}
	@Override
	public List<MessageViewVO> getMessageUserSearch() {
		return dao.getMessageUserSearch();
	}
	@Override
	public void insertMessage(MessageVO messageVO) {
		dao.insertMessage(messageVO);
	}
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
	@Override
	public MessageVO getMessageInfo(String message_no) {
		return dao.getMessageInfo(message_no);
	}
}

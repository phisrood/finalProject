package com.korea.message.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;

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
@Repository
public class MessageDAOImpl implements MessageDAO{
	
	@Autowired
	SqlSession session;
	
	/**
	 * 새로운쪽지리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageVO> getMessageNewList(UsersVO usersVO) {
		return session.selectList("Message.messageNewList", usersVO);
		
	}
	/**
	 * 쪽지전체리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageVO> getMessageAllList(String id) {
		return session.selectList("Message.messageAllList", id);
	}
	/**
	 * 쪽지조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public MessageVO getMessageInfo(String message_no) {
		return (MessageVO) session.selectOne("Message.messageInfo", message_no);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<MessageViewVO> getMessageUserSearch() {
		return session.selectList("Message.messageUserSearch");
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertMessage(MessageVO messageVO) {
		session.insert("Message.messageInsert", messageVO);
	}
	/**
	 * 쪽지삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateMessageDel(MessageVO messageVO) {
		// TODO Auto-generated method stub
		session.delete("Message.messageDelete", messageVO);
	}
	
	/**
	 * 수신처리
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateMessageRead(String message_no) {
		session.update("Message.messageReadUpdate",message_no);
	}

	

}

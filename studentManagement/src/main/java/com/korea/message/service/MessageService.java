package com.korea.message.service;

import java.util.List;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
 * @Description : 메시지 service
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
 *    2016.09.11. 	한돈희			개발완료
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */

public interface MessageService {
	/**
	 * 쪽지 리스트 메인화면 출력
	 * @param usersVO
	 * @return List
	 */
	public List<MessageVO> getMessageNewList(UsersVO usersVO);
	/**
	 * 전체 쪽지 리스트
	 * @param id
	 * @return List
	 */
	public List<MessageVO> getMessageAllList(String id);
	/**
	 * 읽음처리
	 * @param message_no
	 * @return MessageVO
	 */
	public MessageVO updateMessageInfo(String message_no);
	/**
	 * 보낸쪽지조회
	 * @param message_no
	 * @return MessageVO
	 */
	public MessageVO getMessageInfo(String message_no);
	/**
	 * 수신유저검색
	 * @return List
	 */
	public List<MessageViewVO> getMessageUserSearch();
	/**
	 * 메시지 보내기
	 * @param messageVO
	 * @return void
	 */
	public void insertMessage(MessageVO messageVO);
	/**
	 * 보낸메시지 삭제
	 * @param message_no, delyn
	 * @return void
	 */
	public void updateSendMessageDel(int message_no, String delyn);
	/**
	 * 받은메시지 삭제
	 * @param message_no, delyn
	 * @return void
	 */
	public void updateReciveMessageDel(int message_no, String delyn);
}

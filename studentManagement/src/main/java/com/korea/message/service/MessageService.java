package com.korea.message.service;

import java.util.List;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
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

public interface MessageService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//새로운 쪽지 리스트 안읽은쪽지만 출력
	public List<MessageVO> getMessageNewList(UsersVO usersVO);
	/**
	 * @param id 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체 쪽지 리스트
	public List<MessageVO> getMessageAllList(String id);
	/**
	 * @return 
	 * @param message_no 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//받은쪽지조회
	public MessageVO updateMessageInfo(String message_no);
	//보낸쪽지조회
	public MessageVO getMessageInfo(String message_no);
	/**
	 * 수신유저검색
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<MessageViewVO> getMessageUserSearch();
	/**
	 * @param messageVO 
	 * 메시지 보내기
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertMessage(MessageVO messageVO);
	/**
	 * @param message_no 
	 * 보낸메시지 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	public void updateSendMessageDel(int message_no, String delyn);
	/**
	 * @param message_no 
	 * 받은메시지 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	public void updateReciveMessageDel(int message_no, String delyn);
	
	
	
	
	
}

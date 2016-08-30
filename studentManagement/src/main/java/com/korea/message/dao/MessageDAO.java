package com.korea.message.dao;

import java.util.List;

import com.korea.dto.MessageVO;
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

public interface MessageDAO {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//새로운 쪽지 리스트 안읽은쪽지만 출력
	public List<MessageVO> getMessageNewList(UsersVO usersVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체 쪽지 리스트
	public void getMessageAllList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지조회
	public void getMessageInfo();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수신사용자검색 다른쪽 VO 리턴
	public void getMessageUserSearch();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지발신
	public void insertMessage();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//쪽지삭제
	public void deleteMessage();
}

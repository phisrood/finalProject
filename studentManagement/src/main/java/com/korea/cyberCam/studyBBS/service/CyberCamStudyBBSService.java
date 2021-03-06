package com.korea.cyberCam.studyBBS.service;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LearningRoomViewVO;
import com.korea.dto.Learning_RoomVO;

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
public interface CyberCamStudyBBSService {
	/**
	 * @return 
	 * 학습게시판 전체 리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	//학습게시판 리스트
	public List<LearningRoomViewVO> getStudyBBSList(String pro_lec_no);
	/**
	 * 학습자료게시판 상세보기
	 * @param lr_no 
	 * @param
	 * @return 
	 * @throws 
	 */
	//학습게시판 상세보기
	public LearningRoomViewVO getStudyBBSDetail(int lr_no);
	/**
	 * 학습게시판 등록,파일업로드
	 * @param learning_RoomVO ,attachment_FileVO
	 * @return 
	 * @throws 
	 */
	//학습게시판 등록,파일업로드
	public void insertStudyBBS(Learning_RoomVO learning_RoomVO, Attachment_FileVO attachment_FileVO);
	/**
	 * 학습게시판 수정
	 * @param attachment_FileVO ,learning_RoomVO
	 * @return 
	 * @throws 
	 */
	//학습게시판 수정
	public void updateStudyBBS(Learning_RoomVO learning_RoomVO, Attachment_FileVO attachment_FileVO);
	/**
	 * @param learning_RoomVO 
	 * 학습게시판 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//학습게시판 삭제
	public void deleteStudyBBS(Learning_RoomVO learning_RoomVO);
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학습게시판 파일다운로드
	public void getStudyBBSFileDown();
}

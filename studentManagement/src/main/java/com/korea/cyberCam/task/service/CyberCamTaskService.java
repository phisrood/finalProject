package com.korea.cyberCam.task.service;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.HomeworkAllList_ViewVO;
import com.korea.dto.HomeworkVO;
import com.korea.dto.Homework_ViewVO;


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
public interface CyberCamTaskService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제등록
	public void insertTaskReg();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제제출
	public void insertTaskSubmit();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제제출한 리스트
	public void getTaskSubmitList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제수정
	public void updateTask();
	
	
	//첨부파일 有 , 교수가 첨부파일 등록
	public int insertTaskReg(Attachment_FileVO attachment_FileVO);
	
	//첨부파일 有 , 교수가 과제글 등록
	public void insertTaskWrite(HomeworkVO homeworkVO);
	
	//첨부파일 無 , 교수가 과제글 등록
	public void insertTaskWriteNotFile(HomeworkVO homeworkVO);
	
	
	//교수 과제게시판 글 리스트 출력
	public List<HomeworkAllList_ViewVO> getTaskListPro(String pro_lec_no);
	//학생 과제게시판 글 리스트 출력
	public List<HomeworkAllList_ViewVO> getTaskListStu(int pro_lec_no);
	
	//교수 과제게시판 상세페이지
	public HomeworkAllList_ViewVO getTaskListProDetail(String hw_no);
	
}

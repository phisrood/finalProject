package com.korea.cyberCam.noticeBBS.service;

import java.util.List;
import java.util.Map;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Cyber_LectureNoticeViewVO;
import com.korea.dto.Lecture_NoticeVO;

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
public interface CyberCamNoticeBBSService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 리스트
	public void getNoticeBBSList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 상세보기
	public void getNoticeBBSDetail();
	/**
	 * @param lecture_NoticeVO 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 등록
	public void insertNoticeBBS(Lecture_NoticeVO lecture_NoticeVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 삭제
	public void deleteNoticeBBS	(Map<String, String> params);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 수정
	public int updateNoticeBBS(Lecture_NoticeVO lecture_NoticeVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 파일다운로드
	public void getNoticeFileDown();
	
	//리스트/상세보기 학생,교수
	public List<Cyber_LectureNoticeViewVO>  getNoticeBBSList(int stu_lec_no);
	public List<Cyber_LectureNoticeViewVO> getNoticeBBSDetail(int ln_no);
	public int insertNoticeFileUpload(
			Attachment_FileVO attachment_FileVO);
	
	//af넘버 가져오기
	public int getNoticeFileAf_no();
	public int updateNoticeBBSFile(Attachment_FileVO attachment_FileVO);
	public Attachment_FileVO getFileDownload(int af_no);
	

	

	
}

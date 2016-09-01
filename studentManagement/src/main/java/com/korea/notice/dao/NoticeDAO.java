package com.korea.notice.dao;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;

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

public interface NoticeDAO {
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 게시판 리스트 Select 최신 20~30개씩
	public List<Colleage_NoticeVO> getNoticeNewList();
	/**
	 * @return 
	 * @param cn_no 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지 상세
	public Colleage_NoticeVO getNoticeDetailInfo(int cn_no);
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 게시판 전체리스트 
	public List<NoticeViewVO> getNoticeAllList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 수정
	public void updateNotice();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 삭제
	public void deleteNotice();
	/**
	 * @param multipartFile 
	 * @param colleage_NoticeVO 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 등록
	public void insertNotice(Colleage_NoticeVO colleage_NoticeVO);
	/**
	 * @return 
	 * @param multipartFile 
	 * @param colleage_NoticeVO 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 등록
	public Attachment_FileVO insertNoticeFile(Attachment_FileVO attachment_FileVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//파일다운로드
	public void getNoticeFileDown();
	
}

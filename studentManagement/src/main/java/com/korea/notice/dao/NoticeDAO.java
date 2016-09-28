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
	 * 공지사항새글리스트
	 * @param
	 * @return List<Colleage_NoticeVO>
	 * @throws 
	 */
	public List<Colleage_NoticeVO> getNoticeNewList();
	
	/**
	 * @return 
	 * @param cn_no 
	 * 공지사항 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	public NoticeViewVO getNoticeDetailInfo(int cn_no);
	
	/**
	 * 공지사항 게시판 전체리스트 
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<NoticeViewVO> getNoticeAllList();
	
	/**
	 * 공지사항 수정
	 * @param colleage_NoticeVO
	 * @return 
	 * @throws 
	 */
	public void updateNotice(Colleage_NoticeVO colleage_NoticeVO);
	/**
	 * 공지사항 파일수정
	 * @param attachment_FileVO
	 * @return 
	 * @throws 
	 */
	public void updateNoticeFile(Attachment_FileVO attachment_FileVO);
	
	/**
	 * 공지사항 삭제
	 * @param colleage_NoticeVO
	 * @return 
	 * @throws 
	 */
	public void deleteNotice(Colleage_NoticeVO colleage_NoticeVO);
	
	/**
	 * 공지사항 등록
	 * @param colleage_NoticeVO 
	 * @return 
	 * @throws 
	 */
	public void insertNotice(Colleage_NoticeVO colleage_NoticeVO);
	/**
	 * @return 
	 * 공지사항 파일등록
	 * @param attachment_FileVO 
	 * @param
	 * @return 
	 * @throws 
	 */
	public Attachment_FileVO insertNoticeFile(Attachment_FileVO attachment_FileVO);

}

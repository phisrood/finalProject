package com.korea.notice.service;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;

/**
 * @Interface Name : NoticeServiceImpl.java
 * @Description : 공지사항게시판
 * @Modification Information
 * @author 이수정
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	이수정       		최초생성
 *    2016.09.02.  	이수정        		공지사항리스트
 *    2016.09.02.  	이수정        		공지사항등록
 *    2016.09.02.  	이수정        		공지사항수정
 *    2016.09.02.  	이수정        		공지사항삭제
 *    2016.09.02.  	이수정        		공지사항파일업로드/다운로드
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */

public interface NoticeService {
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
	 * 공지사항등록
	 * @param attachment_FileVO ,colleage_NoticeVO 
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertNotice(Colleage_NoticeVO colleage_NoticeVO,Attachment_FileVO attachment_FileVO);
	/**
	 * 공지사항 수정
	 * @param colleage_NoticeVO,attachment_FileVO
	 * @return 
	 * @throws 
	 */
	public void updateNotice(Colleage_NoticeVO colleage_NoticeVO,
			Attachment_FileVO attachment_FileVO);
	/**
	 * 공지사항 삭제
	 * @param colleage_NoticeVO 
	 * @param
	 * @return 
	 * @throws 
	 */
	public void deleteNotice(Colleage_NoticeVO colleage_NoticeVO);
	
	
}

package com.korea.cyberCam.freeBBS.service;
/**
 * @Interface Name : CyberCamFreeBBSService.java
 * @Description : 사이버 캠퍼스 자유 게시판 글 리스트 출력 / 등록 / 삭제 / 수정 / 상세보기 및 답글 등록 / 삭제 / 수정
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
public interface CyberCamFreeBBSService {
	/**
	 * 사이버 캠퍼스 자유 게시판 글 리스트 출력
	 * @param
	 * @return 
	 * @throws 
	 */
	public void getFreeBBSList();
	/**
	 * 사이버 캠퍼스 자유 게시판 글 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	public void getFreeBBSDetail();
	/**
	 * 사이버 캠퍼스 자유 게시판 글 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertFreeBBS();
	/**
	 * 사이버 캠퍼스 자유 게시판 글 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	public void deleteFreeBBS();
	/**
	 * 사이버 캠퍼스 자유 게시판 글 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	public void updateFreeBBS();
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertFreeBBSReplyReg();
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	public void deleteFreeBBSReply();
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	public void updateFreeBBSReply();
	
}

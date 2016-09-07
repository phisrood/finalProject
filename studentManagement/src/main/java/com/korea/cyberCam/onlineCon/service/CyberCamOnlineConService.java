package com.korea.cyberCam.onlineCon.service;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_Con_ViewVO;
import com.korea.dto.Online_ContentsVO;

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
public interface CyberCamOnlineConService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 등록
	public void insertOnlineCon(Online_ContentsVO onlineContentsVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 수정
	public void updateOnlineCon();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 삭제
	public void deleteOnlineCon();
	/**
	 * @param lec_no 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회
	public List<Online_ContentsVO> getOnlineConList(int lec_no);
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회
	public int insertOnlineConFile(Attachment_FileVO attachFileVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회
	void getOnlineConList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회
	public List<Online_Con_ViewVO> getOnlineConWatchList(int lec_no);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회
	public Attachment_FileVO getAF(int af_no);
	
}

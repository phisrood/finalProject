package com.korea.cyberCam.onlineCon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.onlineCon.dao.CyberCamOnlineConDAO;
import com.korea.dto.Online_ContentsVO;

/**
 * @Class Name : IndivInfoManageController.java
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
@Service
public class CyberCamOnlineConServiceImpl implements CyberCamOnlineConService{
	@Autowired
	CyberCamOnlineConDAO cyberCamOnlineConDAO;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertOnlineCon(Online_ContentsVO onlineContentsVO) {
		cyberCamOnlineConDAO.insertOnlineCon(onlineContentsVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateOnlineCon() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteOnlineCon() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getOnlineConList() {
		// TODO Auto-generated method stub
		
	}

}

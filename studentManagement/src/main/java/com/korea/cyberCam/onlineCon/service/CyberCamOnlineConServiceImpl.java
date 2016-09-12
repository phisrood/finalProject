package com.korea.cyberCam.onlineCon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.onlineCon.controller.CyberCamOnlineConController;
import com.korea.cyberCam.onlineCon.dao.CyberCamOnlineConDAO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_Con_StudentListVO;
import com.korea.dto.Online_Con_ViewVO;
import com.korea.dto.Online_Con_Watchcheck_ViewVO;
import com.korea.dto.Online_ContentsVO;
import com.korea.dto.WatchStudentsVO;

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
	public int insertOnlineCon(Online_ContentsVO onlineContentsVO,Attachment_FileVO attachFileVO) {
		if(attachFileVO != null){
			int oc_af_no = cyberCamOnlineConDAO.insertOnlineConFile(attachFileVO);
			onlineContentsVO.setOc_af_no(oc_af_no);
		}
		
		return cyberCamOnlineConDAO.insertOnlineCon(onlineContentsVO,attachFileVO);
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
	public List<Online_ContentsVO> getOnlineConList(int lec_no) {
		return cyberCamOnlineConDAO.getOnlineConList(lec_no);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int insertOnlineConFile(Attachment_FileVO attachFileVO) {
		return cyberCamOnlineConDAO.insertOnlineConFile(attachFileVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getOnlineConList() {
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Online_Con_ViewVO> getOnlineConWatchList(int lec_no) {
		return cyberCamOnlineConDAO.getOnlineConWatchList(lec_no);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Attachment_FileVO getAF(int af_no) {
		return cyberCamOnlineConDAO.getAF(af_no);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateOnlineConTime(Map<String,String> params,String full_time) {
		cyberCamOnlineConDAO.updateOnlineConTime(params);
		int attendyn = cyberCamOnlineConDAO.getWatchTime(params);
		
		String attendynStr = attendyn+"";
		if(full_time.equals(attendynStr)){
			cyberCamOnlineConDAO.updateOnlineConAttendyn(params);
		}
		
	}
	@Override
	public List<Online_Con_StudentListVO> getOnlinConStudents(int oc_lec_no) {
		return cyberCamOnlineConDAO.getOnlinConStudents(oc_lec_no);
	}
	@Override
	public void insertOnlineConStudentList(List<WatchStudentsVO> watchList) {
		cyberCamOnlineConDAO.insertOnlineConStudentList(watchList);
	}
	@Override
	public int getWatchTime(Online_Con_ViewVO conViewTimeVO) {
		return cyberCamOnlineConDAO.getWatchTime(conViewTimeVO);
	}
	@Override
	public List<Online_Con_ViewVO> getAttendList(
			List<Online_ContentsVO> onlineConList, String loginUser) {
		
		List<Online_Con_ViewVO> attentList = new ArrayList<Online_Con_ViewVO>();
		Online_Con_ViewVO attend = new Online_Con_ViewVO();
		for(int i = 0; i<onlineConList.size();i++){
			attend.setWs_oc_lec_no(onlineConList.get(i).getOc_lec_no());
			attend.setWs_oc_no(onlineConList.get(i).getOc_no());
			attend.setWs_stud_use_id(loginUser);
			attend.setWs_attendyn(cyberCamOnlineConDAO.getAttendList(attend));
			attentList.add(attend);
			System.out.println("2222222222222");
			System.out.println(attend.getWs_attendyn());
		}
		return attentList;
	}
	@Override
	public List<Online_Con_Watchcheck_ViewVO> getOnlineConList(String lec_no) {
		return cyberCamOnlineConDAO.getOnlineConList(lec_no);
	}

}

package com.korea.cyberCam.onlineCon.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.cyberCam.onlineCon.controller.CyberCamOnlineConController;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_Con_StudentListVO;
import com.korea.dto.Online_Con_ViewVO;
import com.korea.dto.Online_Con_Watchcheck_ViewVO;
import com.korea.dto.Online_ContentsVO;
import com.korea.dto.WatchStudentsVO;
import com.korea.dto.Watch_StatusVO;

/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Repository
public class CyberCamOnlineConDAOImpl implements CyberCamOnlineConDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public int insertOnlineCon(Online_ContentsVO onlineContentsVO,Attachment_FileVO attachFileVO) {
		sqlSession.insert("CyberCamOnlineContentsDAO.insertOnlineCon",onlineContentsVO);
		return (int) sqlSession.selectOne("CyberCamOnlineContentsDAO.getOnlineCurrval");
	}

	/**
	 * 개인 정보 조회
	 * 
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
	 * 
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
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<Online_ContentsVO> getOnlineConList(int lec_no,String loginUser) {
		Online_ContentsVO OCVO = new Online_ContentsVO();
		OCVO.setOc_lec_no(lec_no);
		OCVO.setOc_pro_use_id(loginUser);
		return (List<Online_ContentsVO>) sqlSession.selectList("CyberCamOnlineContentsDAO.getOnlineConList", OCVO);
	}

	@Override
	public int insertOnlineConFile(Attachment_FileVO attachFileVO) {
		sqlSession.insert("CyberCamOnlineContentsDAO.insertOnlineConFile",
				attachFileVO);
		return (int) sqlSession
				.selectOne("CyberCamOnlineContentsDAO.getCurrval");

	}

	@Override
	public List<Online_Con_ViewVO> getOnlineConWatchList(int lec_no) {
		return (List<Online_Con_ViewVO>) sqlSession.selectList(
				"CyberCamOnlineContentsDAO.getOnlineConWatchList", lec_no);
	}

	@Override
	public Attachment_FileVO getAF(int af_no) {
		return (Attachment_FileVO) sqlSession.selectOne(
				"CyberCamOnlineContentsDAO.getAF", af_no);
	}

	@Override
	public String updateOnlineConTime(Map<String,String> params) {
		Online_Con_ViewVO onlineConView = new Online_Con_ViewVO();
		onlineConView.setWs_oc_lec_no(Integer.parseInt(params.get("oc_lec_no")));
		onlineConView.setWs_oc_no(Integer.parseInt(params.get("oc_no")));
		onlineConView.setWs_stud_use_id(params.get("loginUser"));
		sqlSession.update("CyberCamOnlineContentsDAO.updateOnlineConTime", onlineConView);
		
		return null;
	}

	@Override
	public List<Online_Con_StudentListVO> getOnlinConStudents(int oc_lec_no) {
		return (List<Online_Con_StudentListVO>) sqlSession.selectList("CyberCamOnlineContentsDAO.getOnlinConStudents", oc_lec_no);
	}

	@Override
	public void insertOnlineConStudentList(List<WatchStudentsVO> watchList) {
		for(int i = 0; i<watchList.size();i++){
			sqlSession.insert("CyberCamOnlineContentsDAO.insertOnlineConStudentList",watchList.get(i));
		}
	}

	@Override
	public int getWatchTime(Map<String, String> params) {
		Online_Con_ViewVO onlineConView = new Online_Con_ViewVO();
		onlineConView.setWs_oc_lec_no(Integer.parseInt(params.get("oc_lec_no")));
		onlineConView.setWs_oc_no(Integer.parseInt(params.get("oc_no")));
		onlineConView.setWs_stud_use_id(params.get("loginUser"));
		return (int) sqlSession.selectOne("CyberCamOnlineContentsDAO.getWatchTime",onlineConView);
	}

	@Override
	public void updateOnlineConAttendyn(Map<String, String> params) {
		Online_Con_ViewVO onlineConView = new Online_Con_ViewVO();
		onlineConView.setWs_oc_lec_no(Integer.parseInt(params.get("oc_lec_no")));
		onlineConView.setWs_oc_no(Integer.parseInt(params.get("oc_no")));
		onlineConView.setWs_stud_use_id(params.get("loginUser"));
		sqlSession.update("CyberCamOnlineContentsDAO.updateOnlineConAttendyn", onlineConView);
	}

	@Override
	public int getWatchTime(Online_Con_ViewVO conViewTimeVO) {
		return (int) sqlSession.selectOne("CyberCamOnlineContentsDAO.getWatchTime", conViewTimeVO);
	}

	@Override
	public List<Online_Con_Watchcheck_ViewVO> getOnlineConList(String lec_no) {
		return (List<Online_Con_Watchcheck_ViewVO>) sqlSession.selectList("CyberCamOnlineContentsDAO.getOnlineCheckList", lec_no);
	}



}

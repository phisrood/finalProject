package com.korea.crsesInquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.crsesInquiry.dao.CrsesInquiryDAO;
import com.korea.dto.Professor_InquiryList_ViewVO;
import com.korea.dto.Student_InquiryList_ViewVO;

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
public class CrsesInquiryServiceImpl implements CrsesInquiryService{
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	
	@Autowired
	private CrsesInquiryDAO crsesInquiryDAO;
	
	
	@Override
	public List<Student_InquiryList_ViewVO> getCrsesInquiryList(String stud_use_id) {
		
		return crsesInquiryDAO.getCrsesInquiryList(stud_use_id);
	
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getCyberCamMove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Professor_InquiryList_ViewVO getCrsesInquiryProList(int lec_no){
		
		return crsesInquiryDAO.getCrsesInquiryProList(lec_no);
	}

}

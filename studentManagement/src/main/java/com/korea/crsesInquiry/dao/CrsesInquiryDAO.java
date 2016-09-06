package com.korea.crsesInquiry.dao;

import java.util.List;

import com.korea.dto.Professor_InquiryList_ViewVO;
import com.korea.dto.Student_InquiryList_ViewVO;

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
public interface CrsesInquiryDAO {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재학기 수강내역조회
	public List<Student_InquiryList_ViewVO> getCrsesInquiryList(String stud_use_id);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//사이버캠퍼스이동
	public void getCyberCamMove();
	public Professor_InquiryList_ViewVO getCrsesInquiryProList(int lec_no);
}

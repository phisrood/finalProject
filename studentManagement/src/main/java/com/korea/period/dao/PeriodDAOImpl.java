package com.korea.period.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;
import com.korea.dto.Period;
import com.korea.dto.UsersVO;

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
@Repository
public class PeriodDAOImpl implements PeriodDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void updateCrsesInquiryPeriod(String state) {
		sqlSession.update("period.updateCrsesInquiryPeriod",state);
		
	}

	@Override
	public void updateAppLecturePeriod(String state) {
		sqlSession.update("period.updateAppLecturePeriod",state);		
	}

	@Override
	public void updateScoreSummary() {
		sqlSession.update("period.updateScoreSummary");
		sqlSession.delete("period.deleteClassroomUsetime");
		
	}

	@Override
	public void updateMajorReqPeriod(String state) {
		sqlSession.update("period.updateMajorReqPeriod",state);
	}

	@Override
	public Period getPeriodAll() {
		return (Period) sqlSession.selectOne("period.getPeriod");
	}

}

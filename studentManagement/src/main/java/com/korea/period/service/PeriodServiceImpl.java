package com.korea.period.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.Period;
import com.korea.period.dao.PeriodDAO;

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
public class PeriodServiceImpl implements PeriodService{
	@Autowired
	private PeriodDAO periodDAO;
	
	@Override
	public void updateCrsesInquiryPeriod(String state) {
		periodDAO.updateCrsesInquiryPeriod(state);
		
	}

	@Override
	public void updateappLecturePeriod(String state) {
		periodDAO.updateAppLecturePeriod(state);
		
	}

	@Override
	public void updateScoreSummary() {
		periodDAO.updateScoreSummary();
		
	}

	@Override
	public void updateMajorReqPeriod(String state) {
		periodDAO.updateMajorReqPeriod(state);
		
	}
	
	@Override
	public Period getPeriodAll() {
		return periodDAO.getPeriodAll();
	}


}

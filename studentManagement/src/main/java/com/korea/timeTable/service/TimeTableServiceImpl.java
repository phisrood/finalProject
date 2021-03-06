package com.korea.timeTable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.TimeTableViewVO;
import com.korea.timeTable.dao.TimeTableDAO;

/**
 * @Class Name : TimeTableServiceImpl.java
 * @Description : 시간표 service 구현
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
public class TimeTableServiceImpl implements TimeTableService{
	@Autowired
	private TimeTableDAO timeTableDAO;
	//시간표 가져오기
	@Override
	public List<TimeTableViewVO> getTimeTableList(String id) {
			return timeTableDAO.getTimeTableList(id);
	}

}

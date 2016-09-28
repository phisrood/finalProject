package com.korea.timeTable.dao;

import java.util.List;

import com.korea.dto.TimeTableViewVO;

/**
 * @Interface Name : TimeTableDAO.java
 * @Description : 시간표 DAO
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
public interface TimeTableDAO {
	
	//수업시간표 조회
	public List<TimeTableViewVO> getTimeTableList(String id);
}

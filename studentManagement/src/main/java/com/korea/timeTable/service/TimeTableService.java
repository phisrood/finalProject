package com.korea.timeTable.service;

import java.util.List;

import com.korea.dto.TimeTableViewVO;

/**
 * @Interface Name : TimeTableService.java
 * @Description : 시간표 service
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
public interface TimeTableService {
	/**
	 * @param id 
	 * 시간표 가져오기
	 * @return List<TimeTableViewVO>
	 * @throws 
	 */
	//수업시간표 조회
	public List<TimeTableViewVO> getTimeTableList(String id);
}

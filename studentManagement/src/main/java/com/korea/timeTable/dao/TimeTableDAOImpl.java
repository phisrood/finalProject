package com.korea.timeTable.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.TimeTableViewVO;

/**
 * @Class Name : TimeTableDAOImpl.java
 * @Description : 시간표DAO 구현
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
public class TimeTableDAOImpl implements TimeTableDAO{
	@Autowired
	private SqlSession sqlSession;


	//시간표 가져오기
	@Override
	public List<TimeTableViewVO> getTimeTableList(String id) {
		return sqlSession.selectList("timeTable.getTimeTableList", id);
		
	}

}

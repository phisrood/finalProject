package com.korea.colleageManage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Colleage_Register_ChangeVO;

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
public class ColleageManageDAOImpl implements ColleageManageDAO{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	
	
	
	
	@Override
	public int insertSchoolReREQ(Map<String, String> map) {
	
		return sqlSession.insert("ColleageManageDAO.insertREQ",map);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public  List<Colleage_Register_ChangeVO> getSchoolReREQList(String stud_use_id) {
		
		return  (List<Colleage_Register_ChangeVO>) sqlSession.selectList("ColleageManageDAO.selectREQ",stud_use_id);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateSchoolReREQDecide() {
		// TODO Auto-generated method stub
		return null;
	}

}

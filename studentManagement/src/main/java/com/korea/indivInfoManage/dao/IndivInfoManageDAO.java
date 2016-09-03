package com.korea.indivInfoManage.dao;

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

import java.util.List;
import java.util.Map;

import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;

public interface IndivInfoManageDAO {

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	public String getIndivInfo();
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */


	//개인신상정보 조회
	public Student_InfoViewVO getIndivInfo(String stud_use_id);
	
	//개인신상정보 수정
	public int updateIndiv(StudentVO studentVO);
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	
	
	public int updateIndiv(Map<String, String> params);
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	
	
	public int updateImage(Map<String, String> map);
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<Colleage_Register_ChangeVO> getColleageChangeList(String stud_use_id);
	
	public int insertImage(Map<String, String> insertMap);
	
	public int selectafno();
	
	public int updateafno(Map<String, String> para);

}

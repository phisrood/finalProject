package com.korea.memberManage.dao;

import java.util.Map;

/**
 * @Interface Name : MemberManageDAO.java
 * @Description : 학생 및 교수 및 교직원 정보 조회 / 등록 / 수정 / 비활성화
 * @Modification Information
 * @author 조현욱
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface MemberManageDAO {
	/**
	 * 학생 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String getStuInfoList();
	/**
	 * 학생 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 학생 정보 등록
	public int insertStuInfo(Map<String, String> studentMap);

	// 학생 정보 수정



	/**
	 * 학생 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateStuInfo();

	/**
	 * 학생 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateStuInfoOnOff();

	/**
	 * 교수 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String getProInfoList();

	/**
	 * 교수 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String insertProInfo();

	/**
	 * 교수 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateProInfo();

	/**
	 * 교수 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateproInfoOnOff();

	/**
	 * 교직원 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String getEmpInfoList();

	/**
	 * 교직원 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String insertEmpInfo();

	/**
	 * 교직원 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateEmpInfo();

	/**
	 * 교직원 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateEmpInfoOnOff();
}

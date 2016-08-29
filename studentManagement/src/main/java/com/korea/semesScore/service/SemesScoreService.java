package com.korea.semesScore.service;
/**
 * @Interface Name : SemesScoreService.java
 * @Description : 학기 성적 반영 / 입력
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
public interface SemesScoreService {
	/**
	 * 학기 성적 반영
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertSemesScore();
	/**
	 * 성적 입력
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertScoreInput();
}

package com.korea.dto;
/**
 * 수업평가통계VO
 * 
 * @param
 * lc_no : 문항번호<br>
 * lc_lec_no : 강의등록번호<br>
 * lc_appraisalquestion : 평가문항<br>
 * lc_questionscore : 문항별점수
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Lecture_ChartVO {

	private int lc_no;
	private String lc_lec_no;
	private int lc_appraisalquestion;
	private float lc_questionscore;
	public int getLc_no() {
		return lc_no;
	}
	public void setLc_no(int lc_no) {
		this.lc_no = lc_no;
	}
	public String getLc_lec_no() {
		return lc_lec_no;
	}
	public void setLc_lec_no(String lc_lec_no) {
		this.lc_lec_no = lc_lec_no;
	}
	public int getLc_appraisalquestion() {
		return lc_appraisalquestion;
	}
	public void setLc_appraisalquestion(int lc_appraisalquestion) {
		this.lc_appraisalquestion = lc_appraisalquestion;
	}
	public float getLc_questionscore() {
		return lc_questionscore;
	}
	public void setLc_questionscore(float lc_questionscore) {
		this.lc_questionscore = lc_questionscore;
	}

	
	
}

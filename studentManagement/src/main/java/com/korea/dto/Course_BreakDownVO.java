package com.korea.dto;

/**
 * 수강내역VO
 * 
 * @param
 * cb_stud_use_id : 아이디<br>
 * cb_lec_no : 강의등록번호<br>
 * cb_grade : 등급<br>
 * cb_score : 점수<br>
 * cb_acquistionyn : 취득여부
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Course_BreakDownVO {

	private String cb_stud_use_id;
	private int cb_lec_no;
	private String cb_grade;
	private int cb_score;
	private String cb_acquistionyn;
	private String cb_appyn;
	public String getCb_stud_use_id() {
		return cb_stud_use_id;
	}
	public void setCb_stud_use_id(String cb_stud_use_id) {
		this.cb_stud_use_id = cb_stud_use_id;
	}
	public int getCb_lec_no() {
		return cb_lec_no;
	}
	public void setCb_lec_no(int cb_lec_no) {
		this.cb_lec_no = cb_lec_no;
	}
	public String getCb_grade() {
		return cb_grade;
	}
	public void setCb_grade(String cb_grade) {
		this.cb_grade = cb_grade;
	}
	public int getCb_score() {
		return cb_score;
	}
	public void setCb_score(int cb_score) {
		this.cb_score = cb_score;
	}
	public String getCb_acquistionyn() {
		return cb_acquistionyn;
	}
	public void setCb_acquistionyn(String cb_acquistionyn) {
		this.cb_acquistionyn = cb_acquistionyn;
	}
	public String getCb_appyn() {
		return cb_appyn;
	}
	public void setCb_appyn(String cb_appyn) {
		this.cb_appyn = cb_appyn;
	}
	
	
}

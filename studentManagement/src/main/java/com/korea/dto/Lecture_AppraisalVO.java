package com.korea.dto;
/**
 * 수업평가VO
 * 
 * @param
 * la_no : 평가번호<br>
 * la_lc_no : 문항번호<br>
 * la_am_lec_no : 아이디<br>
 * la_stud_use_id : 강의등록번호<br>
 * la_apprisalscore : 응답내역
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Lecture_AppraisalVO {

	private int la_no;
	private int la_lc_no;
	private int la_am_lec_no;
	private String la_stud_use_id;
	private int la_apprisalscore;
	public int getLa_no() {
		return la_no;
	}
	public void setLa_no(int la_no) {
		this.la_no = la_no;
	}
	public int getLa_lc_no() {
		return la_lc_no;
	}
	public void setLa_lc_no(int la_lc_no) {
		this.la_lc_no = la_lc_no;
	}
	public int getLa_am_lec_no() {
		return la_am_lec_no;
	}
	public void setLa_am_lec_no(int la_am_lec_no) {
		this.la_am_lec_no = la_am_lec_no;
	}
	public String getLa_stud_use_id() {
		return la_stud_use_id;
	}
	public void setLa_stud_use_id(String la_stud_use_id) {
		this.la_stud_use_id = la_stud_use_id;
	}
	public int getLa_apprisalscore() {
		return la_apprisalscore;
	}
	public void setLa_apprisalscore(int la_apprisalscore) {
		this.la_apprisalscore = la_apprisalscore;
	}
	
}

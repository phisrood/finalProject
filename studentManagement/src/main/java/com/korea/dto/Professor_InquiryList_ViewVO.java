package com.korea.dto;

/**
 * 교수+담당강의 VIEW
 * 
 * @param use_name
 * 
 *            use_name 교수이름
 *             pro_use_id 교수아이디
 *              dep_name 교수소속학과명 
 *              lb_name 담당과목
 *            tt_time 시간표 
 *            lec_no 강의등록번호 
 *            lec_lb_no 학수번호
 * 
 * 
 * 
 *
 * 
 * 
 * @version 박진성, 1.0, 2016.09.05, 초기 작성
 * 
 * 
 * 
 * @author 박진성
 *
 */

public class Professor_InquiryList_ViewVO {

	
	private String use_name;
	private String pro_use_id;
	private String dep_name;
	private String lb_name;
	private String tt_time;
	private int lec_no;
	private String lec_lb_no;

	
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getPro_use_id() {
		return pro_use_id;
	}
	public void setPro_use_id(String pro_use_id) {
		this.pro_use_id = pro_use_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public String getTt_time() {
		return tt_time;
	}
	public void setTt_time(String tt_time) {
		this.tt_time = tt_time;
	}
	public int getLec_no() {
		return lec_no;
	}
	public void setLec_no(int lec_no) {
		this.lec_no = lec_no;
	}
	public String getLec_lb_no() {
		return lec_lb_no;
	}
	public void setLec_lb_no(String lec_lb_no) {
		this.lec_lb_no = lec_lb_no;
	}

}

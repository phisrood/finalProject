package com.korea.dto;
/**
 * ProfessorView VO
 * 
 * @param 
 * pro_view_name : 교수이름 <br>
 * pro_view_dep_no : 학과번호<br>
 * pro_view_position : 직책<br>
 * pro_view_gender : 성별
 * 
 * @version 이수정, 1.0, 2016.08.30, 초기 작성
 * @author 이수정
 * 
 * 
 */
public class ProfessorViewVO {

	private String use_name;
	private String dep_name;
	private String pro_position;
	private String pro_gender;
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getPro_position() {
		return pro_position;
	}
	public void setPro_position(String pro_position) {
		this.pro_position = pro_position;
	}
	public String getPro_gender() {
		return pro_gender;
	}
	public void setPro_gender(String pro_gender) {
		this.pro_gender = pro_gender;
	}
	
	
	
}

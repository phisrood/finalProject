package com.korea.dto;
/**
 * ProfessorView VO
 * 
 * @param 
 * use_name : 교수이름 <br>
 * dep_name : 학과번호<br>
 * pro_position : 직책<br>
 * pro_gender : 성별
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
	private String pro_use_id;
	private String pro_gender;
	
	
	
	public String getPro_use_id() {
		return pro_use_id;
	}
	public void setPro_use_id(String pro_use_id) {
		this.pro_use_id = pro_use_id;
	}
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

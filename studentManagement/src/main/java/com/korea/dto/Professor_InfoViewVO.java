package com.korea.dto;
/**
 * 교수로그인정보VO
 * 
 * @param
 * use_id 접속아이디
 * use_name 교수이름
 * enabled 활성유무
 * use_pwd 비밀번호
 * authority 권한
 * pro_position 직급
 * pro_stat 상태
 * dep_name 과이름
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.31, 초기 작성
 * @author 한돈희
 *
 */
public class Professor_InfoViewVO {

	private String use_id;
	private String use_name;
	private String enabled;
	private String use_pwd;
	private String authority;
	private String pro_position;
	private String pro_stat;
	private String dep_name;
	public String getUse_id() {
		return use_id;
	}
	public void setUse_id(String use_id) {
		this.use_id = use_id;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getUse_pwd() {
		return use_pwd;
	}
	public void setUse_pwd(String use_pwd) {
		this.use_pwd = use_pwd;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getPro_position() {
		return pro_position;
	}
	public void setPro_position(String pro_position) {
		this.pro_position = pro_position;
	}
	public String getPro_stat() {
		return pro_stat;
	}
	public void setPro_stat(String pro_stat) {
		this.pro_stat = pro_stat;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	
}

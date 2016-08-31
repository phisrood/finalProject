package com.korea.dto;
/**
 * 로그인정보(행정) VO
 * 
 * @param
 * use_id : 아이디
 * use_name : 이름
 * enabled : 활성유무
 * use_pwd : 비번
 * authority : 권한
 * sp_div_no : 부서번호
 * sp_stat : 상태
 * div_name : 부서이름
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class School_PersonInfoViewVO {

	private String use_id;
	private String use_name;
	private String enabled;
	private String use_pwd;
	private String authority;
	private String sp_div_no;
	private String sp_stat;
	private String div_name;
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
	public String getSp_div_no() {
		return sp_div_no;
	}
	public void setSp_div_no(String sp_div_no) {
		this.sp_div_no = sp_div_no;
	}
	public String getSp_stat() {
		return sp_stat;
	}
	public void setSp_stat(String sp_stat) {
		this.sp_stat = sp_stat;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	
	
}

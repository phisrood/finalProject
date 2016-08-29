package com.korea.dto;
/**
 * 사용자VO
 * 
 * @param
 * use_id : 아이디
 * use_kind : 학생/교수/직원
 * use_name : 이름
 * use_pwd : 비밀번호
 * use_yn : 사용유무
 * use_athu : 권한
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class UsersVO {

	private String use_id;
	private String use_kind;
	private String use_name;
	private char enabled;
	private String use_pwd;
	private String authority;
	public String getUse_id() {
		return use_id;
	}
	public void setUse_id(String use_id) {
		this.use_id = use_id;
	}
	public String getUse_kind() {
		return use_kind;
	}
	public void setUse_kind(String use_kind) {
		this.use_kind = use_kind;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
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
	public char getEnabled() {
		return enabled;
	}
	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}
	
	
	
	
}

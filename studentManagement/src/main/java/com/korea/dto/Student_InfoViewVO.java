package com.korea.dto;

/**
 * 학생정보 VIEW_VO
 * 
 * @param
 * 
 * 
 * 		
       *  USE_ID           아이디                        
       *  USE_KIND         사용자구분                    
       *  USE_NAME         이름                          
       *  ENABLED          사용유무                      
       *  USE_PWD          패스워드                      
       *  AUTHORITY        인증                          
       *  STUD_USE_ID      아이디                        
       *  STUD_AF_NO       사진                          
       *  STUD_STAT        학적상태                      
       *  STUD_MAJCREDIT   전공이수학점                  
       *  STUD_LIBCREDIT   교양이수학점                  
       *  STUD_BIRTH       생년월일                      
       *  STUD_PHONE       핸드폰번호                    
       *  STUD_ZIPCODE     우편번호                      
       *  STUD_ADD         주소                          
       *  STUD_ADDDETAIL   상세주소                      
       *  STUD_BLTYPE      혈액형                        
       *  STUD_HOB         취미                          
       *  STUD_GENDER      성별                          
       *  STUD_ENGNAME     영문명                        
       *  STUD_EMAIL       이메일                        
       *  STUD_REGNO1      주민등록번호 앞자리           
       *  STUD_REGNO2      주민등록번호 뒷자리           
       *  MA_STUD_USE_ID   아이디                        
       *  MA_DEP_NO        학과번호                      
       *  MA_MK_NO         전공구분코드                  
       *  MA_CREDIT        이수학점                      
       *  MK_NO            전공구분코드                  
       *  MK_NAME          전공구분명                    
       *  DEP_NO           학과번호                      
       *  DEP_NAME         학과명                        
       *  DEP_MAJNEEDCREDIT  주전공졸업학점              
       *  DEP_MINNEEDCREDIT  부전공졸업학점              
       *  DEP_MULCREDIT      다전공졸업학점              
       *  DEP_REVOKEYN     폐지여부                      
       *  DEP_PHONE        전화번호                      
       *  DEP_ENGNAME      영문명                        
 *
 * 
 * 
 * @version 박진성, 1.0, 2016.08.29, 초기 작성
 * 			박진성, 1.0, 2016.08.31, 1차 수정
 * @author 박진성
 *
 */

public class Student_InfoViewVO {

	
	public int getAf_no() {
		return af_no;
	}
	public void setAf_no(int af_no) {
		this.af_no = af_no;
	}
	public String getAf_realname() {
		return af_realname;
	}
	public void setAf_realname(String af_realname) {
		this.af_realname = af_realname;
	}
	public String getAf_tername() {
		return af_tername;
	}
	public void setAf_tername(String af_tername) {
		this.af_tername = af_tername;
	}
	public String getAf_path() {
		return af_path;
	}
	public void setAf_path(String af_path) {
		this.af_path = af_path;
	}
	private int af_no;
	private String af_realname;
	private String af_tername;
	private String af_path;
	
	
	private String use_id;
	private String use_kind;
	private String use_name;
	private char enabled;
	private String use_pwd;
	private String authority;
	private String stud_use_id;
	private int stud_af_no;
	private String stud_stat;
	private int stud_majcredit;
	private int stud_libcredit;
	private String stud_birth;
	private String stud_phone;
	private String stud_zipcode;
	private String stud_add;
	private String stud_adddetail;
	private String stud_bltype;
	private String stud_hob;
	private String stud_gender;
	private String stud_engname;
	private String stud_email;
	private String stud_regno1;
	private String stud_regno2;
	private String ma_stud_use_id;
	private int ma_dep_no;
	private int ma_mk_no;
	private int ma_credit;
	private int mk_no;
	private String mk_name;
	private int dep_no;
	private String dep_name;
	private int dep_majneedcredit;
	private int dep_minneedcredit;
	private int dep_mulcredit;
	private char dep_revokeyn;
	private String dep_phone;
	private String dep_engname;
	
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
	public char getEnabled() {
		return enabled;
	}
	public void setEnabled(char enabled) {
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
	public String getStud_use_id() {
		return stud_use_id;
	}
	public void setStud_use_id(String stud_use_id) {
		this.stud_use_id = stud_use_id;
	}
	public int getStud_af_no() {
		return stud_af_no;
	}
	public void setStud_af_no(int stud_af_no) {
		this.stud_af_no = stud_af_no;
	}
	public String getStud_stat() {
		return stud_stat;
	}
	public void setStud_stat(String stud_stat) {
		this.stud_stat = stud_stat;
	}
	public int getStud_majcredit() {
		return stud_majcredit;
	}
	public void setStud_majcredit(int stud_majcredit) {
		this.stud_majcredit = stud_majcredit;
	}
	public int getStud_libcredit() {
		return stud_libcredit;
	}
	public void setStud_libcredit(int stud_libcredit) {
		this.stud_libcredit = stud_libcredit;
	}
	public String getStud_birth() {
		return stud_birth;
	}
	public void setStud_birth(String stud_birth) {
		this.stud_birth = stud_birth;
	}
	public String getStud_phone() {
		return stud_phone;
	}
	public void setStud_phone(String stud_phone) {
		this.stud_phone = stud_phone;
	}
	public String getStud_zipcode() {
		return stud_zipcode;
	}
	public void setStud_zipcode(String stud_zipcode) {
		this.stud_zipcode = stud_zipcode;
	}
	public String getStud_add() {
		return stud_add;
	}
	public void setStud_add(String stud_add) {
		this.stud_add = stud_add;
	}
	public String getStud_adddetail() {
		return stud_adddetail;
	}
	public void setStud_adddetail(String stud_adddetail) {
		this.stud_adddetail = stud_adddetail;
	}
	public String getStud_bltype() {
		return stud_bltype;
	}
	public void setStud_bltype(String stud_bltype) {
		this.stud_bltype = stud_bltype;
	}
	public String getStud_hob() {
		return stud_hob;
	}
	public void setStud_hob(String stud_hob) {
		this.stud_hob = stud_hob;
	}
	public String getStud_gender() {
		return stud_gender;
	}
	public void setStud_gender(String stud_gender) {
		this.stud_gender = stud_gender;
	}
	public String getStud_engname() {
		return stud_engname;
	}
	public void setStud_engname(String stud_engname) {
		this.stud_engname = stud_engname;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getStud_regno1() {
		return stud_regno1;
	}
	public void setStud_regno1(String stud_regno1) {
		this.stud_regno1 = stud_regno1;
	}
	public String getStud_regno2() {
		return stud_regno2;
	}
	public void setStud_regno2(String stud_regno2) {
		this.stud_regno2 = stud_regno2;
	}
	public String getMa_stud_use_id() {
		return ma_stud_use_id;
	}
	public void setMa_stud_use_id(String ma_stud_use_id) {
		this.ma_stud_use_id = ma_stud_use_id;
	}
	public int getMa_dep_no() {
		return ma_dep_no;
	}
	public void setMa_dep_no(int ma_dep_no) {
		this.ma_dep_no = ma_dep_no;
	}
	public int getMa_mk_no() {
		return ma_mk_no;
	}
	public void setMa_mk_no(int ma_mk_no) {
		this.ma_mk_no = ma_mk_no;
	}
	public int getMa_credit() {
		return ma_credit;
	}
	public void setMa_credit(int ma_credit) {
		this.ma_credit = ma_credit;
	}
	public int getMk_no() {
		return mk_no;
	}
	public void setMk_no(int mk_no) {
		this.mk_no = mk_no;
	}
	public String getMk_name() {
		return mk_name;
	}
	public void setMk_name(String mk_name) {
		this.mk_name = mk_name;
	}
	public int getDep_no() {
		return dep_no;
	}
	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public int getDep_majneedcredit() {
		return dep_majneedcredit;
	}
	public void setDep_majneedcredit(int dep_majneedcredit) {
		this.dep_majneedcredit = dep_majneedcredit;
	}
	public int getDep_minneedcredit() {
		return dep_minneedcredit;
	}
	public void setDep_minneedcredit(int dep_minneedcredit) {
		this.dep_minneedcredit = dep_minneedcredit;
	}
	public int getDep_mulcredit() {
		return dep_mulcredit;
	}
	public void setDep_mulcredit(int dep_mulcredit) {
		this.dep_mulcredit = dep_mulcredit;
	}
	public char getDep_revokeyn() {
		return dep_revokeyn;
	}
	public void setDep_revokeyn(char dep_revokeyn) {
		this.dep_revokeyn = dep_revokeyn;
	}
	public String getDep_phone() {
		return dep_phone;
	}
	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	public String getDep_engname() {
		return dep_engname;
	}
	public void setDep_engname(String dep_engname) {
		this.dep_engname = dep_engname;
	}


}

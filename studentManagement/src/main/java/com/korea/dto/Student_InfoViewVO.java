package com.korea.dto;

/**
 * 학생정보 VIEW_VO
 * 
 * @param
 * sp_use_id : 아이디<br>
 * sp_div_no : 부서번호<br>
 * sp_pwd : 비밀번호<br>
 * sp_stat : 재직상태<br>
 * sp_birth : 생년월일<br>
 * sp_phone : 핸드폰번호<br>
 * sp_zipcode : 우편번호<br>
 * sp_add : 주소<br>
 * sp_adddetail : 상세주소<br>
 * sp_bltype : 혈액형<br>
 * sp_hob : 취미<br>
 * sp_gender : 성별<br>
 * sp_engname : 영어이름<br>
 * sp_email : 이메일<br>
 * sp_regno1 : 주민번호앞자리<br>
 * sp_regno2 : 주민번호뒷자리
 * 
 * ----수정중-----
 * 
 * @version 박진성, 1.0, 2016.08.29, 초기 작성
 * @author 박진성
 *
 */

public class Student_InfoViewVO {

	private String use_id;
	private String use_kind;
	private String use_name;
	private char enabled;
	private String use_pwd;
	private String authority;
	private String stud_use_id;
	private int stud_af_no;
	private String stud_stat;
	private String stud_majcredit;
	private String stud_libcredit;
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
	private String dep_revokeyn;
	private String dep_phone;
	private String dep_engname;

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 교수정보등록FORM
 * @author 
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *   16.09.05  이수정          최초구현
 *    -------      -------     -------------------
 *   16.09.26  한돈희          유효성
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<!-- 교수정보등록 -->
	
<script type="text/javascript" src="/emp/js/default.js"></script>
<script>
	$(function(){
		$("#insertBtn").click(function(){
			//유효성 check
			var name = /[a-zA-Z가-힣]{2,4}/;
	        var addr = /[a-zA-Z0-9가-힣]{1,20}/;
	        var tel = /[010][1-9]{1}[0-9]{3}[0-9]{4}/;
	        var mail = /^[a-zA-Z0-9]{1,15}$/;
	        var pwd = /[a-z0-9]{8}/;
	        
	        //value
	        var nameVal = $("#use_name").val(); //이름값
	        var engNameVal = $("#pro_engname").val(); //영문이름값
	        var depNo = $("#pro_dep_no").val(); //학과번호
	        var birth = $("#pro_birth").val(); //생년월일
	        var phone = $("#pro_phone").val(); //핸드폰번호
	        var zipCode = $("#pro_zipcode").val(); //우편번호
	        var add = $("#pro_add").val(); //주소
	        var addDetail = $("#pro_adddetail").val(); //상세주소
	        var bltType = $("#pro_bltype").val(); //혈액형
	        var hobby = $("#pro_hob").val(); //취미
	        var gendar = $("#pro_gender").val(); //성별
	        var email = $("#pro_email").val(); //이메일
	        var regno1 = $("#pro_regno1").val(); //주민앞
	        var regno2 = $("#pro_regno2").val(); //주민뒤
	        
	        if(name.test(nameVal) != true){
				swal({
					title: "< Error! >",
					text: "이름 형식이 맞지 않습니다.",
					type: "error",
					confirmButtonText: "닫기" 
				}); 
				return false;
	        }else if(nameVal == null){
	        	swal({
					title: "< Error! >",
					text: "이름을 입력해주세요.",
					type: "error",
					confirmButtonText: "닫기" 
				}); 
	        }
		});
	});
	
	function insertPro(){
		document.proInsertForm.method="post";
		document.proInsertForm.action="/emp/proInfoInsert";
		document.proInsertForm.submit();
	};

</script>
	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>교수정보등록</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form name="proInsertForm" class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">이름</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="이름" name="use_name" id="use_name">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">영문명</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="영문명" name="pro_engname" id="pro_engname">
                        </div>
                      </div>
                     
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">학과번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_dep_no" id="pro_dep_no">
                          	<option selected>학과번호선택</option>
                          	<c:forEach var="department" items="${departmentList}">
								<option value="${department.dep_no}">${department.dep_name} (학과코드 : ${department.dep_no})</option>
			               	</c:forEach>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">생년월일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="생년월일" name="pro_birth" id="pro_birth">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">핸드폰번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="핸드폰번호" name="pro_phone" id="pro_phone">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">우편번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="우편번호" name="pro_zipcode" id="pro_zipcode">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주소</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="주소" name="pro_add" id="pro_add">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">상세주소</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="상세주소" name="pro_adddetail" id="pro_adddetail">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">혈액형</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_bltype" id="pro_bltype">
                          	<option selected>선택해주세요</option>
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="AB">AB</option>
                            <option value="O">O</option>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">취미</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="취미" name="pro_hob" id="pro_hob">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">성별</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_gender" id="pro_gender">
                          	<option selected>선택해주세요</option>
                            <option value="남자">남자</option>
                            <option value="여자">여자</option>
                          </select>
                        </div>
                      </div>
                     
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">이메일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="email" class="form-control" placeholder="이메일" name="pro_email" id="pro_email">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주민등록번호앞자리</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="주민등록번호뒷자리" name="pro_regno1" id="pro_regno1">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주민등록번호뒷자리</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" placeholder="주민등록번호뒷자리" name="pro_regno2" id="pro_regno2">
                        </div>
                      </div>
                      
                      <div style="text-align:center;">
		                <button type="button" class="btn btn-dark" id="insertBtn">등록</button>
		                <button type="button" class="btn btn-dark" onclick="javascript:history.go(-1);">취소</button>
                      </div>   
                    </form>
                  </div>
                </div>
	

			<!-- /page content -->
		</div>
	
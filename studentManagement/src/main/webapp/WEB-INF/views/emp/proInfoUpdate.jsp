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
 * @since  2016.08.30.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    2016.08.30.  	이수정      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<!-- 교수정보수정 -->
	
<script type="text/javascript" src="/emp/js/default.js"></script>

	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>교수정보등록</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form name="proUpdateForm" class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">이름</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="use_name" value="${professorDetailViewVO.use_name}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">영문명</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_engname"  value="${professorDetailViewVO.pro_engname}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">직책</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_position">
                          	<option selected>선택해주세요</option>
                          	
                            <option value="학과장"<c:if test="${professorDetailViewVO.pro_position=='학과장'}">selected</c:if> >학과장</option>
                            <option value="일반교수"<c:if test="${professorDetailViewVO.pro_position=='일반교수'}">selected</c:if>>일반교수</option>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">학과번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_dep_no">
                          	<option selected>학과번호선택</option>
                          	<c:forEach var="department" items="${departmentList}">
								<option value="${department.dep_no}" <c:if test="${professorDetailViewVO.pro_dep_no==department.dep_no}">selected</c:if> >${department.dep_no}</option>
			               	</c:forEach>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">생년월일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" readonly="readonly" name="pro_birth" value="${professorDetailViewVO.pro_birth}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">핸드폰번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_phone" value="${professorDetailViewVO.pro_phone}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">우편번호</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_zipcode" value="${professorDetailViewVO.pro_zipcode}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주소</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_add" value="${professorDetailViewVO.pro_add}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">상세주소</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_adddetail" value="${professorDetailViewVO.pro_adddetail}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">혈액형</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_bltype" readonly="readonly" value="${professorDetailViewVO.pro_bltype}">
                          	<option selected>선택해주세요</option>
                            <option value="A" <c:if test="${professorDetailViewVO.pro_bltype=='A'}">selected</c:if>>A</option>
                            <option value="B" <c:if test="${professorDetailViewVO.pro_bltype=='B'}">selected</c:if>>B</option>
                            <option value="AB" <c:if test="${professorDetailViewVO.pro_bltype=='AB'}">selected</c:if>>AB</option>
                            <option value="O" <c:if test="${professorDetailViewVO.pro_bltype=='O'}">selected</c:if>>O</option>
                          </select>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">취미</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="pro_hob" value="${professorDetailViewVO.pro_hob}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">성별</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="pro_gender" readonly="readonly" value="${professorDetailViewVO.pro_gender}">
                          	<option selected>선택해주세요</option>
                            <option value="남자" <c:if test="${professorDetailViewVO.pro_gender=='남자'}">selected</c:if>>남자</option>
                            <option value="여자" <c:if test="${professorDetailViewVO.pro_gender=='여자'}">selected</c:if>>여자</option>
                          </select>
                        </div>
                      </div>
                     
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">이메일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="email" class="form-control" name="pro_email" value="${professorDetailViewVO.pro_email}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주민등록번호앞자리</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" readonly="readonly"  name="pro_regno1" value="${professorDetailViewVO.pro_regno1}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">주민등록번호뒷자리</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" readonly="readonly"  name="pro_regno2" value="${professorDetailViewVO.pro_regno2}">
                          <input type="hidden" value="${professorDetailViewVO.pro_use_id }" name="pro_use_id">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">재직상태</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control" name="enabled"  value="${professorDetailViewVO.enabled}">
                          	<option selected>선택해주세요</option>
                            <option value="1" <c:if test="${professorDetailViewVO.enabled=='1'}">selected</c:if>>재직</option>
                            <option value="2" <c:if test="${professorDetailViewVO.enabled=='2'}">selected</c:if>>퇴직</option>
                          </select>
                        </div>
                      </div>
                      
                      
                      <div style="text-align:center;">
		                <button type="button" class="btn btn-dark" onclick="updatePro('proUpdateForm');" >수정</button>
		                <button type="button" class="btn btn-dark">취소</button>
                      </div>   

                    </form>
                  </div>
                </div>
	

			<!-- /page content -->
		</div>
	
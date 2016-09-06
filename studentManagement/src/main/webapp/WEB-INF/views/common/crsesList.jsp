<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<!-- Ion.RangeSlider -->
    <link href="../vendors/normalize-css/normalize.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bootstrap Colorpicker -->
    <link href="../vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="../vendors/cropper/dist/cropper.min.css" rel="stylesheet">
	<!-- Custom Theme Style -->
	<link href="/stu/css/custom.min.css" rel="stylesheet">
	


	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					수강신청조회
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
			
			
			<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">년도</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control">
                            <option>2016</option>
                            <option>2015</option>
                            <option>2014</option>
                            <option>2013</option>
                            <option>2012</option>
                          </select>
                        </div>
                       
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">학기</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control">
                            <option>1학기</option>
                            <option>2학기</option>
                          </select>
                        </div>
               <div style="text-align:right;">
              <button type="button" class="btn btn-dark">조회</button>
			<button type="button" class="btn btn-dark">출력</button>
                    	</div>
           
			      
			<div class="x_content">
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>학과</th>
                          <th>강의등록번호</th>
                          <th>학수번호</th>
                          <th>개설학기</th>
                          <th>개설년도</th>
                          <th>과목명</th>
                          <th>이수구분</th>
                          <th>학점</th>
                          <th>강의시간</th>
                          <th>교수</th>
                          <th>사이버캠퍼스</th>
                        </tr>
                      </thead>

				<!-- 과목누르면 사이버캠퍼스로 이동 -->


<!-- 							
		사용자이름 use_name;
	학생아이디 stud_use_id;
	학과명 dep_name;
	전공구분 mk_name;
	학점 lb_credit;
	강의명 lb_name;
	강의등록번호 lec_no;
	학수번호 lec_lb_no; -->
<!--  lec_makesemester 개설학기
	lec_makeyear  -->
	
	
                      <tbody>
                      <c:forEach items="${student_InquiryList_ViewVO }" var="student_InquiryList_ViewVO">
                       <form action="/cyberCampus/stu/cyberClassMain" method="post">
                       <tr>	
                          <td>${student_InquiryList_ViewVO.dep_name }</td>
                          <td>${student_InquiryList_ViewVO.lec_no }</td>
                          <td>${student_InquiryList_ViewVO.lec_makesemester }</td>
                          <td>${student_InquiryList_ViewVO.lec_makeyear }</td>
                          <td>${student_InquiryList_ViewVO.lec_lb_no }</td>
                          <td>${student_InquiryList_ViewVO.lb_name }</td>
                          <td>${student_InquiryList_ViewVO.mk_name }</td>
                          <td>${student_InquiryList_ViewVO.lb_credit }</td>
                          <td>${student_InquiryList_ViewVO.tt_time }</td>
                          <td>${student_InquiryList_ViewVO.use_name }</td>
                          <td><input type="submit" value ="사이버캠퍼스 이동" class="btn btn-info btn-xs">
                          	<input type="hidden" name="lec_no" value="${student_InquiryList_ViewVO.lec_no }"/>
                          </td>
                      </tr>
                         </form>
                        </c:forEach>
                            
                      </tbody>
                    </table>
                  </div>
                     
       
			

				<!-- x-content -->
			</div>		
		</div>
	</div>
					<!-- /page content -->
	</div>
			
			
		

		
	<!-- Ion.RangeSlider -->
    <script src="../vendors/ion.rangeSlider/js/ion.rangeSlider.min.js"></script>
    <!-- Bootstrap Colorpicker -->
    <script src="../vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
    <!-- jquery.inputmask -->
    <script src="../vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>
    <!-- jQuery Knob -->
    <script src="../vendors/jquery-knob/dist/jquery.knob.min.js"></script>
    <!-- Cropper -->
    <script src="../vendors/cropper/dist/cropper.min.js"></script>
		
			<!-- Custom Theme Scripts -->
			<script src="/stu/js/custom.min.js"></script>
	
	
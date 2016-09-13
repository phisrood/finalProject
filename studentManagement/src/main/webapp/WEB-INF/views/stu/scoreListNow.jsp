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
    <link href="/stu/css/normalize.css" rel="stylesheet">
    <link href="/stu/css/ion.rangeSlider.css" rel="stylesheet">
    <link href="/stu/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bootstrap Colorpicker -->
    <link href="/stu/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="/stu/css/cropper.min.css" rel="stylesheet">
	<!-- Custom Theme Style -->
	<link href="/stu/css/custom.min.css" rel="stylesheet">


<!-- 현재학기성적조회 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-calendar"></i> 현재학기성적조회
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
          
			<div class="x_content">
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                       <tr>
                          <th>학수번호</th>
                          <th>과목명</th>
                          <th>이수구분</th>
                          <th>학점</th>
                          <th>점수</th>
                          <th>등급</th>
                          <th>취득여부</th>
                        </tr>
                      </thead>


                      <tbody>
                      	<c:forEach var ="score" items ="${scoreList}" varStatus="status">
	                     	<tr>
	                     		<td>${score.lec_lb_no}</td>
	                     		<td>${score.lb_name}</td>
	                     		<td>${score.lb_completekind}</td>
	                     		<td>${score.lb_credit}</td>
	                     		<td>${score.cb_score}</td>
	                     		<td>${score.cb_grade}</td>
	                     		<td>${score.cb_acquistionyn}</td>
	                     	</tr>
                      	</c:forEach>
                      </tbody>
                    </table>

	
                  </div>
                  <div class="form-group">
                    <label>총 신청학점</label>
                    <span>${scoreInfo.totalCredit}</span>
                    <label>총 점수</label>
                    <span>${scoreInfo.totalScore}</span>
                    <label>총 취득학점</label>
                    <span>${scoreInfo.totalAcq}</span>
                    <label>총 평점평균</label>
                    <span>${scoreInfo.avgScore}</span>
                  </div>
       
			

				<!-- x-content -->
		</div>
	</div>
					<!-- /page content -->
	</div>

		

		
	<!-- Ion.RangeSlider -->
    <script src="/stu/js/ion.rangeSlider.min.js"></script>
    <!-- Bootstrap Colorpicker -->
    <script src="/stu/js/bootstrap-colorpicker.min.js"></script>
    <!-- jquery.inputmask -->
    <script src="/stu/js/jquery.inputmask.bundle.min.js"></script>
    <!-- jQuery Knob -->
    <script src="/stu/js/jquery.knob.min.js"></script>
    <!-- Cropper -->
    <script src="/stu/js/cropper.min.js"></script>
		
	
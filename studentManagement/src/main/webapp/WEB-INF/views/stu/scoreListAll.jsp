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
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Ion.RangeSlider -->
<link href="/bootstrap/css/normalize.css" rel="stylesheet">
<link href="/bootstrap/css/ion.rangeSlider.css" rel="stylesheet">
<link href="/bootstrap/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
<!-- Bootstrap Colorpicker -->
<link href="/bootstrap/css/bootstrap-colorpicker.min.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="/bootstrap/css/custom.min.css" rel="stylesheet">


<!-- 전체성적조회 -->

<div class="row">

	<!-- page content -->
	<div class="x_panel">

		<div class="x_title">
			<h2>
				<i class="fa fa-line-chart"></i> 전체성적조회
			</h2>
			<ul class="nav navbar-right panel_toolbox"></ul>
			<div class="clearfix"></div>
		</div>
				
	
			<div class="x_content">

				<table id="datatable"
					class="table table-striped jambo_table bulk_action">
					<thead>
						<tr>
							<th>년도</th>
							<th>학기</th>
							<th>학수번호</th>
							<th>과목</th>
							<th>이수구분</th>
							<th>학점</th>
							<th>점수</th>
							<th>등급</th>
							<th>평점</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="score" items="${scoreMap.scoreList}">
							<tr>
								<td>${score.lec_makeyear }</td>
								<td>${score.lec_makesemester}</td>
								<td>${score.lec_lb_no }</td>
								<td>${score.lb_name }</td>
								<td>${score.lb_completekind }</td>
								<td>${score.lb_credit }</td>
								<td>${score.cb_score }</td>
								<td>${score.cb_grade }</td>
								<td>${scoreMap[score]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<form class="form-inline">
					<div class="form-group">
						<label>총 신청학점</label> <input type="text" class="form-control"
							value="${scoreMap.totalCredit }" readonly="readonly">
					</div>
					<div class="form-group">
						<label>총 점수</label> <input type="text" class="form-control"
							value="${scoreMap.totalScore }" readonly="readonly">
					</div>

					<div class="form-group">
						<label>총 평점평균</label> <input type="text" class="form-control"
							value="${scoreMap.totalScore/scoreMap.totalCredit}"
							readonly="readonly">
					</div>

				</form>


				<!-- x-content -->
			</div>
			<!-- /page content -->
		</div>
</div>
	
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

<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();
	})
</script>
<!-- 교과목수강명단조회 -->

<div class="row">

	<!-- page content -->


	<div class="x_panel">

		<div class="x_title">
			<h2>
				<i class="fa fa-calendar"></i> 수강편람조회
			</h2>
			<ul class="nav navbar-right panel_toolbox"></ul>
			<div class="clearfix"></div>
		</div>


		<div class="x_content">
			<div class="x_content">

				<table id="datatable"
					class="table table-striped jambo_table bulk_action">
					<thead>
						<tr>
							<th>학수번호</th>
							<th>교과목명</th>
							<th>개설학과</th>
							<th>이수구분</th>
							<th>학점</th>
							<th>승인여부</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lb" items="${crsesBookList}">
							<tr>
								<td>${lb.lb_no }</td>
								<td>${lb.lb_name }</td>
								<td>${lb.lb_department }</td>
								<td>${lb.lb_completekind }</td>
								<td>${lb.lb_credit }</td>
								<td><c:choose>
										<c:when test="${lb.lb_approvalyn=='Y'}">
										승인
									</c:when>
										<c:when test="${lb.lb_approvalyn=='N' }">
										대기
									</c:when>
										<c:otherwise>
										반려
									</c:otherwise>
									</c:choose></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<!-- x-content -->
		</div>
	</div>
</div>
<!-- /page content -->


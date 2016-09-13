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
<script src="/pro/js/default.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();
	})
</script>
<!-- 수강편람조회 -->

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
							<c:if test="${loginUser.authority eq 'ROLE_PRO' }">
								<th>승인여부</th>
								<th>수정</th>
								<th>강의개설</th>
							</c:if>
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
								<c:if test="${loginUser.authority eq 'ROLE_PRO' }">
									<c:choose>
										<c:when test="${lb.lb_approvalyn=='Y'}">
										<td>승인</td>
									
										<td><button onclick="updateCrsesBook('${lb.lb_no}');">수정</button>
									</td>
									<td><button onclick="openLecture('${lb.lb_no}');">강의개설</button></td>
									</c:when>
									<c:when test="${lb.lb_approvalyn=='N' }">
										<td>대기</td>
										<td></td>
										<td></td>
									</c:when>
									<c:otherwise>
										<td>반려</td>
										<td></td>
										<td></td>
									</c:otherwise>
									</c:choose>

								</c:if>
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


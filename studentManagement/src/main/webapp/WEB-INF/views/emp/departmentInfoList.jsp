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


<%@page import="com.korea.dto.DepartmentVO"%>
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
	});
</script>
<!-- 학과정보관리 -->

<form>
	<div class="row">
		<div class="x_panel_big">
			<div class="x_panel">

				<div class="x_title">
					<h2>학과정보관리</h2>
					<div class="clearfix"></div>
				</div>

				<div style="text-align: right;">
					<a href="/emp/departmentInsertForm" >
					<button type="button" class="btn btn-dark">
						등록
					</button>
					</a>
					<button type="button" class="btn btn-dark"
						onclick='revoke(this.form);'>폐지</button>
				</div>

				<div class="x_content">

					<table id="datatable"
						class="table table-striped jambo_table bulk_action">
						<thead>
							<tr>
								<th>구분</th>
								<th>NO</th>
								<th>학과코드</th>
								<th>학과명</th>
								<th>학과명(영문)</th>
								<th>전화번호</th>
								<th>학과정보수정</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="department" items="${departmentList}"
								varStatus="sta">
								<tr>
									<td><input type="checkbox" name="dep_no"
										value="${department.dep_no}"></td>

									<script>
										function revoke(form) {
											var count = 0;
											for (var i = 0; i < form.dep_no.length; i++) {
												if (form.dep_no[i].checked == true) {
													count++;
												}
											}
											if (count == 0) {
												alert("폐지할 항목을 선택해 주세요.");

											} else {
												form.action = "/emp/departmentOnOff";
												form.method = "post";
												form.submit();
											}
										}
									</script>

									<td>${departmentListSize-sta.index}</td>
									<td>${department.dep_no}</td>
									<td>${department.dep_name}</td>
									<td>${department.dep_engname}</td>
									<td>${department.dep_phone}</td>
									<td>
										<a href="departmentUpdateForm?dep_no=${department.dep_no }">
										<button type="button" class="btn btn-dark">
											수정
										</button>
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</form>

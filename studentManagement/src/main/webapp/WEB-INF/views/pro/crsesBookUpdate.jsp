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
<head>

<style>
html, body {
	overflow: hidden;
}

h2 {
	display: inline;
}
</style>
</head>
<body>
	<script src="/common/js/notice.js"></script>
	<script src="/pro/js/default.js"></script>
	
	<div class="row">
		<!-- page content -->
		<div class="x_panel">
			<div class="x_title">
				<h2>수강편람 수정</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<br />
				<form name="lbUpdateForm" class="form-horizontal form-label-left">
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학수번호</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" id="lb_no" value="${lb.lb_no }"
								placeholder="학수번호" name="lb_no" readonly="readonly"> <span id="lbNoCheck">
							</span>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">교과목명</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="교과목명" value="${lb.lb_name }"
								name="lb_name">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">개설학과</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" name="lb_department"
								value="${lb.lb_department }" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학점</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="학점" value="${lb.lb_credit }"
								name="lb_credit">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">이수구분</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<select class="form-control" name="lb_completekind">
								<option selected>선택해주세요</option>
								<option value="전공">전공</option>
								<option value="교양">교양</option>
							</select>
						</div>
					</div>
					<div style="text-align: center;">
						<button type="button" class="btn btn-dark"
							onclick="updateLB('this.form');">수정</button>
						<button type="button" class="btn btn-dark" onclick="javascript:history.go(-1);">취소</button>
					</div>
				</form>
			</div>
		</div>
		<!-- /page content -->
	</div>

</body>
</html>
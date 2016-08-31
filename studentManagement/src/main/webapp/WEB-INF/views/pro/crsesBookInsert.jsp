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

<script src="/common/js/notice.js"></script>
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
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학수번호</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="학수번호"
								name="lec_no">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">교과목명</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="교과목명"
								name="lb_name">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">개설학과</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="개설학과"
								name="lb_department">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">분반</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="분반"
								name="lec_placement">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학점</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="학점"
								name="lec_credit">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">이수구분</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="이수구분"
								name="pro_zipcode">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">교번</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="교번"
								name="pro_add">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">담당교수</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="담당교수"
								name="pro_adddetail">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">비고</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="비고"
								name="pro_adddetail">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">수업계획서
							첨부파일</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="수업계획서"
								name="pro_hob">
						</div>
					</div>
					<div style="text-align: center;">
						<button type="button" class="btn btn-dark"
							onclick="insertPro('proInsertForm');">등록</button>
						<button type="button" class="btn btn-dark">취소</button>
					</div>

				</form>
			</div>
		</div>
		<!-- /page content -->
	</div>

</body>
</html>
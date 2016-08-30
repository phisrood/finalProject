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
	<div style="float: left; width: 85%;">
		&nbsp;
		<h2>
			<i class="fa fa-bullhorn"></i>학과정보관리
		</h2>
	</div>

	<form name="frm" method="post" action="/emp/departmentInsert">
		<div style="text-align: right">
			<input type="submit" class="btn btn-dark" value="등록" />
			<button type="button" class="btn btn-dark">
				<a href="/emp/departmentInfoList">취소</a>
			</button>   
		</div>
		<br> <br>
		<hr>
		<div>
			<br>
			<div style="float: left; width: 20%;">학과명</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_name" size="38">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">영문명</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_engname" size="38">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">주전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_majneedcredit" size="38">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">부전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_minneedcredit" size="38">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">다전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_mulcredit" size="38">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">전화번호</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_phone" size="38">
			</div>
			<br>
		</div>
	</form>

</body>
</html>

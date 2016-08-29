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

	<form method="post" action="/emp/departmentUpdate">
		<div style="text-align: right">
			<input type="submit" class="btn btn-dark" value="수정" />
			<button type="button" class="btn btn-dark">  
				<a href="/emp/departmentInfoList">취소</a>
			</button>
		</div>
		<br> <br>
		<hr>
		<div>
			<input type="hidden" name="dep_no" value="${department.dep_no }" />
			<br>
			<div style="float: left; width: 20%;">학과명</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_name" size="38"
					value="${department.dep_name }">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">학과명(영문)</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_engname" size="38"
					value="${department.dep_engname }">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">주전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_majneedcredit" size="38"
					value="${department.dep_majneedcredit }">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">부전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_minneedcredit" size="38"
					value="${department.dep_minneedcredit }">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">다전공 졸업학점</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_mulcredit" size="38"
					value="${department.dep_mulcredit }">
			</div>
			<br> <br>
			<div style="float: left; width: 20%;">전화번호</div>
			<div style="float: left; width: 80%;">
				<input type="text" name="dep_phone" size="38"
					value="${department.dep_phone }">
			</div>
			<br>
		</div>
	</form>

</body>
</html>
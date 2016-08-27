<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script src="/common/js/notice.js"></script>
<style>
html, body { 
	overflow : hidden;
}
h2 {
	display : inline;
}
</style>
</head>
<body>
	<div style="float: left; width: 85%;">
		&nbsp;<h2><i class="fa fa-bullhorn"></i>학과정보관리</h2>
	</div>
	<div style="text-align:right">
		<button type="button" class="btn btn-dark">등록</button>
		<button type="button" class="btn btn-dark">취소</button>
	</div><br><br>
	<hr>
    <div>
		<br><div style="float: left; width: 20%;">학과명</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">학과명(영문)</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">주전공 졸업학점</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">부전공 졸업학점</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">다전공 졸업학점</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		
	</div>
</body>
</html>
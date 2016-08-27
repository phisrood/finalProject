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
		<br><div style="float: left; width: 20%;">구분</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">학수번호</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">교과목명</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">개설학과</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">분반</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">학점</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">이수구분</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">교번</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br>
		<br><div style="float: left; width: 20%;">담당교수</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br><br>
		<div style="float: left; width: 20%;">비고</div>
		<div style="float: left; width: 80%;"><textarea rows="5" cols="40" name="contents"></textarea></div>
		<div style="float: left; width: 20%;"><br>수업계획서 첨부 파일</div>
		<div style="float: left; width: 80%;"><br><input type="text" name="title" size="38">&nbsp;<a href="" style="text-decoration:none">찾기</a></div>
		
	</div>
</body>
</html>
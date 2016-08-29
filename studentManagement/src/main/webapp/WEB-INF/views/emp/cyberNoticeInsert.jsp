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
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- 공지사항 쓰기 새창 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
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
		&nbsp;<h2><i class="fa fa-bullhorn"></i>공지 사항</h2>
	</div>
	<div style="float: right; width: 11%; padding: 7px;">
		<input type="button" value="확인">
	</div><br><br>
	<hr>
    <div>
		<br><div style="float: left; width: 20%;">공지 제목</div>
		<div style="float: left; width: 80%;"><input type="text" name="title" size="38"></div><br><br><br>
		<div style="float: left; width: 20%;">공지 내용</div>
		<div style="float: left; width: 80%;"><textarea rows="5" cols="40" name="contents"></textarea></div>
		<div style="float: left; width: 20%;"><br>첨부 파일</div>
		<div style="float: left; width: 80%;"><br><a href="" style="text-decoration:none">첨부 파일.zip 다운로드</a></div>
	</div>
</body>
</html>
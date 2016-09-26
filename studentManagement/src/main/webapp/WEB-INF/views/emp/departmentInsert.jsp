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
<div class="row">

	<div class="x_panel">
         <div class="x_title">
		<h2>
			<i class="fa fa-university"></i>학과정보관리
		</h2>
		<div class="clearfix"></div>
		</div>

	<form name="frm" method="post" action="/emp/departmentInsert">

		<div>
			<br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">학과명</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="학과명" name="dep_name">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">영문명</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="영문명" name="dep_engname">
                 </div>
            </div>
	
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">주전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="주전공 졸업학점" name="dep_majneedcredit">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">부전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="부전공 졸업학점" name="dep_minneedcredit">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">다전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="다전공 졸업학점" name="dep_mulcredit">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">전화번호</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="전화번호" name="dep_phone">
                 </div>
            </div>
			<br>
		</div>
		<div style="text-align: right">
			<input type="submit" class="btn btn-dark" value="등록" />
			<a href="/emp/departmentInfoList">
			<button type="button" class="btn btn-dark">
				취소
			</button>  
			</a> 
		</div>
	</form>
</div>
</div>
</html>

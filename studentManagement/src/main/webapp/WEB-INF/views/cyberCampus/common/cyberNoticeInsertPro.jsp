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

	<!-- Data tables -->
    <link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">


<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>







<script>

$(document).ready(function() {
    $("#submit").click(function() {
       var instance = CKEDITOR.instances.content;
       instance.updateElement();
       $("#output").attr("value",instance.getData());
       if ($("#title").val() == "") {
          alert("제목을 입력하세요.");
          $("#title").focus();
          return false;
       } else if ($("#content").val() == "") {
          alert("내용을 입력하세요.");
          $("#content").focus();
          return false;
       } else if ($("#content").val().length > 4008) {
          $("#content").val($("#content").val().substring(0, 10));
             alert("내용에 최대 4000자까지만 입력할 수 있습니다.");
          $("#content").focus();
             return false;
       } else if ($("#title").val() == "") {
    	   
    	   
       }
    });
 });

 window.onload=function()
 {
  CKEDITOR.replace('content');
 }
 

 
</script> 




	
			<form action="/cyberCampus/pro/cyberNoticeInsertFileUploadContextInsert" method="POST"  enctype="multipart/form-data">
    	<div class="row">
    	<!-- 공지사항( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>공지사항</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			
			
		
			<div class="x_panel_big">
			
			
			
				<table id="datatable" class="table table-striped jambo_table bulk_action">
					<tr>
						<td>
							제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;: &nbsp;
							<input name="title" id="title" type="text" size="50" >
						</td>
					</tr>
					
					<tr>
						<td>
						<div style="float: left; width: 94%;"><input type="file" name="file" /></div>
							
						</td>
					</tr>
					<tr>
						<td>
							<textarea id="content" name="content"></textarea>
							
						</td>
					</tr>
				</table>
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 92%;">
				<button type="button" class="btn btn-default btn-sm">목 록</button>
			</div>
			<div style="float: right; width: 6%;">
				<input type="submit" class="btn btn-default btn-sm" onclick="check();" id="submit" name="submit" value="등록">
				
			</div>
			
    </div>
    </form>
 
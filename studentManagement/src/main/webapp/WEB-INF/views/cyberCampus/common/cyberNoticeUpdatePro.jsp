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
 window.onload=function()
 {
  CKEDITOR.replace('content');
 }
 
</script> 


	
			<form action="/cyberCampus/pro/cyberNoticeInsertFileUploadContextUpdateGo" method="POST" enctype="multipart/form-data">
    	<div class="row">
    	
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>공지사항 ( 수정 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			
			
		
			<div class="x_panel_big">
			
			
			<c:forEach items="${cyber_LectureNoticeViewVO}" var="cyber_LectureNoticeViewVO">
				<table id="datatable" class="table table-striped jambo_table bulk_action">
					<tr>
						<td>
							제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;: &nbsp;
							<input name="title" type="text" size="50" value="${cyber_LectureNoticeViewVO.ln_title}">
						</td>
					</tr>
					
					<tr>
						<td>
						<div style="float: left; width: 94%;"><input type="file" name="file" />
						<c:choose>
						<c:when test="${cyber_LectureNoticeViewVO.af_aftername eq 'defalut'}">
						현재 첨부파일이 없습니다.
						</c:when>
						<c:otherwise>
						현재 첨부파일 : ${cyber_LectureNoticeViewVO.af_aftername}
						
						</c:otherwise>
						</c:choose>
						<input type="hidden" name="af_no" value="${cyber_LectureNoticeViewVO.af_no}"/>
						<input type="hidden" name="af_aftername" value="${cyber_LectureNoticeViewVO.af_aftername}"/>
						<input type="hidden" name="af_realname" value="${cyber_LectureNoticeViewVO.af_realname}"/>
						<input type="hidden" name="af_path" value="${cyber_LectureNoticeViewVO.af_path}"/>
						<input type="hidden" name="ln_no" value="${cyber_LectureNoticeViewVO.ln_no}"/>

						</div>
							
						</td>
					</tr>
					<tr>
						<td>
							<textarea id="content" name="content" >${cyber_LectureNoticeViewVO.ln_content}</textarea>
							
						</td>
					</tr>
				</table>
				 </c:forEach>
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 92%;">
				<a href="/cyberCampus/pro/cyberNoticeList"><button type="button" class="btn btn-default btn-sm">목 록</button></a>
			</div>
			<div style="float: right; width: 6%;">
				<input type="submit" class="btn btn-default btn-sm" value="수정">
				
			</div>
			
    </div>
    </form>
   
    <!-- Datatables -->
    <script src="/stu/js/jquery.dataTables.min.js"></script>
    <script src="/stu/js/dataTables.bootstrap.min.js"></script>
    <script src="/stu/js/dataTables.buttons.min.js"></script>
    <script src="/stu/js/buttons.bootstrap.min.js"></script>
    <script src="/stu/js/buttons.flash.min.js"></script>
    <script src="/stu/js/buttons.html5.min.js"></script>
    <script src="/stu/js/buttons.print.min.js"></script>
    <script src="/stu/js/dataTables.fixedHeader.min.js"></script>
    <script src="/stu/js/dataTables.keyTable.min.js"></script>
    <script src="/stu/js/dataTables.responsive.min.js"></script>
    <script src="/stu/js/responsive.bootstrap.js"></script>
    <script src="/stu/js/datatables.scroller.min.js"></script>
    <script src="/stu/js/jszip.min.js"></script>
    <script src="/stu/js/pdfmake.min.js"></script>
    <script src="/stu/js/vfs_fonts.js"></script>
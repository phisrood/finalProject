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
    
    <div class="row">
    	<!-- Q & A 게시글 상세 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>Q & A ( 상세 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<form method="post" action="/common/qnaBBSUpdate" enctype="multipart/form-data">
			<div class="x_panel_big">
			
				<table id="datatable" class="table table-striped table-bordered">
					<tr>
						<td>
							제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;: &nbsp;
							<input name="title" type="text" size="50"  value="${question_BoardVO.qb_title }">
							<input name="qb_no" type="hidden" value="${question_BoardVO.qb_no }">
							<input name="qb_lec_no" type="hidden" value="${question_BoardVO.qb_lec_no }">
							<input name="qb_af_no" type="hidden" value="${question_BoardVO.qb_af_no }">
							<input name="qb_date" type="hidden" value="${question_BoardVO.qb_date }">
						</td>
					</tr>
					<tr>
						<td>
							작 &nbsp;성 &nbsp;자 &nbsp;: &nbsp;
							<input name="writer" type="text" readonly="readonly" size="30" value="${question_BoardVO.qb_stud_use_id }">&nbsp;&nbsp;등 &nbsp;록 &nbsp;일 &nbsp;: &nbsp;<input name="registration_day" type="text" size="45" readonly="readonly" value="${question_BoardVO.qb_date }"">
						</td>
					</tr>
					<tr>
						<td>
					
							
							
						<c:choose>
                      	<c:when test="${empty attachment_FileVO}">
                      		<div style="float: left; width: 6%;">첨부파일이 없습니다.</div>
                      	</c:when>   
                      	<c:otherwise>
							<div style="float: left; width: 6%;">현재 첨부 파일 <a href="/cyberCampus/stu/qnaBBSFileDownload?af_no=${attachment_FileVO.af_no }">${attachment_FileVO.af_aftername} </div>
							<div style="float: left; width: 94%;">
						
							<c:if test="${auth eq 'ROLE_STU'}">	
							
							<input type="file" name="file">
							
							</c:if>
							</div>
						</c:otherwise>
						</c:choose>
						</td>
					</tr>
					<tr>
						<td>
						
							<div class="x_panel_big"><textarea name="content" style="width:90%;height:30%;border:1;overflow:visible;text-overflow:ellipsis;">${question_BoardVO.qb_content }</textarea></div>
							<div align="center" style="float: left; width: 6%;"><br><br>
                        		<input type="text" id="" required="required" size="5" value="${question_BoardVO.qb_stud_use_id }"  disabled="disabled" style="text-align: center;">
                    		</div>
							<div class="x_panel_big" style="float: left; width: 90%;"><br><br><br><br><br>
							
							
							<c:if test="${auth eq 'ROLE_PRO'}">	
								<input type="text" name="comment" style="float: left; width: 90%;" />
							</c:if>
							<c:if test="${auth eq 'ROLE_STU'}">	
								<input type="text" name="comment" readonly="readonly" style="float: left; width: 90%;" />
							</c:if>
							</div>
							
							
							<div  style="float: right; width: 4%;">
							<c:if test="${auth eq 'ROLE_PRO'}">
								<button type="button" class="btn btn-default btn-sm"><br><br>등 록<br><br><br></button>
							</c:if>
							</div>
							
						</td>
					</tr>
				</table>
				
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 86%;">
				<c:if test="${auth eq 'ROLE_STU'}">	
				<a href="/cyberCampus/stu/qnaBBSList"><button type="button" class="btn btn-default btn-sm">목 록</button></a>
				</c:if>
				<c:if test="${auth eq 'ROLE_PRO'}">	
				<a href="/cyberCampus/pro/qnaBBSList"><button type="button" class="btn btn-default btn-sm">목 록</button></a>
				</c:if>
			</div>
			<div style="float: right; width: 6%;">
				<c:if test="${auth eq 'ROLE_STU'}">	
				<a href="/common/qnaBBSDelete?qb_no=${question_BoardVO.qb_no }"><button type="button" class="btn btn-default btn-sm">삭 제</button></a>
				</c:if>
			</div>
			<div style="float: right; width: 6%;">
				<c:if test="${auth eq 'ROLE_STU'}">	
				<button type="submit" class="btn btn-default btn-sm">수 정</button>
				</c:if>
			</div>
			</form>
			  
    </div>
 
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
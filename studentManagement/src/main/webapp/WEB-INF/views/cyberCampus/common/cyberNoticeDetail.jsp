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
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">

    <div class="row">
    	<!-- 공지 사항 게시글 상세 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 200px; text-align: center;"><h2>공지 사항 ( 상세 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
			
			<c:forEach items="${cyber_LectureNoticeViewVO}" var="cyber_LectureNoticeViewVO">
				<table id="datatable" class="table table-striped jambo_table bulk_action">
					<tr>
						<td>
							제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;:
							${cyber_LectureNoticeViewVO.ln_title}
						</td>
					</tr>
					<tr>
						<td>
							작 &nbsp;성 &nbsp;자 &nbsp;: &nbsp;
							${cyber_LectureNoticeViewVO.use_name}
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							등 &nbsp;록 &nbsp;일 &nbsp;: &nbsp;${cyber_LectureNoticeViewVO.ln_date}
						</td>
					</tr>
					<tr>
						<td>	
							<c:choose>													
							<c:when test="${cyber_LectureNoticeViewVO.af_aftername eq 'default'}">
							<div style="float: left; width: 94%;"  class="btn btn-dark">첨부 파일이 없습니다.</div>
							</c:when>
							<c:otherwise>
							<div style="float: left; width: 94%;"  class="btn btn-dark">첨부파일 :  <a href="/cyberCampus/common/cyberNoticeFileDown?af_no=${cyber_LectureNoticeViewVO.af_no}"> ${cyber_LectureNoticeViewVO.af_aftername}</a></div>
							</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td>
							<div class="x_panel_big">${cyber_LectureNoticeViewVO.ln_content}<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>
							
						
						</td>
					</tr>
				</table>
				</c:forEach>
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 98%;">
				<a href="/cyberCampus/stu/cyberNoticeList"><button type="button"  class="btn btn-dark">목 록</button></a>
			</div>
    </div>
    <!-- Datatables -->
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
    <script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
    <script src="/bootstrap/js/dataTables.buttons.min.js"></script>
    <script src="/bootstrap/js/buttons.bootstrap.min.js"></script>
    <script src="/bootstrap/js/buttons.flash.min.js"></script>
    <script src="/bootstrap/js/buttons.html5.min.js"></script>
    <script src="/bootstrap/js/buttons.print.min.js"></script>
    <script src="/bootstrap/js/dataTables.fixedHeader.min.js"></script>
    <script src="/bootstrap/js/dataTables.keyTable.min.js"></script>
    <script src="/bootstrap/js/dataTables.responsive.min.js"></script>
    <script src="/bootstrap/js/responsive.bootstrap.js"></script>
    <script src="/bootstrap/js/dataTables.scroller.min.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>
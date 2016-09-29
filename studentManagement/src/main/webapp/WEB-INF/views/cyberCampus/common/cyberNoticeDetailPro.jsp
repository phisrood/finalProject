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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Data tables -->
<link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">


<c:forEach items="${cyber_LectureNoticeViewVO}" var="cyber_LectureNoticeViewVO">
	<!-- 공지상세보기 -->
	<div class="row">

		<!-- page content -->
		<div class="x_panel_big" style="height: 1000px;">
			<div class="x_title">
				<h2>공지사항</h2>

				<div class="clearfix"></div>
			</div>
			<div class="x_content" style="height: 80%">
				<br /> 

				<div class="form-group" style="min-height: 50px; max-height: 100px; overflow: auto; font-size: 20px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
							${cyber_LectureNoticeViewVO.ln_title} 
					</div>
				</div>
				<div class="form-group" style="font-size: 20px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">작성자</label>
					<div class="col-md-9 col-sm-9 col-xs-12" style="min-height: 50px; max-height: 100px;  overflow: auto;">${cyber_LectureNoticeViewVO.use_name}</div>
				</div>
				<div class="form-group" style="font-size: 20px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">등록일</label>
					<div class="col-md-9 col-sm-9 col-xs-12" style="min-height: 50px; max-height: 100px;   overflow: auto;">${cyber_LectureNoticeViewVO.ln_date}</div>
				</div>
				<div class="form-group" style="font-size: 20px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12" style="min-height: 500px; max-height: 500px; overflow: auto; border:1px solid black;">
					${cyber_LectureNoticeViewVO.ln_content} 
					</div>
				</div>


				<br />
				<br /> <br />
				<br />
				<div class="form-group" style="font-size: 20px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">

						<c:choose>
							<c:when test="${cyber_LectureNoticeViewVO.af_aftername eq 'default'}">
								<input type="button" class="btn btn-dark" style="width: 200px;" value="첨부파일이 없습니다.">
							</c:when>
							<c:otherwise>

								<a href="/cyberCampus/common/cyberNoticeFileDown?af_no=${cyber_LectureNoticeViewVO.af_no}"> <input type="button" class="btn btn-dark" style="width: 200px;"
									value="${cyber_LectureNoticeViewVO.af_aftername}">
								</a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>




			</div>
			<!-- x-content 끝 -->
		</div>

	
		<div style="text-align: right; height: 20%">

			<a href="/cyberCampus/pro/cyberNoticeList"><button type="button" class="btn btn-dark">목 록</button></a> 
			<a href="/cyberCampus/pro/cyberNoticeInsert"><button type="button" class="btn btn-dark">글쓰기</button></a>
			<a href="/cyberCampus/pro/cyberNoticeInsertFileUploadContextUpdate?ln_no=${cyber_LectureNoticeViewVO.ln_no}"><button type="button" class="btn btn-dark">수정</button></a> 
			<a href="/cyberCampus/pro/cyberNoticeInsertFileUploadContextDelete?ln_no=${cyber_LectureNoticeViewVO.ln_no}"><button type="button" class="btn btn-dark">삭제</button></a>

		</div>
	
	</div>



</c:forEach>
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
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

 
			<div class="row" >
    	<!-- 학습 자료실 게시물 상세 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 250px; text-align: center;"><h2>학습 자료실</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>

	<!-- page content -->
	<div class="x_panel_big" style="height:700px;">
		
		<div class="x_content" style="height: 80%">
			<br />
				<input type="hidden" name="lr_no"
					value="${learningRoomViewVO.lr_no }">
				<input type="hidden" name="lr_lec_no"
					value="${learningRoomViewVO.lr_lec_no }">
				<div class="form-group" style="height: 10%;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<input type="text" class="form-control"
					value="${learningRoomViewVO.lr_title}" disabled="disabled"  style="width: 100%;">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12"  style="height:550px; min-height: 100px; max-height:550px; overflow: scroll;">
						${learningRoomViewVO.lr_content}
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
							<c:if test="${learningRoomViewVO.lr_af_no == 0 }">
								<input type="button" class="btn btn-dark" style="width: 200px;" name="af_aftername" value="첨부파일이 없습니다.">
							</c:if>
							<c:if test="${learningRoomViewVO.lr_af_no != 0 }">
								<a href="/cyberCampus/common/studyBBSFileDown?af_aftername=${learningRoomViewVO.af_aftername}">
									<input type="button" class="btn btn-dark" style="width: 300px;" name="af_aftername"
										value="${learningRoomViewVO.af_realname}">
								</a>
							</c:if>
					</div>
				</div>




		</div>
		</div>    
		<!-- x-content 끝 -->
				<div style="text-align: right; height: 30%">
					<c:if test="${loginUser.authority eq 'ROLE_PRO' }">
						<button class="btn btn-dark" onclick="location.href='/cyberCampus/pro/studyBBSUpdateForm?studyBBS_no=${learningRoomViewVO.lr_no }'">수정</button>
							<a href="/cyberCompus/pro/studyBBSDelete?lr_no=${learningRoomViewVO.lr_no }">
								<button type="button" class="btn btn-dark">삭제</button>
							</a>
					</c:if>
					<button type="button" class="btn btn-dark"
						onclick="javascript:history.go(-1);">뒤로</button>
				</div>
	</div>


	<!-- /page content -->
    
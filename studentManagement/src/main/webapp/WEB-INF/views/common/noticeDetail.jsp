<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--==============================================================
 * 공지사항 상세보기
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    2016.08.30.  	이수정      		최초생성
 *    2016.09.01.  	이수정      		공지상세보기
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

<script src="/common/js/notice.js"></script>

<!-- 공지상세보기 -->

<div class="row">

	<!-- page content -->
	<div class="x_panel_big" style="height:700px;" >
		<div class="x_title">
			<h2>공지사항</h2>

			<div class="clearfix"></div>
		</div>
		<div class="x_content" style="height: 80%">
			<br />
				<input type="hidden" name="cn_no"
					value="${noticeDetailViewVO.cn_no }">
				<div class="form-group" style="height: 10%;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="text" class="form-control"
					value="${noticeDetailViewVO.cn_title}" disabled="disabled"  style="width: 100%;">
					</div>
				</div>
				<div class="form-group"  >
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12" style="min-height: 100px; max-height:500px; overflow: auto;">
						${noticeDetailViewVO.cn_content}
					</div>
				</div>
			<br /><br />
			<br /><br />
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
							<c:if test="${noticeDetailViewVO.cn_af_no == 0 }">
								<input type="button" class="btn btn-dark" style="width: 200px;" name="af_aftername" value="첨부파일이 없습니다.">
							</c:if>
							<c:if test="${noticeDetailViewVO.cn_af_no != 0 }">
								<a href="/common/noticeFileDown?af_aftername=${noticeDetailViewVO.af_aftername}">
									<input type="button" class="btn btn-dark" style="width: 300px;" name="af_aftername"
										value="${noticeDetailViewVO.af_realname}">
								</a>
							</c:if>
					</div>
				</div>




		</div> 
		<!-- x-content 끝 -->
	</div>
				<div style="text-align: right; height: 20%">
					<c:if test="${loginUser.authority eq 'ROLE_EMP' }">
						<button class="btn btn-dark" onclick="location.href='/emp/noticeUpdateForm?notice_no=${noticeDetailViewVO.cn_no }'">수정</button>
							<a href="/emp/noticeDelete?cn_no=${noticeDetailViewVO.cn_no }">
								<button type="button" class="btn btn-dark">삭제</button>
							</a>
					</c:if>
					<button type="button" class="btn btn-dark"
						onclick="javascript:history.go(-1);">뒤로</button>
				</div>
	


	<!-- /page content -->
</div>

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
 *    2016.09.02.  	이수정      		공지사항수정
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

<script src="/common/js/notice.js"></script>
<script>
	function updateNotice(updateNoticeForm) {
		if (document.updateNoticeForm.cn_title.value == "") {
			alert('제목을 입력해주세요');
			document.updateNoticeForm.cn_title.focus();
		} else if (document.updateNoticeForm.cn_content.value == "") {
			alert('내용을 입력해주세요');
			document.updateNoticeForm.cn_content.focus();
		} else {
			document.updateNoticeForm.method = "post";
			document.updateNoticeForm.action = "/emp/noticeUpdate";
			document.updateNoticeForm.submit();

		}
	}
</script>
<!-- 공지상세보기 -->

<div class="row">

	<!-- page content -->
	<div class="x_panel">
		<div class="x_title">
			<h2>공지사항</h2>

			<div class="clearfix"></div>
		</div>
		<div class="x_content">
			<br />
			<form name="updateNoticeForm" class="form-horizontal form-label-left">
				<input type="hidden" name="cn_no"
					value="${noticeDetailViewVO.cn_no }">
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<input type="text" class="form-control" name="cn_title"
							value="${noticeDetailViewVO.cn_title}" style="width: 1000px;">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<textarea class="form-control" name="cn_content"
							style="width: 1000px; height: 500px;">${noticeDetailViewVO.cn_content}</textarea>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<c:choose>
							<c:when test="${loginUser.authority eq 'ROLE_STU' }">
								<c:if test="${noticeDetailViewVO.cn_af_no == 0 }">
									<input type="button" class="btn btn-dark" style="width: 300px;"
										name="af_aftername" value="첨부파일이 없습니다.">
								</c:if>
								<c:if test="${noticeDetailViewVO.cn_af_no != 0 }">
									<a
										href="/stu/noticeFileDown?af_aftername=${noticeDetailViewVO.af_aftername}">
										<input type="button" class="btn btn-dark"
										style="width: 300px;" name="af_aftername"
										value="${noticeDetailViewVO.af_realname}">
									</a>
								</c:if>
							</c:when>
							<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
								<c:if test="${noticeDetailViewVO.cn_af_no == 0 }">
									<input type="button" class="btn btn-dark" style="width: 300px;"
										name="af_aftername" value="첨부파일이 없습니다.">
								</c:if>
								<c:if test="${noticeDetailViewVO.cn_af_no != 0 }">
									<a
										href="/pro/noticeFileDown?af_aftername=${noticeDetailViewVO.af_aftername}">
										<input type="button" class="btn btn-dark"
										style="width: 300px;" name="af_aftername"
										value="${noticeDetailViewVO.af_realname}">
									</a>
								</c:if>
							</c:when>
							<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
								<c:if test="${noticeDetailViewVO.cn_af_no == 0 }">
									<input type="button" class="btn btn-dark" style="width: 300px;"
										name="af_aftername" value="첨부파일이 없습니다.">
								</c:if>
								<c:if test="${noticeDetailViewVO.cn_af_no != 0 }">
									<a
										href="/emp/noticeFileDown?af_aftername=${noticeDetailViewVO.af_aftername}">
										<input type="button" class="btn btn-dark"
										style="width: 300px;" name="af_aftername"
										value="${noticeDetailViewVO.af_realname}">
									</a>
								</c:if>
								<input type="file" id="noticeFileUp" class="btn btn-dark"
									name="file">
							</c:when>
						</c:choose>
					</div>
				</div>



				<div style="text-align: right;">
					<c:choose>
						<c:when test="${loginUser.authority eq 'ROLE_STU' }">

						</c:when>
						<c:when test="${loginUser.authority eq 'ROLE_PRO' }">

						</c:when>
						<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
							<button type="button" class="btn btn-dark"
								onclick="updateNotice('updateNoticeForm');">수정</button>
							<a href="/emp/noticeDelete?cn_no=${noticeDetailViewVO.cn_no }"><button
									type="button" class="btn btn-dark">삭제</button></a>
						</c:when>
					</c:choose>
					<button type="button" class="btn btn-dark"
						onclick="javascript:history.go(-1);">취소</button>
				</div>

			</form>
		</div>
	</div>


	<!-- /page content -->
</div>

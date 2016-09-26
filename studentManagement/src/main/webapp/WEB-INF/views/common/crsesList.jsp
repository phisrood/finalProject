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


<!-- Custom Theme Style -->
<link href="/stu/css/custom.min.css" rel="stylesheet">

<script>
	function cycamGo(form) {
		var cycam = window.open('about:blank', 'cyberCam',
				'width=1400,height=900');
		form.action = '/cyberCampus/stu/cyberClassMain';
		form.target = "cyberCam";
		form.method = "post";
		form.submit();
	}
	function lecturePlan(lec_no) {
		location.href = '/stu/classSYL?lec_no=' + lec_no;
	}
</script>
<div class="row">

	<!-- page content -->
<div class="x_panel">

		<div class="x_title">
			<h2>수강신청조회</h2>
			<ul class="nav navbar-right panel_toolbox"></ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
			<div class="x_content">

				<table id="datatable" class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>학과</th>
							<th>학수번호</th>
							<th>개설학기</th>
							<th>개설년도</th>
							<th>과목명</th>
							<th>이수구분</th>
							<th>학점</th>
							<th>강의시간</th>
							<th>교수</th>
							<th>강의계획서</th>
							<th>사이버캠퍼스</th>
						</tr>
					</thead>

					<!-- 과목누르면 사이버캠퍼스로 이동 -->


					<!-- 							
		사용자이름 use_name;
	학생아이디 stud_use_id;
	학과명 dep_name;
	전공구분 mk_name;
	학점 lb_credit;
	강의명 lb_name;
	강의등록번호 lec_no;
	학수번호 lec_lb_no; -->
					<!--  lec_makesemester 개설학기
	lec_makeyear  -->


					<tbody>
						<c:choose>
							<c:when test="${empty student_InquiryList_ViewVO}">
								<tr>
									<td colspan='11' align="center">수강신청 내역이 없습니다.</td>
								</tr>
							</c:when>

							<c:otherwise>
								<c:forEach items="${student_InquiryList_ViewVO }"
									var="student_InquiryList_ViewVO">
										<tr>
											<td>${student_InquiryList_ViewVO.lb_department }</td>
											<td>${student_InquiryList_ViewVO.lb_no }</td>
											<td>${student_InquiryList_ViewVO.lec_makesemester }</td>
											<td>${student_InquiryList_ViewVO.lec_makeyear }</td>
											<td>${student_InquiryList_ViewVO.lb_name }</td>
											<td>${student_InquiryList_ViewVO.lb_completekind}</td>
											<td>${student_InquiryList_ViewVO.lb_credit }</td>
											<td>${student_InquiryList_ViewVO.classroom }</td>
											<td>${student_InquiryList_ViewVO.use_name }</td>
											<td><button class="btn btn-dark"
													onclick="lecturePlan('${student_InquiryList_ViewVO.lec_no}');">강의계획서</button></td>
									<form action="/cyberCampus/stu/cyberClassMain" method="post">
											<td><input type="submit" value="사이버캠퍼스 이동"
												onclick="cycamGo(this.form)" class="btn btn-info btn-xs">
												<input type="hidden" name="lec_no"
												value="${student_InquiryList_ViewVO.lec_no }" /></td>
									</form>
										</tr>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div>




			<!-- x-content -->
		</div>
	</div>
</div>
<!-- /page content -->


<!-- Custom Theme Scripts -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--==============================================================
 * 공지사항 리스트
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    2016.08.30.  	이수정      		최초생성
 *    2016.09.1.  	이수정      		공지사항전체리스트
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

<div class="row">
             <div class="x_panel_big">
                  <div class="x_title">
                    <h2>강의계획서</h2>
                    <div class="clearfix"></div>
                  </div>
<form name="updateSyl">
<div>
<table border='1' class='kor' style="width:70%; height: 800px; margin-left:200px">
	<tr>
		<th>개설년도/학기</th>
		<td>${lecture.lec_makeyear }/${lecture.lec_makesemester }학기</td>
		<th>개설학과</th>
		<td>${lecture.lb_department }</td>
	</tr>
	<tr>
		<th>학수번호</th>
		<td>${lecture.lec_lb_no }</td>
		<th>분반</th>
		<td>${lecture.lec_placement }</td>
	</tr>
	<tr>
		<th>교과목명</th>
		<td>${lecture.lb_name }</td>
		<th>이수구분</th>
		<td>${lecture.lb_completekind }</td>
	</tr>
	<tr>
		<th>학점</th>
		<td>${lecture.lb_credit }</td>
		<th>강의정원</th>
		<td>${lecture.lec_persons }</td>
	</tr>
	<tr>
		<th colspan="2">담당교수</th>
		<td colspan="2">${lecture.use_name }</td>
	</tr>
	<tr>
		<th colspan="4">
			강의계획서
		</th>
	</tr>
	<tr>
		<th colspan="4">
			강의설명
		</th>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="8" cols="970" id="cs_content" style="resize:none; width:970px;" name="cs_content">${classSYL.cs_content }</textarea> 
		</td>
	</tr>
	<tr>
		<th colspan="4">
			진행방식
		</th>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="8" cols="200" id="cs_progress"style="resize:none;width:970px;" name="cs_progress">${classSYL.cs_progress }</textarea> 
		</td>
	</tr>
	<tr>
		<th>
			교재
		</th>
		<td colspan='3'>
			서명:<input type="text" name="cs_bookname" value="${classSYL.cs_bookname }"/>
			출판년도:<input type="text" name="cs_bookversion" value="${classSYL.cs_bookversion }"/><br/>
			저자:<input type="text" name="cs_writer" value="${classSYL.cs_writer }"/><br/>
			출판사:<input type="text" name="cs_publisher" value="${classSYL.cs_publisher }"/>
		</td>
	</tr>
	<tr>
		<th>중간고사</th>
		<td><input type="text" name="cs_midterm" value="${classSYL.cs_midterm }"/></td>
		<th>기말고사</th>
		<td><input type="text" name="cs_final" value="${classSYL.cs_final }"/></td>
	</tr>
	<tr>
		<th>과제</th>
		<td><input type="text" name="cs_homework" value="${classSYL.cs_homework }"/></td>
		<th>출석</th>
		<td><input type="text" name="cs_attent" value="${classSYL.cs_attent }"/></td>
	</tr>
	
</table>
</div>
<input type="hidden" name="cs_lec_no" value="${lecture.lec_no }">
<div style="text-align:right;">
<button onclick="updateSYLConfirm();" class="btn btn-dark">강의계획서 저장</button>
<button onclick="javascript:history.go(-1)" class="btn btn-dark">취소</button>	
</div>
</form>
</div>
</div>
<script>
	function updateSYLConfirm(){
		$('#cs_content').val($('#cs_content').val().replace("/\n/g", "<br>"));
		$('#cs_progress').val($('#cs_progress').val().replace("/\n/g", "<br>"));
		alert($('#cs_content'));
		alert($('#cs_progress'));
		document.updateSyl.method="get";
		document.updateSyl.action="/pro/updateSylConfirm";
		document.updateSyl.submit();
	}
</script>

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

<script>
	$(function(){
		var indexVal=0;
		//선택된값 강의번호 저장
		var lec_no = $("#lecSec option:selected").val();
		
		$("#lecSec").change(function(){
			lec_no = $("#lecSec option:selected").val();
		});
		
		$.ajax({
			url:"/stu/classAppList",
			method:"get",
			type:"json",
			data:{"lec_no":lec_no},
			success:function(data){
				var htmlCode="";
				
				$.each(data, function(index, value){
					htmlCode+="<tr>";
					htmlCode+="<td>"+(index+1)+"</td>";
					htmlCode+="<td>"+value.lc_appraisalquestion+"</td>";
					htmlCode+="<td><input type='radio' class='check"+index+"' name='check"+index+"' value='5'></td>";
					htmlCode+="<td><input type='radio' class='check"+index+"' name='check"+index+"' value='4'></td>";
					htmlCode+="<td><input type='radio' class='check"+index+"' name='check"+index+"' value='3'></td>";
					htmlCode+="<td><input type='radio' class='check"+index+"' name='check"+index+"' value='2'></td>";
					htmlCode+="<td><input type='radio' class='check"+index+"' name='check"+index+"' value='1'></td>";
					htmlCode+="</tr>";
					indexVal = index+1;
				});
				
				$("#appTable").html(htmlCode);
			},
			error:function(){
				alert("error");
			}
		});
		$("#saveBtn").click(function(){
			//점수 값 저장할 배열 선언
			var checkedValue = new Array();
			
			//평가항목 누락체크
			for(var i = 0; i < indexVal; i++){
				if(!($('.check'+i).is(":checked"))){
					alert((i+1)+"번째 항목의 평가가 누락되었습니다. 평가를 완료해주세요.");
					$('.check'+i).focus();
					return false;
				}
			}
			
			//반복문으로 점수값 배열 저장
			for (var i = 0; i < indexVal; i++) {
				checkedValue[i] = $("input[type=radio][name=check"+i+"]:checked").val();
			}
			

			
			location.href="/stu/classAppSave?lec_no="+lec_no+"&&checkVal="+checkedValue+"";
						
		});
	})
	
</script>

<style>
	.textbox{
		width:80%;
	}
</style>

<!-- 수업평가항목추가:행정 -->
<div class="row">

	<!-- page content -->


	<div class="x_panel">

		<div class="x_title">
			<h2>
				<i class="fa fa-bar-chart"></i> 수업평가
			</h2>
			<ul class="nav navbar-right panel_toolbox"></ul>
			<div class="clearfix"></div>
		</div>





		<div class="x_content">
			<div class="x_content">
				<select id="lecSec">
					<c:forEach var="lecture" items="${lectureList }">
						<option value="${lecture.cb_lec_no }">${lecture.lb_name }</option>
					</c:forEach>
				</select>
				<label>※ 한과목씩 평가 후 저장을 눌러야 저장됩니다. ※</label>
				<br>
				<table id="datatable"
					class="table table-striped jambo_table bulk_action">
					<thead> 
						<tr id="btnGorup">
							<th>구분</th>
							<th style="width: 50%;">평가문항</th>
							<th>매우그렇다(5점)</th>
							<th>그렇다(4점)</th>
							<th>보통이다(3점)</th>
							<th>그렇지않다(2점)</th>
							<th>매우그렇지않다(1점)</th>
						</tr>
					</thead>
					<tbody id="appTable">

					</tbody>
				</table>

				<br />
				<div style="text-align: right;">
					<button type="button" class="btn btn-info btn-s" id="saveBtn">저장</button>
				</div>


			</div>

			<!-- x-content -->
		</div>

	</div>
	<!-- /page content -->
</div>





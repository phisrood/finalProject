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


<!-- 전체성적조회 -->
<script>
	function gradeCal(index){
		var score = $(".score").eq(index).val();
		var grade="";
		if(score>=95){
			grade="A+";
		}else if(score>=90){
			grade="A0";
		}else if(score>=85){
			grade="B+";
		}else if(score>=80){
			grade="B0";
		}else if(score>=75){
			grade="C+";
		}else if(score>=70){
			grade="C0";
		}else if(score>=65){
			grade="D+";
		}else if(score>=60){
			grade="D0";
		}else{
			grade="F";
		}
		$(".grade").eq(index).val(grade);
	}
	$(function(){
		$("#lecSelect").change(function(){
			$.ajax({
				url:"/pro/getStudent",
				method:'get',
				type:'json',
				data:{'lec_no':$("#lecSelect").val()},
				success:function(data){
					var htmlCode = "";
						htmlCode+="<input type='hidden' name='lec_no' value='"+$('#lecSelect').val()+"'>";
					$.each(data.studentList, function(i,v){
						htmlCode+="<tr>";
						htmlCode+="<td>"+v.use_id+"<input type='hidden' name='use_id' class='use_id' value='"+v.use_id+"'/></td>";
						htmlCode+="<td>"+v.dep_name+"</td>";
						htmlCode+="<td>"+v.use_name+"</td>";
						htmlCode+="<td><input type='text' class='score' name='score' onchange='gradeCal("+i+");' value='"+data.cbList[i].cb_score+"'/></td>";
						htmlCode+="<td><input type='text' class='grade' name='grade' readonly='readonly' value='"+data.cbList[i].cb_grade+"'/></td>";
					});
					
					$("#tbody").html(htmlCode);
				},
				error:function(){
					alert('ㄷ에러다');
				}
			});
		});
		
	});
	function inputGrade(form){
		var nullCheck = true;
		$.each($(".score"), function(i,v){
			if(v.value==null || v.value==""){
				nullCheck = false;
			}
		});
		$.each($(".grade"), function(i,v){
			if(v.value==null || v.value==""){
				nullCheck = false;
			}
		});
		if(nullCheck==false){
			alert("빠짐없이 입력해주세요.");
		}else{
		form.action = '/pro/inputGrade';
		form.mehtod = 'get';
		form.submit();
		}
	}
</script>

<div class="row">

	<!-- page content -->
	<div class="x_panel">

		<div class="x_title">
			<h2>
				<i class="fa fa-calendar"></i> 수강생성적조회
			</h2>
			<ul class="nav navbar-right panel_toolbox"></ul>
			<div class="clearfix"></div>
		</div>


		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">강의</label>
			<button type="button" class="btn btn-dark">조회</button>
			<div class="col-md-9 col-sm-9 col-xs-12">
				<select class="form-control" id="lecSelect">
					<option>선택하세요</option>
					<c:forEach var="lecture" items="${lectureList }">
					<option value="${lecture.lec_no }">${lecture.lb_name },${lecture.lec_placement }반</option>
					</c:forEach>
				</select>
			</div>
			<form id='studnetList'>
			<div class="x_content">
				<div class="x_content">
					<table id="datatable"
						class="table table-striped jambo_table bulk_action">
						<thead>
							<tr>
								<th>학번</th>
								<th>학과</th>
								<th>이름</th>
								<th>점수</th>
								<th>등급</th>
							</tr>
						</thead>
						<tbody id="tbody">

						</tbody>
					</table>
					<!-- x-content -->
					<div style="text-align:right;">
					<button type="button" class="btn btn-dark" onclick="inputGrade(this.form);">저장</button>
					</div>
				</div>
			</div>
			</form>
		</div>
		<!-- /page content -->
	</div>
</div>
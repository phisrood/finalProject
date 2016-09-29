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
		$.ajax({
			url:"/emp/classAppList",
			method:"get",
			type:"json",
			success:function(data){
				var htmlCode="";
				
				$.each(data, function(index, value){
					htmlCode+="<tr>";
					htmlCode+="<td>"+(index+1)+"</td>";
					htmlCode+="<td>"+value.am_content+"</td>";
					htmlCode+="<td><button id='delBtn' name='"+value.am_no+"' class='btn btn-info btn-xs'>삭제</button></td>";
					htmlCode+="<td><input type='radio' name='check"+index+"' value='5'></td>";
					htmlCode+="<td><input type='radio' name='check"+index+"' value='4'></td>";
					htmlCode+="<td><input type='radio' name='check"+index+"' value='3'></td>";
					htmlCode+="<td><input type='radio' name='check"+index+"' value='2'></td>";
					htmlCode+="<td><input type='radio' name='check"+index+"' value='1'></td>";
					htmlCode+="</tr>";
				});
				
				$("#appTable").html(htmlCode);
			},
			error:function(){
				alert("error");
			}
		});
		
		$(document).on("click", "#delBtn", function(){
			var am_no = $(this).attr("name");
			
			$.ajax({
				url:"/emp/classAppDelete",
				method:"get",
				type:"json",
				data:{"am_no":am_no},
				success:function(data){
					var htmlCode="";
					alert("항목이 삭제되었습니다.");
					$.each(data, function(index, value){
						htmlCode+="<tr>";
						htmlCode+="<td>"+(index+1)+"</td>";
						htmlCode+="<td>"+value.am_content+"</td>";
						htmlCode+="<td><button id='delBtn' name='"+value.am_no+"' class='btn btn-info btn-xs'>삭제</button></td>";
						htmlCode+="<td><input type='radio' name='check"+index+"' value='5'></td>";
						htmlCode+="<td><input type='radio' name='check"+index+"' value='4'></td>";
						htmlCode+="<td><input type='radio' name='check"+index+"' value='3'></td>";
						htmlCode+="<td><input type='radio' name='check"+index+"' value='2'></td>";
						htmlCode+="<td><input type='radio' name='check"+index+"' value='1'></td>";
						htmlCode+="</tr>";
					});
					
					$("#appTable").html(htmlCode);
					
				},
				error:function(){
					alert("에러");
				}
				
			});
		});
		
		$("#plusBtn").click(function(){
			var content = $("#content").val();
			var indexVal = 0;
				$.ajax({
					url:"/emp/classAppInsert",
					method:"get",
					data:{"content":content},
					type:"json",
					success:function(data){
						var htmlCode="";
						alert("항목이 추가되었습니다.");
						$.each(data, function(index, value){
								htmlCode+="<tr>";
								htmlCode+="<td>"+(index+1)+"</td>";
								htmlCode+="<td>"+value.am_content+"</td>";
								htmlCode+="<td><button id='delBtn' name='"+value.am_no+"' class='btn btn-info btn-xs'>삭제</button></td>";
								htmlCode+="<td><input type='radio' name='check"+index+"' value='5'></td>";
								htmlCode+="<td><input type='radio' name='check"+index+"' value='4'></td>";
								htmlCode+="<td><input type='radio' name='check"+index+"' value='3'></td>";
								htmlCode+="<td><input type='radio' name='check"+index+"' value='2'></td>";
								htmlCode+="<td><input type='radio' name='check"+index+"' value='1'></td>";
								htmlCode+="</tr>";
								indexVal = index;
						});
						$("#content").val("");
						$("#appTable").html(htmlCode);
					},
					error:function(){
						alert("error");
					}
				});
		});	
		
		
		$("#listSave").click(function(){
			location.href="/emp/classAppSave";
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
				<div style="text-align: right;">
				</div>
				<table id="datatable"
					class="table table-striped jambo_table bulk_action">
					<thead>
						<tr id="btnGorup">
							<th>구분</th>
							<th style="width: 40%;">평가문항</th>
							<th></th>
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


			</div>

			<!-- x-content -->
		</div>
		
		<!-- 2.x-content -->
		<div class="x_content">
			<div class="x_content">
				<div>
					<input type="text" style="width: 50%; height: 35px;" id="content">&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button" class="btn btn-info btn-s" id="plusBtn">항목추가</button><br>
					<div style="text-align: right;">
						<button type="button" class="btn btn-info btn-s" id="listSave">문항저장</button>
					</div>
				</div>
				

				<br />
			</div>
		</div>
		<!-- 2.x-content 끝 -->
	</div>
	<!-- /page content -->
</div>





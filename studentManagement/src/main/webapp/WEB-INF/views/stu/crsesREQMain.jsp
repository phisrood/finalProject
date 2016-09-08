<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<style>
	#searchTable{
		width:60%;
		height:80px;
		color: #095c86;
    	font-size: 15px;
	}
	
	#searchTable tr{
		margin-top: 10%;
	} 
	
	#searchTable th{
		width:10%;
	}
	
	#searchTable td{
		width:50%;
	}
	
	#searchTable td input{
		margin-left: 3%;
	}
	
	#searchTable td button{
		margin-left: 30%;
	}
	
</style>

<script>
	$(function(){
		var max = 0;
		var min = 0;
		//로딩시 리스트 출력
		
		$.ajax({
			url:"/crses/stu/crsesAllList",
			method:"get",
			type:"json",
			success:function(data){
				var htmlCode = "";
				//계산
				
				
				$.each(data, function(index, value){
					max = value.lec_persons;
					min = value.lec_persons_count;
					htmlCode += "<tr>";
					htmlCode += "<td>"+value.lb_no+"</td>";
					htmlCode += "<td>"+value.lec_placement+"</td>";
					htmlCode += "<td>"+value.lb_name+"</td>";
					htmlCode += "<td>"+value.classroom+"</td>";
					htmlCode += "<td>"+value.use_name+"</td>";
					htmlCode += "<td>"+value.lb_credit+"</td>";
					htmlCode += "<td>"+value.lb_completekind+"</td>";
					htmlCode += "<td>"+(max-min)+"</td>";
					htmlCode += "<td><button id='reqBtn' class='reqBtn'>신청</td>";
					htmlCode += "<td><button id='sylBtn' class='sylBtn btn btn-info btn-xs'>강의계획서</td>";
					htmlCode += "</tr>";
				});
				$("#resultList").html(htmlCode);
				$(".sylBtn").on("click",function(){ //강의계획서버튼
					alert("뜨나요");
				});
				$(".reqBtn").on("click",function(){ //신청버튼
					alert("뜨나요");
				});
			},
			error:function(){
				alert("에러");
			}
			
		});
	});
</script>

         <div class="row" style="width: 100%; height: 900px;">  

			<div class="x_content">
				<table id="searchTable">
					<tbody>
						<tr id="oneTr">
							<th>조회범위</th>
							<td colspan="2"><input type="radio" value=""> 해당학과 전공,교양 과목  
								<input type="radio" value=""> 전체전공과목
								<input type="radio" value=""> 전체교양과목</td>
						</tr>
						<tr id="twoTr">
							<th>학수번호</th>
							<td><input type="text"></td>
							<td><button>조회</button>
						</tr>
					</tbody>
				</table>
			</div>
            <!-- page content 1 -->
            <div class="x_content" style="height: 45%; overflow:auto;" >
               
                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead> 
                        <tr>
                           <th>학수번호</th>
                           <th>분반</th>
                           <th>과목명</th>
                           <th>수업시간, 강의실</th>
                           <th>교수명</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>가능인원</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody id="resultList">
						<!-- 수강리스트 -->
                     
                     </tbody>
                  </table>
               </div>
            <!-- page content 2 -->
            <div class="x_content" style="height: 40%;">
               
					<h4>수강신청목록</h4>
                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead>
                        <tr>
                           <th>학수번호</th>
                           <th>과목명</th>
                           <th>수업시간</th>
                           <th>강의실</th>
                           <th>교수명</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody>
                        <tr>
                           <td>JAVA</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="취소"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                           <td>SPRING</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="취소"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                     
                     </tbody>
                  </table>
               </div>
               
         </div>
      <!-- /page content -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
        
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();
		
		
		$('.listbtn').click(function(){
			var basic = $(this).attr("id");
			
			$('#submit_list').click();
			
			$.ajax({
				
				url:"/cyberCampus/pro/submitStuList",  //어디로보낼건지?
				method:"get", //어떤타입으로 get, post?
				type:"json", //어떤타입으로 받아올건지? 
				data:{"basic":basic}, //보낼 데이터 key, value
				success : function(data){
					
					var htmlCode ="";
			
				
				
					$.each(data, function(index, value){
						htmlCode+= "<tr>";
						htmlCode+= "<td>"+(index+1)+"</td>";
						htmlCode+= "<td>"+value.hs_stud_use_id+"</td>";
						htmlCode+= "<td><button id='download' class='downBtn btn-info btn-xs' name="+value.hs_af_no+">다운로드</button></td>";
						htmlCode+= "</tr>";
					});
					
					
				
					$("#listInfo").html(htmlCode);
				},
				error : function(){
					
					alert("에러");
				}
			});
			
			$(document).on("click", "#download", function(){
				var af_no = $(this).attr("name");
				alert(af_no);
				location.href="/cyberCampus/pro/submitFileDown?af_no="+af_no+"";
			});
			    //<a href='/cyberCampus/pro/submitFileDown?af_no="+value.hs_af_no+"'>다운로드</a> 잡
		});
	});
	
	
	
</script>
    
    <div class="row">
    	<!-- 과제 ( 학생 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 100px; text-align: center;"><h2>과제</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
           <table id="datatable" class="table table-striped jambo_table bulk_action">
               	<thead>
               		<tr>
                   		<th>등록번호</th>
                   		<th>과제명</th>	
                   		<th>과제제출 시작일</th>
                   		<th>과제제출 종료일</th>
                   		<th>제출현황</th>
                 	</tr>
               	</thead>
               	<c:forEach items="${homeworkVO}" var="homeworkVO" varStatus="status">
               	<tbody>
                 	<tr>
                 	  	<td>${status.count }</td>
                   		<td><a href="/cyberCampus/pro/taskSubmitListDetail?hw_no=${homeworkVO.hw_no}">${homeworkVO.hw_title}</a></td>
                   		<td>${homeworkVO.hw_startdate}</td>
                   		<td>${homeworkVO.hw_enddate}</td>
                   		<td>
         
                   			<button type="button" id="${homeworkVO.hw_no }"  class='listbtn btn-info btn-xs'>제출현황 보기</button>
                   		</td>
                 	</tr>
               	</tbody>
               	</c:forEach>
           	</table>
           	
     
			<div style="float: right; width: 5%;">
					<a href="/cyberCampus/pro/taskSubmitListMove"><button type="button" class="btn btn-default btn-sm">과제등록</button></a>
			</div>
    </div>
    
    
    
      <div id="submit_list" data-toggle="modal" data-target="#CalenderList"></div>
      
      <div id="CalenderList" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" id="myModalLabel2">제출 리스트</h4>
          </div>
          <div class="modal-body">

            <div id="testmodal2" style="padding: 5px 20px;">
                <div class="form-group">
                	<table id="datatable" class="table table-striped jambo_table bulk_action">
                		<thead>
		                	<tr>
		                		<th>순번</th>      		
		                		<th>아이디</th>
		                		<th>첨부파일</th>
		                    </tr>
                		</thead>
                		<tbody id="listInfo">
                		
                		</tbody>
                	</table>
                </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
          </div>
        </div>
      </div>
    </div>
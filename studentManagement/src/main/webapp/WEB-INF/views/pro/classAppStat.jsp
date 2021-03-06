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

  
     
    <script src="/bootstrap/js/raphael.min.js"></script>
    <script src="/bootstrap/js/morris.min.js"></script>
    <script>
      $(function(){
    	var lec_no = $("#lecture option:selected").val();
    	
    	$.ajax({
    		url:"/pro/classAppChart",
    		method:"get",
    		data:{"lec_no":lec_no},
    		type:"json",
    		success:function(info){
    			 Morris.Bar({
    		          element: 'graph_bar',
    		          data: info,
    		          xkey: 'list',
    		          ykeys: ['score'],
    		          labels: ['평균점수'],
    		          barRatio: 5.0,
    		          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
    		          hideHover: 'auto',
    		          resize: true
    		    });
    		},
    		error:function(){ 
    			swal('개설된 강의가 없습니다.');
    		}
    	});
    	
    	$.ajax({
    		url:"/pro/classAppQnaChart",
    		method:"get",
    		data:{"lec_no":lec_no},
    		type:"json",
    		success:function(info){
    			var htmlCode="<ul style='list-style:none; font-size:15px;'>"; 
    			$.each(info, function(index, data){
    				htmlCode += "<li>"+(index+1)+"번 항목 : "+data.lc_appraisalquestion+"</li>"; 
    			});
    			htmlCode+="</ul>";
    			
    			$("#qnaChart").html(htmlCode);
    		},
    		error:function(){
    			swal('개설된 강의가 없습니다.');
    		}
    	});
    	
    	$("#lecture").change(function(){
    		lec_no = $("#lecture option:selected").val();
    		$("#graph_bar").html("");
        	$.ajax({
        		url:"/pro/classAppChart",
        		method:"get",
        		data:{"lec_no":lec_no},
        		type:"json",
        		success:function(info){
        			 Morris.Bar({
        		          element: 'graph_bar',
        		          data: info,
        		          xkey: 'list',
        		          ykeys: ['score'],
        		          labels: ['평균점수'],
        		          barRatio: 5.0,
        		          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
        		          hideHover: 'auto',
        		          resize: true
        		    });
        		},
        		error:function(){
        			swal('개설된 강의가 없습니다.');
        		}
        	});
        	
        	$.ajax({
        		url:"/pro/classAppQnaChart",
        		method:"get",
        		data:{"lec_no":lec_no},
        		type:"json",
        		success:function(info){
        			var htmlCode="<ul style='list-style:none; font-size:15px;'>"; 
        			$.each(info, function(index, data){
        				htmlCode += "<li>"+(index+1)+"번 항목 : "+data.lc_appraisalquestion+"</li>"; 
        			});
        			htmlCode+="</ul>";
        			
        			$("#qnaChart").html(htmlCode);
        		},
        		error:function(){
        			swal('개설된 강의가 없습니다.');
        		}
        	});
    	});
       
        $MENU_TOGGLE.on('click', function() {
          $(window).resize(); //브라우져 윈도우 사이즈 변화가 있을때 window요소.
        });
      });
    </script>
   
	<div class="row">
	              <!-- bar chart -->
	             
		<div class="x_panel" style="height:300px;">
			<div class="x_title"> 
				<h2><i class="fa fa-list"></i> 수업평가항목</h2>
				<div class="clearfix">  
				</div>
			</div>
			<div class="x_content">
				<select class="form-control" id="lecture">
                      <c:forEach var="lectureList" items="${lectureList }">
                        <option value="${lectureList.lec_no }">[개설 : ${lectureList.lec_makeyear}-${lectureList.lec_makesemester}학기 분반 : ${lectureList.lec_placement} 과목명 : ${lectureList.lb_name }]</option>
                      </c:forEach>
                </select>
				<div id="qnaChart" style="width:100%; height:280px;"></div>
			</div>
		</div>
        <!-- page content -->
   

            <div class="clearfix"></div>

              <!-- bar chart -->
             
                <div class="x_panel" style="height:40%;">
                  <div class="x_title">
                    <h2><i class="fa fa-bar-chart"></i> 수업평가통계</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <div id="graph_bar" style="width:100%; height:280px;"></div>
                  </div>
                </div>
              <!-- /bar charts -->

				
    <!-- morris.js -->
    
	</div>


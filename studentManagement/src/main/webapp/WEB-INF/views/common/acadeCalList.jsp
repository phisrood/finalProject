<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!-- FullCalendar -->
    <link href="/bootstrap/css/fullcalendar.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fullcalendar.print.css" rel="stylesheet" media="print">
    
    <!-- FullCalendar -->
    <script src="/bootstrap/js/moment.min.js"></script>
    <script src="/bootstrap/js/fullcalendar.min.js"></script>

<script>
	$(document).ready(function(){
        var date = new Date();
        var d = date.getDate();
        var m = date.getMonth();
        var y = date.getFullYear();
        
		var calendar = $("#calendar").fullCalendar({
			header : {
				left : 'prev,next today',
				center : 'title',
				right : 'month,agendaWeek,agendaDay'
			},
			//클릭하면 모달창 뜨게 해주는거.
			selectable: true,
			selectHelper: true,
			
			
			//업데이트, 딜리트
			eventClick : function(calEvent, jsEvent, view){
				$("#fc_edit").click();
				
				var id = calEvent.id;
				var start = calEvent.start.format("YYYY-MM-DD");
				var end = calEvent.end.format("YYYY-MM-DD");
				var title = calEvent.title;
				var content = calEvent.content;
				
				//창에 값띄우기
				$('#title2').val(title);
				$('#content2').val(content);
				$('#start2').val(start);
				$('#end2').val(end);
		        
			},
			eventLimit: true,
			events : "/common/acadeCalAjax"
				
			
		});
		
		$("#calendarlist").click(function(){
			$("#fc_list").click();
			var one = "2016-01";
			var two = "2016-02";
			var three = "2016-03";
			var four = "2016-04";
			var five = "2016-05";
			var six = "2016-06";
			var seven = "2016-07";
			var eight = "2016-08";
			var nine = "2016-09";
			var ten = "2016-10";
			var eleven = "2016-11";
			var twelve = "2016-12";
			
			$.ajax({
				url:"/common/acadeCalAjax",
				method:"get",
				type:"json",
				success:function(data){
					var oneData = "";
					var twoData = "";
					var threeData = "";
					var fourData = "";
					var fiveData = "";
					var sixData = "";
					var sevenData = "";
					var eightData = "";
					var nineData = "";
					var tenData = "";
					var elevenData = "";
					var twelveData = "";
					$.each(data, function(index, value){
						if(value.start.indexOf(one) >= 0){
							oneData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(two) >= 0){
							twoData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(three) >= 0){
							threeData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(four) >= 0){
							fourData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(five) >= 0){
							fiveData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(six) >= 0){
							sixData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(seven) >= 0){
							sevenData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(eight) >= 0){
							eightData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(nine) >= 0){
							nineData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(ten) >= 0){
							tenData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(eleven) >= 0){
							elevenData += value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						if(value.start.indexOf(twelve) >= 0){
							twelveData = value.start+" ~ "+value.end+"  "+value.title+"<br>";
						}
						
					});
					$("#1월").html(oneData);
					$("#2월").html(twoData);
					$("#3월").html(threeData);
					$("#4월").html(fourData);
					$("#5월").html(fiveData);
					$("#6월").html(sixData);
					$("#7월").html(sevenData);
					$("#8월").html(eightData);
					$("#9월").html(nineData);
					$("#10월").html(tenData);
					$("#11월").html(elevenData);
					$("#12월").html(twelveData);
				}
			});
			
		})
	});

</script>

	<div class="row">
		<div class="x_panel">
			<div class="x_title">
				<h2><i class="fa fa-calendar"></i> 학사일정</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<div style="text-align:right;">
					<button type="button" class="btn btn-dark" id="calendarlist">리스트보기</button>
				</div>
               	<!-- 풀캘린더 div #calendar -->
				<div id='calendar'>
				
				</div>

			</div>
		</div>
	</div>
	
	
	
	<!-- calendar modal -->
    
    
	<!-- 생성창, 수정창 -->
    <div id="fc_edit" data-toggle="modal" data-target="#CalenderModalEdit"></div>
    <div id="fc_list" data-toggle="modal" data-target="#CalenderList"></div>
    
    <!-- 수정모달창 -->
    <div id="CalenderModalEdit" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" id="myModalLabel2">일정 상세</h4>
          </div>
          <div class="modal-body">

            <div id="testmodal2" style="padding: 5px 20px;">
              <form id="antoform2" class="form-horizontal calender" role="form">
                <div class="form-group">
                  <label class="col-sm-3 control-label">제목</label>
                  <div class="col-sm-9">
                    <input type="text" class="form-control" id="title2" name="title2" readonly="readonly">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-3 control-label">상세설명</label>
                  <div class="col-sm-9">
                    <textarea class="form-control" style="height:55px;" id="content2" name="content2" readonly="readonly"></textarea>
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-3 control-label">시작일</label>
                  <div class="col-sm-9">
                    <input type="text" class="form-control" id="start2" name="start2" readonly="readonly">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-3 control-label">종료일</label>
                  <div class="col-sm-9">
                    <input type="text" class="form-control" id="end2" name="end2" readonly="readonly">
                  </div>
                </div>
              </form>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
          </div>
        </div>
      </div>
    </div>


    <!-- /calendar modal -->
    
    <!-- calendar list -->
    <div id="CalenderList" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" id="myModalLabel2">일정 리스트</h4>
          </div>
          <div class="modal-body">

            <div id="testmodal2" style="padding: 5px 20px;">
                <div class="form-group">
                  <c:forEach var="i" begin="1" end="12" step="1">
	                  <h4>${i}월</h4>
	                  <div class="col-sm-9" id="${i}월" style="width:100%;">
	                  
	                  </div>
	                  <br>
                  </c:forEach>
                </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
          </div>
        </div>
      </div>
    </div>

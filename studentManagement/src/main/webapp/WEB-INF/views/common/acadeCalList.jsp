<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
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
	});

</script>

	<div class="row">
		<div class="x_panel">
			<div class="x_title">
				<h2>학사일정</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<div style="text-align:right;">
					<button type="button" class="btn btn-dark">리스트보기</button>
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
    
    <!-- 수정모달창 -->
    <div id="CalenderModalEdit" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" id="myModalLabel2">일정 수정</h4>
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
            <button type="button" class="btn btn-primary antosubmit2" id="updateBtn">수정</button>
            <button type="button" class="btn btn-primary antosubmit3" id="deleteBtn">삭제</button>
          </div>
        </div>
      </div>
    </div>


    <!-- /calendar modal -->

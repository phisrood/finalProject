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
/*  		//로딩될때 일정가져오기
		$.ajax({
			url:"/common/acadeCalAjax",
			method:"get",
			type:"json",
			success:function(data){
				alert("success");
				var eventData;
				$.each(data, function(index, value){
					eventData = {
						id:value.cc_no,
						title:value.cc_title,
						content:value.cc_content,
						start:value.cc_start_date,
						end:value.cc_end_date
					};
				});
			}
		}); */
		
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
			//셀렉트 시작날짜, 끝 날짜
			select : function(start, end){
				$("#fc_create").click();
				
				var started = start;
				var ended = end;
				
				$(".antosubmit").on("click", function(){
					var title = $("#title").val();
					var descr = $("#descr").val();
					
					if(end){
						ended = end;
					}
					
					categoryClass = $("#event_type").val();
					//alert(started+"//"+ended)
					
					if(title){
						calendar.fullCalendar('renderEvent', {
							id : obj.id,
							title : obj.title,
							content : obj.content,
							start : start,
							end : end
						},
						true
						);
					}
				});
			},
			
			//업데이트, 딜리트
			eventClick : function(calEvent, jsEvent, view){
				$("#fc_edit").click();
				
				$('#title2').val(calEvent.title);
				$('#content2').val(calEvent.content);
			},
			editable: true,
			eventLimit: true,
			events : $(function(){
				$.ajax({
					url:"/common/acadeCalAjax",
					method:"get",
					type:"json",
					success:function(data){
					 	alert("success");
					}
				});
			})
				
			
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
    <div id="fc_create" data-toggle="modal" data-target="#CalenderModalNew"></div>
    <div id="fc_edit" data-toggle="modal" data-target="#CalenderModalEdit"></div>
    
    
    <!-- 생성모달창 -->
    <div id="CalenderModalNew" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h4 class="modal-title" id="myModalLabel">일정 생성</h4>
          </div>
          <div class="modal-body">
            <div id="testmodal" style="padding: 5px 20px;">
              <form id="antoform" class="form-horizontal calender" role="form">
                <div class="form-group">
                  <label class="col-sm-3 control-label">제목</label>
                  <div class="col-sm-9">
                    <input type="text" class="form-control" id="title" name="title">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-3 control-label">상세설명</label>
                  <div class="col-sm-9">
                    <textarea class="form-control" style="height:55px;" id="descr" name="descr"></textarea>
                  </div>
                </div>
              </form>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default antoclose" data-dismiss="modal">닫기</button>
            <button type="button" class="btn btn-primary antosubmit">생성</button>
          </div>
        </div>
      </div>
    </div>
    
    
    
    
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
                    <input type="text" class="form-control" id="title2" name="title2">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-3 control-label">상세설명</label>
                  <div class="col-sm-9">
                    <textarea class="form-control" style="height:55px;" id="descr2" name="descr"></textarea>
                  </div>
                </div>

              </form>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
            <button type="button" class="btn btn-primary antosubmit2">수정</button>
          </div>
        </div>
      </div>
    </div>


    <!-- /calendar modal -->

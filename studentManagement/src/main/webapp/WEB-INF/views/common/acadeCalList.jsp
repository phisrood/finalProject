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
  
    <!-- FullCalendar -->
    <link href="/bootstrap/css/fullcalendar.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fullcalendar.print.css" rel="stylesheet" media="print">

  
        <!-- page content -->
      

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
                    <div id='calendar'></div>

                  </div>
                </div>
                
              </div>
      
        <!-- /page content -->

    <!-- calendar modal -->
    
    
    
    
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



    <div id="fc_create" data-toggle="modal" data-target="#CalenderModalNew"></div>
    <div id="fc_edit" data-toggle="modal" data-target="#CalenderModalEdit"></div>
    <!-- /calendar modal -->
        
    
    <!-- FullCalendar -->
    <script src="/bootstrap/js/moment.min.js"></script>
    <script src="/bootstrap/js/fullcalendar.min.js"></script>


    <!-- FullCalendar -->
     <script>
      $(window).load(function() {
    	var id = 0;
        var date = new Date(),
            d = date.getDate(),
            m = date.getMonth(),
            y = date.getFullYear(),
            started,
            categoryClass;

        var calendar = $('#calendar').fullCalendar({
          header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
          },
          selectable: true,
          selectHelper: true,
          //컬럼 한글변환
          columnFormat:'ddd M.D',
          monthNames: ["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
          monthNamesShort: ["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
          dayNames: ["일요일","월요일","화요일","수요일","목요일","금요일","토요일"],
          dayNamesShort: ["일","월","화 ","수 ","목 ","금 ","토 "],      ///한글로변환
          buttonText: {
           today : "오늘",
           month : "월별",
           week : "주별"
          },
          titleFormat: {
        	    week: "(M.D)"     //날짜 표시 형식
       		},
          select: function(start, end, allDay) {
            $('#fc_create').click();

            started = start;
            ended = end;

            $(".antosubmit").on("click", function() {
              var title = $("#title").val();
              if (end) {
                ended = end;
              }
              $("#descr").val("");

              categoryClass = $("#event_type").val();

              if (title) {
            	  // 이벤트 생성
                calendar.fullCalendar('renderEvent', {
                    title: title,
                    start: started,
                    end: end,
                    allDay: allDay,
                    id: id
                  },
                  true // make the event "stick"
                );
            	  id++;
            	  alert(id);
              }

              $('#title').val('');

              calendar.fullCalendar('unselect');

              $('.antoclose').click();

              return false;
            });
          },
          
          //이벤트 클릭
          eventClick: function(calEvent, jsEvent, view) {
            $('#fc_edit').click();
            $('#title2').val(calEvent.title);

            categoryClass = $("#event_type").val();

            $(".antosubmit2").on("click", function() {
              calEvent.title = $("#title2").val();
              // 이벤트 수정
              calendar.fullCalendar('updateEvent', calEvent);
	          $('.antoclose2').click();
              
            }); 
            
            calendar.fullCalendar('unselect');
            
          },
          editable: true,
          events: []
        });
      });
    </script>
<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *       수정일          수정자                수정내용
 *    -------      -------     -------------------
 *    2016.08.29.     조현욱            최초생성
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

<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>

<!-- DatePicker -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>
<script>
$(document).ready(function() {
   $("#ad_reqdate").datepicker(
         {
            showOn: "button",
            buttonImage: "/resources/common/images/calendar.png",
            showButtonPanel : true,
            currentText : '오늘 날짜',
            closeText : '닫기',
            dateFormat : "yy-mm-dd",
            changeMonth : true,
            changeYear : true,
            nextText : '다음 달',
            prevText : '이전 달',
            changeMonth : true,
            dayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일',
                  '일요일' ],
            dayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],
            monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
                  '9', '10', '11', '12' ],
            monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
                  '8월', '9월', '10월', '11월', '12월' ],
            minDate : -0
            
         });
});
</script>
<script>  
	$(document).ready(function() {
	$("#submitBtn").click(function() {
		if ($("#ad_reqdate").val() == "") {
			swal({
				title : "< Error! >",
				text : "신청일자를 입력해주세요.",
				type : "error",
				confirmButtonText : "닫기"
			});
			$("#ad_reqdate").focus();
			return false;
		}
	});
	});
   function revoke(form) {
      var count = 0;
      for (var i = 0; i < form.ad_no.length; i++) {
         if (form.ad_no[i].checked == true) {
            count++;
         }
      }
      if (count == 0) {
         alert("취소할 항목을 선택해 주세요.");
      } else {
         form.action = "/stu/adviceCancel";
         form.method = "post";
         form.submit();
      }
   }
</script>

<div class="row">
<div class="x_panel_big">
   <!-- 사이버 상담 신청 내역 -->
   <form method="post" action="/stu/adviceREQ" >
      <div class="col-md-12 col-sm-12 col-xs-12">
         <div class="x_panel">
            <div class="x_title">
               <h2><i class="fa fa-user"></i> 상담 신청</h2>
               <div class="clearfix"></div>
            </div>
            <div>
               학과교수 : <select name="ad_pro_use_id" class="btn btn-default">
               
                  <c:forEach var="professor" items="${professorList}">
                     <option value="${professor.pro_use_id}">${professor.use_name}</option>
                  </c:forEach>
               </select>  
            </div>
            <br>  
            <div style="float: left; width: 50%;">
               상담 내용 : <select name="ad_purpose" class="btn btn-default">
                  <option value="취업">취업</option>
                  <option value="수강">수강</option>
                  <option value="학적">학적</option>
                  <option value="장학">장학</option>
                  <option value="기타">기타</option>
               </select>
            </div>
            <div style="float: left; width: 50%;">
               상담 방법 : <select name="ad_way" class="btn btn-default">
                  <option value="화상">화상</option>
                  <option value="채팅">채팅</option>
               </select>
            </div>
            <br> <br>
            <br>
            
            <div>
               일자 선택 <input type="text" style="width:150px; height: 30px;" name="ad_reqdate" id="ad_reqdate" readonly="readonly">
            </div>
            <br>
            <div>
               시간 선택
                <select name="ad_time" class="btn btn-default">
                  <c:forEach varStatus="stat" begin="1" end="24" step="1">  
                        <option value="${stat.count}">${stat.count}</option>
                  </c:forEach>  
               </select> 시
            </div>  
            <br>
            <div align="center">
               <input type="submit" class="btn btn-dark" value="상담신청" id="submitBtn"/>
            </div>
         </div>
      </div>
   </form>

   
      <div class="x_panel">
         <div class="x_title">
            <h2><i class="fa fa-user"></i> 상담 신청 내역</h2>
            <div class="clearfix"></div>
         </div>
        <div class="alert alert-success alert-dismissible fade in" style="width:400px;height:40px;" >
				완료 : 상담이 완료된 상태<br> 
				</div>
				<div class="alert alert-info alert-dismissible fade in"  style="width:400px;height:40px;">
				대기 : 담당 교수가 확인하여 상담일까지 대기하는 상태<br> 
				</div>
				<div class="alert alert-warning alert-dismissible fade in"  style="width:400px;height:40px;">
				미처리: 담당 교수가 확인하지 않은 상태<br> 
				</div>
				<div class="alert alert-danger alert-dismissible fade in"  style="width:400px;height:40px;">
				연기 : 담당 교수 일정상 기간을 미룬 상태
				</div>
         <form>
               <div style="text-align:right;">
                  <div>
                  <button type="button" class="btn btn-dark" 
                     onclick='revoke(this.form);'>상담취소</button>
                  </div>
               </div>
            <table id="datatable" class="table table-striped table-bordered">
            <table id="adviceTable" class="table table-striped jambo_table bulk_action">
               <thead>
                  <tr>
                     <th colspan="2">상담번호</th>
                     <th>방법</th>
                     <th>구분</th>
                     <th>교수명</th>
                     <th>일자</th>
                     <th>시</th>
                     <th>상태</th>
                     <th>회신일</th>
                  </tr>
               </thead>
               <tbody>
                  <c:forEach var="adviceReq" items="${adviceReqList}">
                     <tr>
                        <td>
                        <c:if test="${adviceReq.ad_stat eq '미처리' }">
                              <input type="checkbox" name="ad_no" value="${adviceReq.ad_no}">
                        </c:if>
                        </td>
                        <td>
                        ${adviceReq.ad_no }
                        </td>
                        <td>${adviceReq.ad_way }</td>
                        <td>${adviceReq.ad_purpose }</td>
                        <td>${adviceReq.use_name }</td>
                        <td>${adviceReq.ad_reqdate }</td>
                        <td>${adviceReq.ad_time }</td>
                        <td>${adviceReq.ad_stat }</td>
                        <td>${adviceReq.ad_return }</td>
                     </tr>
                  </c:forEach>
               </tbody>
            </table>
            </table>
            </div>
         </form>
      </div>
   </div>
<!-- Datatables -->
<script src="/stu/js/click_cal.js"></script>
<script>
$('#adviceTable').DataTable();
</script>

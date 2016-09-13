<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 증명서
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

 <link href="resources/common/css/default.css" rel="stylesheet">
<!-- 시간표 -->
	
	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>성적증명서</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                   	<div class="button-location">	
                   		<form name="pdfForm">
                   		<input type=hidden id="htmlTag" name="htmlTag"/>			
						<button class="btn btn-danger" onclick="toPdf()">PDF출력</button>					
                   		</form>
					</div>				

<div id="grade-tbl">
<table id="grade-info-table" >
	<tr class="grade-info-tr">
		<th colspan="2" class="grade-info-th" >학과</th>	
		<td colspan="2" class="grade-info-td" >정보통신공학과</td>	
		<th colspan="2" class="grade-info-th" >부전공</th>	
		<td colspan="2" class="grade-info-td" >컴퓨터공학과</td>	
		<th colspan="2" class="grade-info-th" >학번</th>	
		<td colspan="2" class="grade-info-td" >20122750</td>	
	</tr>
	<tr class="grade-info-tr">
		<th class="grade-info-th" >이름</th>	
		<td colspan="2" class="grade-info-td" >뚜덩이</td>	
		<th class="grade-info-th" >생년월일</th>	
		<td colspan="2" class="grade-info-td" >1993년08월13일</td>	
		<th class="grade-info-th" >입학일자</th>	
		<td colspan="2" class="grade-info-td" >2012년03월02일</td>	
		<th class="grade-info-th" >졸업일자</th>	
		<td colspan="2" class="grade-info-td" >2016년02월12일</td>	
	</tr>
</table>

<div class="grade-div">
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<th class="grade-th">교과목명</th>	
		<th class="grade-th">성적</th>	
		<th class="grade-th">학점</th>	
	</tr>
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 1학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font grade-yy"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 2학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>

</div>
<div class="grade-div">
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<th class="grade-th">교과목명</th>	
		<th class="grade-th">성적</th>	
		<th class="grade-th">학점</th>	
	</tr>
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 1학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 2학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
</div>
<div class="grade-div" >
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<th class="grade-th">교과목명</th>	
		<th class="grade-th">성적</th>	
		<th class="grade-th">학점</th>	
	</tr>
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 1학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 2학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
</div>
<div class="grade-div">
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<th class="grade-th">교과목명</th>	
		<th class="grade-th">성적</th>	
		<th class="grade-th">학점</th>	
	</tr>
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 1학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
<table style="text-align:center;" class="table table-striped jambo_table bulk_action">
	<tr>
		<td colspan="3" class="grade-td-font grade-yy">2012년도 2학기</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">객체지향</td>	
		<td class="grade-td-font"   >A</td>	
		<td class="grade-td-font"  >3</td>	
	</tr>
	<tr>
		<td class="grade-td-font">취 득 학 점 : 16</td>	
		<td colspan="2"class="grade-td-font"   >평 점 평 균 : 3.34</td>	
	</tr>
	<tr>
		
		<td colspan="3"class="grade-td-font"  >환 산 점 수 :89.45 / 100</td>	
	</tr>
</table>
<table id="grade-cer-table" >
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-no" ><h4>&nbsp;제  2016-12345호</h4></th>	
	</tr>
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-title" ></th>	
	</tr>
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-title" ><h4>위의 사실을 증명함</h4></th>	
	</tr>
	
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-title" ></th>	
	</tr>
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-title" ><h4>2016년 09월 09일</h4></th>	
	</tr>
	<tr class="grade-cer-tr">
		<th colspan="2" class="cer-title" ></th>	
	</tr>
	<tr class="grade-cer-tr">
		<th colspan="2" class="grade-ingam" ></th>	
	</tr>
	
		
</table>
</div>
</div>

   </div>
 </div>
			<!-- /page content -->
</div>
	<script type="text/javascript">
	$("#htmlTag").val($("#grade-tbl").html());
	</script>
	
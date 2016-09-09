<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 학적변동현황(타학과)
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


    
    <!-- 부/다전공 신청현황 && 승인반려: 타학과 -->
<script>
$(function(){
	$("#detailDiv").hide();
	
	var uniq = "";
	
	$(".clickTr").click(function(){
		$("#detailDiv").show();
		uniq = $(this).attr("name");//신청기본키빼서 정보보여줘야대
		
		$.ajax({
			url:"/pro/reqInfoDetail",
			method:"get",
			type:"json",
			data:{"sb_no":uniq},
			success:function(data){
				var htmlCode="";
				
				htmlCode += "<tr>";
				if(data.sb_mk_no == '2'){ //1.주전공 2.부전공 3.다전공
					htmlCode += "<td>부전공신청</td>"; 
				}else if(data.sb_mk_no =='3'){
					htmlCode += "<td>다전공신청</td>";
				}
				htmlCode += "<td>"+data.sb_stud_use_id+"</td>";	//학번
				htmlCode += "<td>"+data.sb_requestdate+"</td>";    //신청일자
				htmlCode += "<td>"+data.sb_majordepartment+"</td>";	//소속학과
				htmlCode += "<td>"+data.sb_dep_name+"</td>";	//신청학과
				htmlCode += "<td>"+data.score+"</td>";	//평균학점  
				htmlCode += "<td>"+data.sb_dep_no+"</td>";	//총이수학점 
				//신청학과 승인
				if(data.sb_requestdepartmentyn == '0'){
					htmlCode += "<td class='sub0'>승인대기</td>";
				}else if(data.sb_requestdepartmentyn =='1'){
					htmlCode += "<td class='sub1'>승인</td>";
				}else if(data.sb_requestdepartmentyn =='2'){
					htmlCode += "<td class='sub2'>반려</td>";
				}
				htmlCode += "</tr>";
				
				$("#resultTable").html(htmlCode);
			}
			
		});
		
	})
	
	$("#trueBtn").click(function(){
		location.href="/pro/othersREQDecide?sb_no="+uniq+"&&result=3";
	});
	
	$("#falseBtn").click(function(){
		location.href="/pro/othersREQDecide?sb_no="+uniq+"&&result=4";
	});
	
	var res = "${resultChk}";
	
	if(res == 1){
		alert("승인되었습니다.");
	}else if(res == 2){
		alert("반려되었습니다.");
	}
	
});
</script>	
           
            <div class="row">
            
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>타학과 부/다전공 신청명단</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>이름</th>
                          <th>학번</th>
                          <th>연락처</th>
                          <th>학과</th>
                        </tr>
                      </thead>
                      <tbody>
						<c:forEach var="stu" items="${reqStuList }" varStatus="status">
							<tr class="clickTr" name="${stu.af_no}"> 
								<td>${status.count }</td>
								<td>${stu.use_name }</td>
								<td>${stu.use_id }</td>
								<td>${stu.stud_phone }</td>
								<td>${stu.dep_name }</td>
							</tr>
						</c:forEach>
				     </tbody>
                    </table>
                  </div>
                </div>
                <!-- 학생누르면 해당학생 부/다전공 신청서 나타남 -->
                 <div class="x_panel" id="detailDiv">
                  <div class="x_title">
                    <h2>상세내역</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>신청구분</th>
                          <th>학번</th>
                          <th>신청일자</th>
                          <th>소속학과</th>
                          <th>신청학과</th>
                          <th>평균학점</th>  
                          <th>총이수학점</th>   
                          <th>상태</th>   
                        </tr>
                      </thead>
                       <tbody id="resultTable">

                      </tbody>
                    </table>

                     <div style="text-align:right;">
					<button type="button" class="btn btn-dark" id="trueBtn">승인</button>
					<button type="button" class="btn btn-dark" id="falseBtn">반려</button>
					</div>
			       
                  </div>
                  
                  
                  
                </div>
                
                
              </div>
      
              </div>
       
   
<%--==============================================================
 * 학적 변동 현황 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 *	  2016.09.02.  	박진성,조현욱      	1차 수정(조회성공)
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

<!-- Data tables -->
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">
    
<script>
	var chk = "${chk}";
	
	if(chk != 0){
		window.close();
	}

	function reqBtn(){
		window.open('/stu/minorModel', '_blank', 'width=600, height=500');
	} 
	
	$(function(){
		$.ajax({
			url:"/stu/minorList",
			method:"get",
			type:"json",
			success:function(data){
				var htmlCode = "";
				
				$.each(data, function(index, value){
					htmlCode += "<tr>"; 
					htmlCode += "<td>"+(index+1)+"</td>"; //순번
					if(value.sb_mk_no == '2'){ //1.주전공 2.부전공 3.다전공
						htmlCode += "<td>부전공신청</td>"; 
					}else if(value.sb_mk_no =='3'){
						htmlCode += "<td>다전공신청</td>";
					}
					htmlCode += "<td>"+value.sb_requestdate+"</td>"; //신청일자
					htmlCode += "<td>${loginUser.use_name}</td>"; //신청인
					htmlCode += "<td>"+value.sb_majordepartment+"</td>"; //소속학과
					htmlCode += "<td>"+value.sb_dep_name+"</td>"; //신청학과
					
					//소속학과 승인
					if(value.sb_majordepartmentsubmityn == '0'){
						htmlCode += "<td class='sub0'>승인대기</td>"; 
					}else if(value.sb_majordepartmentsubmityn =='1'){
						htmlCode += "<td class='sub1'>승인</td>";
					}else if(value.sb_majordepartmentsubmityn =='2'){
						htmlCode += "<td class='sub2'>반려</td>";
					}
					
					//신청학과 승인
					if(value.sb_requestdepartmentyn == '0'){
						htmlCode += "<td class='sub0'>승인대기</td>";
					}else if(value.sb_requestdepartmentyn =='1'){
						htmlCode += "<td class='sub1'>승인</td>";
					}else if(value.sb_requestdepartmentyn =='2'){
						htmlCode += "<td class='sub2'>반려</td>";
					}
					
					htmlCode += "</tr>";
				});
				
				$("#result").html(htmlCode);
			}
		});
		
	});
</script>
<style>
	.sub0{color:#00af00;}
	.sub1{color:blue;}
	.sub2{color:red;}
</style>
           
            <div class="row">
            <!-- 학적변동현황:학생 -->
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>부/다전공신청</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <p style="text-align:right;"><button onclick="reqBtn();">신청하기</button></p>
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>순번</th>
                          <th>구분</th>
                          <th>신청일자</th>
                          <th>신청인</th>
                          <th>소속학과</th>
                          <th>신청학과</th>
                          <th>소속학과승인</th>
                          <th>신청학과승인</th>
                        </tr>
                      </thead>
		
                      <tbody id="result">

                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
       
              
              </div>
       
          
    <!-- Datatables -->
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
    <script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
    <script src="/bootstrap/js/dataTables.buttons.min.js"></script>
    <script src="/bootstrap/js/buttons.bootstrap.min.js"></script>
    <script src="/bootstrap/js/buttons.flash.min.js"></script>
    <script src="/bootstrap/js/buttons.html5.min.js"></script>
    <script src="/bootstrap/js/buttons.print.min.js"></script>
    <script src="/bootstrap/js/dataTables.fixedHeader.min.js"></script>
    <script src="/bootstrap/js/dataTables.keyTable.min.js"></script>
    <script src="/bootstrap/js/dataTables.responsive.min.js"></script>
    <script src="/bootstrap/js/responsive.bootstrap.js"></script>
    <script src="/bootstrap/js/datatables.scroller.min.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/pdfmake.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>

</body>
</html>
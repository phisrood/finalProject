<%--==============================================================
 * 개인 정보 관리 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 *	  2016.09.02.  	박진성,조현욱      	1차 수정(임시완료)
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



<script type="text/javascript" src="/emp/js/default.js"></script>
<script>
	$(function(){
		var message = "${message}";
		
		if(message == "error"){
			swal({
				title: "< Error >",
				text: "입력하신 비밀번호가 맞지 않습니다.",
				type: "error",
				confirmButtonText: "닫기" 
			}); 
		}else if(message == "success"){
			swal({
				title: "변경 완료!",
				text: "비밀번호가 변경되었습니다.",
				type: "success",
				confirmButtonText: "닫기" 
			}); 
		}
		
		//유효성 check
		var name = /[a-zA-Z가-힣]{2,4}/;
		var engName = /[a-zA-Z]{1,20}/;
		var birth = /[0-9]{6}/;
		var addr = /[a-zA-Z0-9가-힣]{1,20}/;
		
		var mail = /^[a-zA-Z0-9]{1,15}$/;
		var pwd = /[a-z0-9]{8}/;
		var reg2 = /[0-9]{7}/;
		
		
		var blood = /^[A-Z]{1,2}$/;
		
		
		
		var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
		
		$("#infoSubmit").click(function(){
	        
	        //valuE
	        var phoneCheck = $("#stud_phone").val(); //핸드폰번호
	        var emailCheck = $("#stud_email").val(); //이메일
	        var hobCheck = $("#stud_hob").val(); //취미
	        var addCheck = $("#stud_add").val(); //주소
	        var adddetailCheck = $("#stud_adddetail").val(); //상세주소
	        

	        var tel = /[010][1-9]{1}[0-9]{3}[0-9]{4}/;  
	        var email=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
	        var addr = /[a-zA-Z0-9가-힣]{1,20}/;
	        var hob = /[가-힣]{1,10}/;
	        
	        if(phoneCheck == ""){
	        	swal({
					title: "< Error >",
					text: "현재 핸드폰번호 입력이 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_phone").focus();
	        	return false;
	        	
	        }else if(tel.test(phoneCheck) != true){
	        	swal({
	        		title:"< 형식오류! >",
	        		text : "ex) 01097058787",
	        		type : "error",
	        		confirmButtonText: "닫기"
	        	});
				$("#stud_phone").focus();
				return false;
	        }else if(emailCheck == ""){
	        	swal({
					title: "< Error >",
					text: "현재 이메일 입력이 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_email").focus();
	        	return false;
	        }else if(email.test(emailCheck) != true){
	        	swal({
					title: "< 형식오류! >",
					text: "ex)loveyouekr@naver.com",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_email").focus();
	        	return false;
	        	
	        }else if(addCheck == ""){
	        	swal({
					title: "< Error >",
					text: "현재 주소 입력이 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_add").focus();
	        	return false;
	        	
	        	
	        }else if(addr.test(addCheck) != true){
	        	
	        	swal({
					title: "< 형식오류! >",
					text: "주소의 특수문자 입력은 불가능 합니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_add").focus();
	        	return false;
	        	
	        }else if(adddetailCheck == ""){
	        	swal({
					title: "< Error >",
					text: "현재 상세주소 입력이 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_adddetail").focus();
	        	return false;
	        	
	        	
	        }else if(addr.test(adddetailCheck) != true){
	        	
	        	swal({
					title: "< 형식오류! >",
					text: "상세주소에 특수문자 입력은 불가능 합니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_adddetail").focus();
	        	return false;
	        	
	        }else if(hobCheck == ""){
	        	swal({
					title: "< Error >",
					text: "현재 취미 입력이 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_hob").focus();
	        	return false;
	        	
	        	
	        }else if(hob.test(hobCheck) != true){
	        	
	        	swal({
					title: "< 형식오류! >",
					text: "취미에 한글을 제외한 단어는 입력이 불가능 합니다. ",
					type: "error",
					confirmButtonText: "닫기" 
				});
	        	$("#stud_hob").focus();
	        	return false;
	        	
	        }
	        
	        
	          
	      
	    
		});

		$("#pwdSubmit").click(function(){
			var nowPwd = $("#now_use_pwd").val(); //현재패스워드
		    var afterPwd = $("#after_use_pwd").val(); //변경할 패스워드
		    var confirmPwd = $("#after_use_pwd1").val(); //변경할 패스워드 확인
			if(nowPwd == ""){
				swal({
					title: "< Error >",
					text: "현재 비밀번호 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
				$("#now_use_pwd").focus();
				return false;
			}else if(afterPwd == ""){
				swal({
					title: "< Error >",
					text: "변경하실 비밀번호 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
				$("#after_use_pwd").focus();
				return false;
			}else if(confirmPwd == ""){
				swal({
					title: "< Error >",
					text: "확인 비밀번호 공백입니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
				$("#after_use_pwd1").focus();
				return false;
			}else if(afterPwd != confirmPwd){
				swal({
					title: "< Error >",
					text: "비밀번호 확인을 다시해주세요.",
					type: "error",
					confirmButtonText: "닫기" 
				}); 
				$("#after_use_pwd").focus();
				return false;
			}
		});
	});
</script>
			
	
	<div class="row">
    	<div class="x_panel_big">
    		<!-- 학생 개인 정보 관리 -->
    		
    		
    			<div class="x_panel">
    				<div class="x_title">
                    <h2>학생 개인 정보 관리</h2>
                    
                    <div class="clearfix"></div>
        			</div>
   					
                <div class="col-md-55">
                	<div class="thumbnail" align="center" style="padding: 13px;">
                		<div align="center" class="img-container" style="border: 1px solid; width:180px;">
                		
                			
                	
                        		<img id="image" src="/stu/images/${studentVO.af_aftername}" alt="Picture" width="170px" height="150px">
                        		
                        		</div>                     
                        </div>
                        <div align="center">
                        	<c:choose>
                        		<c:when test="${studentVO.stud_af_no eq 0 }">
	                        		<input type="button" class="btn btn-dark" value="사진등록" onclick="javascript:OpenWindow('/colleage/indivInfoImageInsert','320','180')" />
                        		</c:when>
                        		<c:otherwise>
	                        		<input type="button" class="btn btn-dark" value="사진수정" onclick="javascript:OpenWindow('/colleage/indivInfoImage','320','180')" />
                        		</c:otherwise>
                        	</c:choose>
                        	   
                    	</div>
                
                </div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" name="stud_use_id" value="${studentVO.stud_use_id}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(한글)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.use_name}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">주민 &nbsp;번호</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_regno1}-${studentVO.stud_regno2}" readonly="readonly" style="text-align: center;"></div><br><br>
					</div>
				</div>
				<div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
             
                		<div style="float: left; width: 35%; padding:3px;">성명(영어)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_engname}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">현재 &nbsp;학과</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;" readonly="readonly"></div><br><br>
                      		<div style="float: left; width: 35%; padding:3px;">학적 &nbsp;상태</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_stat }" style="text-align: center;" readonly="readonly"></div>
					</div>
				</div>
                 <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
     
                		
                		<div style="float: left; width: 35%; padding:3px;">성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별</div>
                		<div style="float: right; width: 65%;">
                		<input type="text" id="" required="required" size="15" value="${studentVO.stud_gender}" style="text-align: center;" readonly="readonly"></div><br><br>
						<div style="float: left; width: 35%; padding: 3px;">생년월일</div>
	               		<div style="float: right; width: 65%;">
	              
	               		<input type="text" name="stud_birth" id="stud_birth"  readonly="readonly" size="15" value="${studentVO.stud_birth}" style="text-align: center;"></div><br><br> 
	               		<div style="float: left; width: 35%; padding: 3px;">혈액형</div>
	               		<div style="float: right; width: 65%;">
	               		<input type="text" name="stud_bltype" id="stud_bltype" readonly="readonly"  size="15" value="${studentVO.stud_bltype}" style="text-align: center;"></div>
					
					
					</div>
				</div>
				
				</div>
				
			<!-- 학생 개인 정보-->
				
			<form action="/stu/indivUpdate" method="POST">
					<div class="x_panel">
						<div class="x_title">
                    		<h2>개인 정보/주소 정보</h2>
                    
                    		<div class="clearfix"></div>
        				</div>
	   				
	                	<div style="float: left; width: 100%;">
		                <div style="float: left; width: 10%; padding:3px;">전화번호</div>
	               		<div style="float: left; width: 25%;"><input type="text" maxlength="11"   name="stud_phone" id="stud_phone" required="required" size="40" value="${studentVO.stud_phone}" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding:3px;">E-mail</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_email" id="stud_email" required="required" size="40" maxlength="20" value="${studentVO.stud_email}" style="text-align: center;"></div>
	               		<div style="float: left; width: 6%; padding: 3px;">취미</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_hob" id= "stud_hob" required="required" size="30" value="${studentVO.stud_hob}" style="text-align: center;"></div><br><br>
               			<div style="float: left; width: 10%; padding: 3px;">주소</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_add" id= "stud_add" required="required" size="40" value="${studentVO.stud_add}" style="text-align: center;"></div>
               		 	<div style="float: left; width: 8%; padding: 3px;">상세주소</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_adddetail" id= "stud_adddetail" required="required" size="40" value="${studentVO.stud_adddetail}" style="text-align: center;"></div>
               		
               			</div>
               			
               			<div style="float: right; width: 4%;">
	   						<input type="submit" id="infoSubmit" class="btn btn-dark" value="저장">
	   					</div>   
               		</div>
               		
		    </form>
                
		    <form action="/stu/indivPwdUpdate" method="post">
                	<div class="x_panel">
                		<div class="x_title">
                    		<h2>비밀번호변경</h2>
                    
                    		<div class="clearfix"></div>
        				</div>
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">현재</div>
		               		<div style="float: left; width: 37%;">
		               			<input type="password" size="30" name="now_use_pwd" id="now_use_pwd" style="text-align: center;">
		               		</div>
		               		
		               		<div style="float: left; width: 49%;"></div><br><br>
	               		</div>
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">변경</div>
		               		<div style="float: left; width: 37%;">
		               			<input type="password"   name="after_use_pwd" size="30"  id="after_use_pwd" style="text-align: center;">
		               		</div>
		               		<div style="float: left; width: 11%; padding: 3px;">변경(확인)</div>
		               		<div style="float: left; width: 37%;">
		               			<input type="password"   size="30" name="after_use_pwd1" id="after_use_pwd1" style="text-align: center;">
		               		</div><br>
		               	
	               		</div>
	               		
	               		<div style="float: right; width: 4%;">
	   						<input type="submit" id="pwdSubmit" class="btn btn-dark" value="저장">
	   					</div>
	                </div>
	        </form>
              
    	</div>
    </div>
    
   
    


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%--==============================================================
 * 비밀번호 찾기
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

<!DOCTYPE html>
<html lang="kor">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Hanguk University! | </title>

	<script src="/common/js/login.js" ></script>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">
    <link href="/bootstrap/css/animate.min.css" rel="stylesheet">
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">
	<link href="/bootstrap/css/sweetalert.css" rel="stylesheet">
	<link href="/common/css/default.css" rel="stylesheet">
    <script src="/bootstrap/js/jquery.min.js"></script>
	<script src="/bootstrap/js/jquery.form.js"></script>
	<script src="/bootstrap/js/sweetalert.min.js"></script>
  </head>

	<script>
		$(function(){
			var index = "${index}";
			
			if(index == 1){
				swal({
					title: "학번/이메일 불일치!",
					text: "학번을 올바르게 작성해주세요.",
					type: "error",
					confirmButtonText: "닫기" 
				});
				return false;
			}else if(index ==2){
				swal({
					title: "학번/이메일 불일치!",
					text: "아이디와 생년월일에 일치하는 회원정보가 없습니다.",
					type: "error",
					confirmButtonText: "닫기" 
				});
				return false;
			}else if(index ==3){
				swal({
					title: "비밀번호 초기화 완료!",
					text: "임시비밀번호로 초기화가 완료되었습니다.",
					type: "success",
					confirmButtonText: "닫기" 
				});
			}else if(index ==4){
				swal({
					title: "이메일정보오류",
					text: "이메일정보가 잘못되었습니다. 학사팀으로 연락해주세요.(042-000-0000)",
					type: "error",
					confirmButtonText: "닫기" 
				});
				return false;
			}
		});
	</script>

  <body style="background:url('../../resources/common/images/uni.jpg'); background-size:100%;">
    <div>
      <a class="hiddenanchor" id="stunum"></a>
      <a class="hiddenanchor" id="stubirth"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="/common/pwdSearch" method="post">
              <h1 style="color:#D8D8D8;">PWD SEARCH</h1>
              <div>
                <input type="text" class="form-control" name="id" placeholder="User ID" />
              </div>
              <div>
                <input type="text" class="form-control" name="birth" placeholder="생년월일 ex)YYMMDD"/>
              </div>
              <div>  
              	<div style="text-align: right; margin-bottom: 10px;"> 
               		<a href='/common/loginForm' style="color:balck;">--로그인하러가기--</a>
               	</div>
                <input type="submit" value="인증비밀번호발송" style="width:100%; height: 30px;">  
              </div>
                <div class="clearfix"></div>
             	<br />  
                <div>
                  <h1 style="color:#D8D8D8;"><i class="fa fa-paw"></i> Hanguk University!</h1>
                  <p style="color:#D8D8D8;">©2016 All Rights Reserved. Hanguk is a Best University.</p>
                </div>
            </form>
          	</section>
           </div>
        </div>     
      </div>
  </body>
</html>

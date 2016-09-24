<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%--==============================================================
 * 로그인폼
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

<html lang="en">
	<script type="text/javascript" src="/common/js/login.js" ></script>
	<script src="/bootstrap/js/jquery.min.js"></script>
	<script src="/bootstrap/js/jquery.form.js"></script>
	<script src="/bootstrap/js/sweetalert.min.js"></script>
	<link href="/bootstrap/css/sweetalert.css" rel="stylesheet">
  <script type="text/javascript">
$(function(){
/* 	swal({
		title: "Error!",
		text: "Here's my error message!",
		type: "error",
		confirmButtonText: "Cool" 
	}); */
	//http://t4t5.github.io/sweetalert/

	$("#loginForm").ajaxForm({
		beforeSubmit:function(){
			var id = $("#use_id").val();
			var pwd = $("#use_pwd").val();
			if(id==""||pwd==""){
				swal({
					title: "< Error! >",
					text: "로그인정보를 입력해주세요.",
					type: "error",
					confirmButtonText: "닫기" 
				}); 
				return false;
			}
		},
		dataType:"text",
		success:function(data){
			if(data == "error"){
				swal({
					title: "< 로그인 실패 >",
					text: "아이디 패스워드가 맞지 않습니다.",
					type: "error",
					confirmButtonText: "닫기" 
				}); 
				return false;
			}else{
				swal({
					title: "< 로그인 성공 >",
					text: "즐거운하루되세요.",
					type: "success",
				}); 
				
				$("#loginForm").ajaxFormUnbind();
				$("#loginForm").attr("action", "/common/loginProcess");
				$("#loginForm").submit();
			}
		},
		error:function(){
			swal({
				title: "< 서버 통신 에러 >",
				text: "서버가 불안정하오니 다시 실행해주세요.",
				type: "error",
				confirmButtonText: "닫기" 
			}); 
		}
	});
	
});

</script>
  
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Hanguk University! | </title>

    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">
    <link href="/bootstrap/css/animate.min.css" rel="stylesheet">
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="login" background="/resources/common/images/uni.jpg"> 
    <div>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <!-- <form name="form" method="post" action="/common/loginProcess"> -->
            <form name="form" method="post" action="/common/loginCheck" id="loginForm">
              <h1>LOGIN</h1>
              <div>
                <input type="text" class="form-control" name="use_id" id="use_id" placeholder="User ID"/>
              </div>
              <div>
                <input type="password" class="form-control" name="use_pwd" id="use_pwd" placeholder="Password"/>
              </div>
              <div>
                <input type="submit" value="로그인">
               	<input type="button" onclick="location.href='/common/pwdSearchForm'" value="비밀번호찾기">
              </div>
                <div class="clearfix"></div>
                <br />
                <div>
                  <h1><i class="fa fa-paw"></i> Hanguk University!</h1>
                  <p>©2016 All Rights Reserved. Hanguk University! is a Best University.</p>
                </div>
           	</form>
          	</section>
           </div>
        </div>     
      </div>
  </body>
</html>
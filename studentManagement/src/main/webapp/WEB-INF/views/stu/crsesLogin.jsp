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


<!-- 수강신청 로그인 -->
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Hanguk University! | </title>

    <!-- Bootstrap -->
    <link href="/stu/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/stu/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/stu/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="/stu/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/stu/css/custom.min.css" rel="stylesheet">
  </head>
  
  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action = "crsesLogin" method="post">
              <h1>LOGIN&nbsp;|&nbsp;수강신청</h1>
              <div>
                <input type="text" class="form-control" id="id" name="id" placeholder="User ID" required="required" />
              </div>
              <div>
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password" required="required"	 />
              </div>
              <div>
                <button type="submit" >로그인</button>
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
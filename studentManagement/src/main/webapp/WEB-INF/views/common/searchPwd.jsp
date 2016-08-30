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
<html lang="en">
  <head>
  <script type="text/javascript" src="/common/js/login.js" ></script>
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

  <body class="login">
    <div>
      <a class="hiddenanchor" id="stunum"></a>
      <a class="hiddenanchor" id="stubirth"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form name="searchPwd_form">
              <h1>SEARCH</h1>
              <div>
                <input type="text" class="form-control" name="id" placeholder="학번" />
              </div>
              <div>
                <input type="text" class="form-control" name="birth" placeholder="생년월일 ex)930813"  />
              </div>
              <div>
                <input type="button" value="인증메일발송" onclick="go_searchPwd();">
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
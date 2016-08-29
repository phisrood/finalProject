<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentellela Alela! | </title>

    <!-- jQuery -->
    <script src="/bootstrap/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/bootstrap/js/bootstrap.min.js"></script>

    <!-- Bootstrap -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <!-- page content -->
        <div class="col-md-12">
          <div class="col-middle">
            <div class="text-center text-center">
              <h1 class="error-number">Login_Error</h1>
              <h2>로그인을 실패하였습니다.</h2>
              <p>로그인화면으로 돌아가기 <a href="/common/loginForm">(재접속)</a>
              </p>
            </div>
          </div>
        </div>
        <!-- /page content -->
      </div>
    </div>


    <!-- FastClick -->
    <script src="/bootstrap/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="/bootstrap/js/nprogress.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="/bootstrap/js/custom.min.js"></script>
  </body>
</html>

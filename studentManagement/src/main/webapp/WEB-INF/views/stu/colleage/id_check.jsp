<%--==============================================================
 * ���� ���� ���� id Ȯ�� left �޴�����
 * @author ������
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << �����̷�(Modification Information) >>
 *    	������       	������          		��������
 *    -------      -------     -------------------
 *    2016.08.29.  	������      		���ʻ���
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@page import="com.korea.indivInfoManage.dao.IndivInfoManageDAO"%>
<%@ page contentType = "text/plain; charset=euc-kr" %>
<%@ page import = "java.util.List" %>
<%
String id = request.getParameter("id");
IndivInfoManageDAO dao;
int re = dao.checkId(id);
%>
<%=re%>


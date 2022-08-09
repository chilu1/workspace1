<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/26
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServletPath()+path+"/";
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
${xiaoxi}<br>
<a href="${pageContext.request.contextPath}/FindUserList">查看所有用户</a>

</body>
</html>

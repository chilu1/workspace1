<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/26
  Time: 17:07
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
    <title>登录</title>
</head>
<body>
    <form action="Login" method="post" style="padding-top: -700px;">
        用户名：<input type="text" name="name" value=""><br><br>
        密  码：<input type="password" name="pwd" value=""><br><br>
        <input type="submit" value="登录" name="denglu"><input type="reset" value="重置"><br>
    </form>
    <form action="register.jsp">
        <input type="submit" value="新用户注册">
    </form>

</body>
</html>

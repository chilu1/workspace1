<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h2>欢迎<%=session.getAttribute("uname")%>登录！</h2>
</body>
</html>
 <%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/26
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有用户页面</title>
</head>
<body>
<h1>用户展示</h1>
<h2>${xiaoxi}</h2>
<table width="600" border="1" cellpadding="0">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>密码</th>
        <th>家乡</th>
        <th>备注</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userAll}" var="item">
        <form action="UpdateUser" method="post">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.sex}</td>
                <td>${item.pwd}</td>
                <td>${item.home}</td>
                <td>${item.info}</td>
                <td><a href="${pageContext.request.contextPath}/DeleteUser?id=${item.id}">删除</a> <input type="submit" value="更新"/></td>
            </tr>
        </form>
    </c:forEach>
</table>

</body>
</html>

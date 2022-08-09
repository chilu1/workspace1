<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/27
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>用户展示</title>
  </head>
  <body>
    <h1>用户展示</h1>
    <h2>${deleted}</h2>
    <table>
      <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${list}" var="item">
        <tr>
          <td>${item.id}</td>
          <td>${item.username}</td>
          <td>${item.password}</td>
          <td><a href="${pageContext.request.contextPath}/deleteServlet?id=${item.id}">删除</a>
            ----<a href="${pageContext.request.contextPath}/updateServlet?id=${item.id}">编辑</a>
            ----<a href="${pageContext.request.contextPath}/detailUpdateServlet?id=${item.id}&?username=${item.username}">详情修改</a>
            ----<a href="${pageContext.request.contextPath}/adddetailServlet?id=${item.id}&?username=${item.username}">添加用户详情</a>
          </td>
        </tr>
      </c:forEach>
      <tr>
        <td colspan="2" style="text-align: left"><a href="add.jsp">用户添加</a></td>
      </tr>
    </table>
  </body>
</html>

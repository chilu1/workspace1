<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/27
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户详情添加</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/adddetailServlet" method="post">
        <%--<input hidden="hidden" name="id" value="${id}">--%>
        <input hidden="hidden" name="userdemoid" value="${user.userdemoid}">
        <table border="1">
            <tr>
            <tr>
                <td colspan="2"><h1>用户详情添加</h1></td>
            </tr>

            <tr>
                <td>id</td>
                <td><input type="text" name="id" value="${user.id}"></td>
            </tr>

            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username" value="${user.username}"/></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age"/></td>

            </tr>
            <tr>
                <td>性别：</td>
                <td><input type="text" name="sex"/></td>

            </tr>
            <tr>
                <td>身份证：</td>
                <td><input type="text" name="userID"/></td>

            </tr>
            <tr>
                <td>出生日期：</td>
                <td><input type="text" name="birthday"/></td>

            </tr>
            <tr>
                <td>住址：</td>
                <td><input type="text" name="home"/></td>

            </tr>


            <tr>
                <td colspan="2">
                    <input type="submit" value="提交">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>

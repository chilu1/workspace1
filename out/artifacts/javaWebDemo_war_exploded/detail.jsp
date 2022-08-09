<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/28
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详情修改</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/detailQueryServlet"  method="post" style="align-items: center">
    <%--<input hidden="hidden"  name="id" value="${user.id}">
    <input hidden="hidden" name="username" value="${user.username}">--%>
    <table border="1">
        <tr>
            <td colspan="2"><h1>用户详情修改</h1></td>
        </tr>

        <tr>
            <td>id</td>
            <td><input type="text" name="id" value="${user.id}"></td>
        </tr>

        <tr>
            <td>姓名</td>
            <td><input type="text" name="username" value="${user.username}"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${age}"/> </td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" value="${sex}"></td>
        </tr>
        <tr>
            <td>身份证</td>
            <td><input type="text" name="userID" value="${userID}"></td>
        </tr>
        <tr>
            <td>出生年月日</td>
            <td><input type="text" name="birthday" value="${birthday}"></td>
        </tr>
        <tr>
            <td>住址</td>
            <td><input type="text" name="home" value="${home}"></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="修改"/>
                <input type="button" value="Back" onclick="history.back(-1)">
                <!--都是返回上级：history.go(-1)原来的数据丢失 history.back(-1)会将原页面数据保存-->
            </td>
        </tr>
    </table>
</form>


</body>
</html>

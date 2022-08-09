<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/27
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户编辑</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/updateServlet" method="post" style="align-items: center">
        <table border="1">
            <tr>
                <td colspan="2"><h1>用户编辑</h1></td>
            </tr>
            <tr>
                <td>id</td>
                <td><input type="text" name="id" value="${user.id}"/></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="username" value="${user.username}"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password" value="${user.password}"/> </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                    <input type="button" value="Back" onclick="history.back(-1)">
                    <!--都是返回上级：history.go(-1)原来的数据丢失 history.back(-1)会将原页面数据保存-->
                </td>
            </tr>
        </table>
    </form>

</body>
</html>

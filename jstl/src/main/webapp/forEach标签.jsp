<%@ page import="java.util.*" %>
<%@ page import="com.example.jstl.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forEach标签</title>
</head>
<body>
    <%--
        forEach标签
            格式：
                <c:forEach
                    items="<object>"
                    var="<string>"
                    begin="<int>"
                    end="<int>"
                    varStatus="<string>"
                    step="<int>">
                </c:forEach>
            属性：
                begin：开始数
                end：结束数
                step：间隔数
                var：限域变量名，用来接收当前遍历的成员
                items：要循环的数据（数组、List、map等）

            1.迭代主体内容多次
                <c:forEach var="限域变量名" begin="开始数" end="结束数" step="间隔数">
                </c:forEach>
                相当于java中的for..int
                for(int i = 0; i < 10; i++){
                }

            2.循环
                <c:forEach items="要循环的数据" var="限域变量名">
                </c:forEach>


    --%>
    <%-- 迭代主体内容多次 --%>
    <c:forEach var="i" begin="1" end="10" step="2">
        ${i} &nbsp;
    </c:forEach>
    <%--  循环  --%>
    <%
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10;i++){
            list.add("A:"+i);
        }
        pageContext.setAttribute("li",list);
    %>
    <c:forEach items="${li}" var="item">
        ${item} &nbsp;
    </c:forEach>
    <hr>
    <%-- 循环对象集合 --%>
    <%
        List<User> userList = new ArrayList<User>();
        User user1 = new User(1,"zhangsan","123456");
        User user2 = new User(2,"lisi","123123");
        User user3 = new User(3,"wangwu","135246");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        //将数据设置到作用域中
        request.setAttribute("userList",userList);

    %>
    <%-- 判断集合是否为空 --%>
    <c:if test="${!empty userList}">
        <%-- 当集合不为空时，遍历集合 --%>
        <table align="center" width="800" border="1" style="border-collapse: collapse;">
            <tr>
                <th>用户编号</th>
                <th>用户名称</th>
                <th>用户密码</th>
                <th>用户操作</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr align="center">
                    <td>${user.userId}</td>
                    <td>${user.uname}</td>
                    <td>${user.upwd}</td>
                    <td><button>修改</button></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</body>
</html>

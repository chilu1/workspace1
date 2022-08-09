<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/21
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
    <%--
        EL表达式
        作用：
            简化JSP代码
        格式：
            ${域对象的名称}
        操作对象
            EL表达式一般操作的是域对象，不能操作局部变量。
        操作范围：
            page范围
                在当前页面
            req范围
                第一次请求
            session范围
                在一次会话
            application范围
                在整个应用程序
        注：
            1.如果el表达式获取对象的值为空，默认显示空字符串
            2.el表达式默认从小到大范围去找，找到即可，如果四个范围都未找到，则显示空字符串
        查找数据时可以使用四个域对象对应的空间对象，分别是：
            pageScope，requestScope，sessionScope，applictionScope
    --%>


    <%-- 设置数据   --%>
    <%
        pageContext.setAttribute("uname","zhangsan");  //page作用域
        request.setAttribute("uname","lisi");  //req作用域
        session.setAttribute("uname","wangwu");  //session作用域
        application.setAttribute("uname","zhaolui"); //application

        //定义局部变量
        String str = "Hello";
    %>
    <%-- 获取数据 --%>
    获取局部变量：${str} <br>
    获取域对象：${uname} <br>
    获取指定范围的域对象：<br>
    &nbsp;&nbsp;page范围：${pageScope.uname}<br>
    &nbsp;&nbsp;request范围：${requestScope.uname}<br>
    &nbsp;&nbsp;session范围：${sessionScope.uname}<br>
    &nbsp;&nbsp;application范围：${applicationScope.uname}<br>

</body>
</html>

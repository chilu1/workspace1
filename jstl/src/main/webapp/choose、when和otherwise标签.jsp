<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose、when和otherwise标签</title>
</head>
<body>
    <%--
        choose、when和otherwise标签
            格式：
                <c:choose>
                    <c:when test="<boolean>">
                        ...
                    </c:when>
                    <c:when test="<boolean>">
                       ...
                    </c:when>
                    <c:when test="<boolean>">
                        ...
                    </c:when>
                    ...
                    ...
                    <c:otherwise>
                        ...
                    </c:otherwise>
                </c:choose>
            属性：
                1.choose标签没有属性
                2.when标签只有一个test属性，必须属性
                3.otherwise标签没有属性
            注意：
                1.choose标签和otherwise标签没有属性，而when标签必须有一个test属性
                2.choose标签中必须包含至少一个when标签，可以没有otherwise标签
                3.otherwise标签必须设置最后一个when标签之后
                4.choose标签中只能设置when标签与otherwise标签
                5.when标签和otherwise标签中可以嵌套其他标签

    --%>
    <%
        request.setAttribute("score",60);
    %>
    <c:choose>
        <c:when test="${score < 60}">
            <h2>你个小渣渣！</h2>
        </c:when>
        <c:when test="${score == 60}">
            <h2>分不在高，及格就行！</h2>
        </c:when>
        <c:when test="${score > 60 && score < 80}">
            <h2>哎哟！不错哟！</h2>
        </c:when>
        <c:otherwise>
            <h2>你很棒棒哟！</h2>
        </c:otherwise>

    </c:choose>

</body>
</html>

<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>格式化动作标签</title>
</head>
<body>
    <%--
        格式化动作标签
            formatNumber标签
                语法格式：
                    <fmt:formatNumber
                        value="<string>"
                        type="<string>"
                        var="<string>"
                        scope="<string>"/>
                常用属性：
                    value:要格式化的数值
                    type：要格式化的类型
                        number：数值类型（默认）
                        percent：百分比类型
                        currency：货币类型
                    var：限域变量名，用来接收格式化的后果
                    scope：var属性的范围（page|request|session|application
                注：
                    1.如果使用了var属性，标签不会输出结果，需要通过el表达式获取
                    2.默认的类型（type）的取值为number

            formatDate标签
                将Date型的数据转化成指定格式的字符串
                语法格式：
                <fmt:formatDate
                    value="<string>"
                    type="<string>"
                    dateStyle="<string>"
                    timeStyle="<string>"
                    pattern="<string>"
                    timeZone="<string>"
                    var="<string>"
                    scope="<string>"/>
                常用属性:
                    value：要格式化的日期
                    type：格式化的类型
                        date：日期型 年月日
                        time: 时间型 时分秒
                        both：日期时间型
                    dateStyle:日期格式
                    timeStyle：日期时间
                    pattern：自定义模式 y M d H m s

             paseNumber标签
                将指定格式的数值字符串转化成数值型
                语法格式：
                    <fmt:parseNumber
                        value="<string>"
                        type="<string"
                        var="<string>"
                        scope="<string>"/>
            paseDate标签
                将日期型的字符转换成Date型
                语法格式：
                    <fmt:parseDate
                        type="<string>"
                        dateStyle="<string>"
                        timeStyle="<string>"
                        pattern="<string>"
                        var="<string>"
                        scope="<string>"/>





     --%>
    <fmt:formatNumber value="10" type="number" var="num"/> ${num} <br>
    <fmt:formatNumber value="10" type="percent" /> <br>
    <fmt:formatNumber value="10" type="currency" /> <br>
    <%-- 设置时区 --%>
    <fmt:setLocale value="en_US"/>
    <fmt:formatNumber value="10" type="currency"/>

    <hr>
    <%-- 格式化日期   --%>
    <%
        request.setAttribute("myDate",new Date());
    %>
    ${myDate}<br>
    <fmt:formatDate value="${myDate}"/><br>
    <fmt:formatDate value="${myDate}" type="date"/><br>
    <fmt:formatDate value="${myDate}" type="time"/><br>
    <fmt:formatDate value="${myDate}" type="both"/><br>
    <fmt:formatDate value="${myDate}" type="both" dateStyle="FuLL"/><br>
    <fmt:formatDate value="${myDate}" type="both" timeStyle="short"/><br>
    <fmt:formatDate value="${myDate}" pattern="yyyy-MM-dd"/><br>
    <hr>
    <fmt:setLocale value="zh_CN"/>
    <fmt:parseNumber value="100"/><br>
    <fmt:parseNumber value="100" type="number"/><br>
    <fmt:parseNumber value="100%" type="percent"/><br>
    <fmt:parseNumber value="￥10.00" type="currency"/><br>
    <hr>
    <fmt:parseDate value="2020-07-22" type="date"/><br>
    <fmt:parseDate value="2020/07/22" pattern="yyyy/MM/dd"/><br>
</body>
</html>

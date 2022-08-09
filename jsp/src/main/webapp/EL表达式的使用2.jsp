<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.jsp.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用2</title>
</head>
<body>
    <%--
        EL表达式的使用
            empty
                判断域对象是否为空
                    为空，返回true：
                    不为空，返回false：
                如果域对象是字符串：
                    不存在的域对象：true
                    空字符串：true
                    null：true
                如果域对象是List:
                    null:true
                    没有长度List (size) ：true
                如果域对象是Map：
                    null: true
                    空map对象：true
                如果域对象是JavaBean对象：
                    null：true
                    空对象：false
                判断域对象不为空
                    ${!empty 限域变量名}

    --%>

    <%
        //字符串
        request.setAttribute("str1","abc");
        request.setAttribute("str2","");
        request.setAttribute("str3",null);
        //List
        List list1 = new ArrayList<>();
        List list2 = null;
        List list3 = new ArrayList<>();
        list3.add(1);
        request.setAttribute("list1",list1);
        request.setAttribute("list2",list2);
        request.setAttribute("list3",list3);
        //Map
        Map map1 = null;
        Map map2 = new HashMap<>();
        Map map3 = new HashMap<>();
        map3.put(1,2);
        request.setAttribute("map1",map1);
        request.setAttribute("map2",map2);
        request.setAttribute("map3",map3);
        //JavaBean
        User user1 = null;
        User user2 = new User();
        User user3 = new User();
        user3.setUserId(1);
        request.setAttribute("user1",user1);
        request.setAttribute("user2",user2);
        request.setAttribute("user3",user3);
    %>

<div>判断字符串是否存在</div>
${empty str}<br>
${empty str1}<br>
${empty str2}<br>
${empty str3}<br>
<hr>
<div>判断List是否为空</div>
${empty list1}<br>
${empty list2}<br>
${empty list3}<br>
<hr>
<div>Map</div>
${empty map1}<br>
${empty map2}<br>
${empty map3}<br>
<hr>
<div>JavaBean对象</div>
${empty user1}<br>
${empty user2}<br>
${empty user3}<br>

</body>
</html>

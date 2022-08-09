<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.jsp.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用1</title>
</head>
<body>
    <%--
        EL表达式的使用
            获取List
                获取List的size ${list.size()}
                获取List的下标值    ${list[下标]}
                注：List代表的是限域变量名
            获取Map
            获取Map中指定key的value   ${map.key} 或 ${map["key"]}
                注：map代表的是限域变量名
            获取JavaBean对象
                获取JavaBean中的属性
                    ${JavaBean.属性名} 或 ${JavaBean对象.get属性名()}
                注：JavaBean中的属性字段必须提供get方法
     --%>
    <%
        //List
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        request.setAttribute("list",list);

        //Map
        Map map = new HashMap();
        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc-a","333");
        request.setAttribute("map",map);

        //JavaBean
        User user = new User();
        user.setUserId(1);
        user.setUname("zhangsan");
        user.setUpwd("123456");
        request.setAttribute("user",user);

    %>
<h4>获取List</h4>
获取List的size：${list.size()}<br>
获取List的指定下标的值：${list[1]}
<h4>获取Map</h4>
获取Map指定key的value值：${map.aaa} -- ${map.bbb}
<h4>获取JavaBean对象</h4>
获取JavaBean对象：${user}<br>
获取JavaB中的属性：${user.uname} --${user.getUpwd()}
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/21
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet脚本小程序</title>
</head>
<body>

      <%--
          Scriplet脚本小程序
            JSP一共有三种Scriplet脚本小程序：
              第一种：Java脚本段，可以写Java代码，定义局部变量、编写语句等
                <%
                    //可以写Java代码
                %>
              第二种：声明全局变量、方法、类等
                <%!
                    //声明全局变量
                %>
              第三种：输出表达式，可以输出变量或字面量
                <%=数值 %>
              
      --%>

      <%-- 第一种：Java脚本段，可以写Java代码，定义局部变量、编写语句等     --%>
      <%
        //定义局部变量
        String str = "Hello JSP";
        //输出内容到控制台
        System.out.println(str);
        //输出内容到浏览器
        out.print(str);
        out.write("==============");
        //输出全局变量
        out.write("全局变量："+num);
        out.write("==============");
      %>
      <%-- 第二种：声明全局变量、方法、类等 --%>
      <%!
          int num = 10;
      %>
      
      <%-- 第三种：输出表达式，可以输出变量或字面量 --%>
      <%=str %>
      

</body>
</html>

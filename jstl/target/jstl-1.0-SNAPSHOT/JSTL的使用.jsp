<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/22
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 通过taglib标签引入所需要的标签库 --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL的使用</title>
    <%--
        JSTL的使用
            1.下载JSTL所需要的jar包 (standard.jar 和 jstl.jar)
            2.在项目的web目录下的WEB-INF目录，将jar拷贝进去
            3.选择"File",再选择"Project Structure"
            4.选择"Modules",选择右侧的"Dependencies",选择"+"号，将对应的lib目录加载进来
            5.在需要使用标签库的JSP页面通过taglib标签引入指定库
    --%>
</head>
<body>
    <c:if test="${1==1}">
        Hello JSTL
    </c:if>

</body>
</html>

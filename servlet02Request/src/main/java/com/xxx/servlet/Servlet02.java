package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 乱码原因：
 *          由于在解析过程中默认使用编码方式为ISO-8859-1（此编码不支持中文），所以解析时一定会出现乱码。
 *
 * 请求乱码问题
 *              Tomcat8以上的版本
 *GET请求       不会乱码
 *
 * POST请求     会乱码，通过设置服务器解析编码格式
 *              request.setCharacterEncoding("UTF-8");
 */
@WebServlet("/ser02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求的编码格式
        req.setCharacterEncoding("UTF-8");
        //获取客户端传递的参数
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("姓名："+uname);
        System.out.println("密码："+upwd);

    }
}

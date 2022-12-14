package com.example.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取ServletContext对象
 *      1.通过req对象获取
 *      2.通过session对象获取
 *      3.通过ServletConfig对象获取
 *      4.在Servlet直接获取
 *  常用方法
 *      1.获取当前服务器的版本信息
 *      2.获取项目的真实路径
 */
@WebServlet("/s01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过req对象获取
        ServletContext servletContext1 = req.getServletContext();

        //通过session对象获取
        ServletContext servletContext2 = req.getSession().getServletContext();

        //通过ServletConfig对象
        ServletContext servletContext3 =getServletConfig().getServletContext();

        //直接获取
        ServletContext servletContext4 = getServletContext();

        //常用方法
        //1.获取当前服务器的版本信息
        String serverInfo = req.getServletContext().getServerInfo();
        System.out.println("获取当前服务器的版本信息：" + serverInfo);
        //2.获取项目的真实路径
        String realPath = req.getServletContext().getRealPath("/");
        System.out.println("获取项目的真实路径：" + realPath);
    }
}

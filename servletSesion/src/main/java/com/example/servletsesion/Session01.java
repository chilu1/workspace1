package com.example.servletsesion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Session对象
 *  session对象的获取
 *      request.getSession()
 *      当获取session对象时，会先判断session对象是否存在，如果存在，则获取session对象；如果不存在，则创建session对象
 *      常用方法
 *          获取session会话标识符     getId()
 *          获取session的创建时间     getCreationTime()
 *          获取最后一次访问时间       getLastAccessedTime()
 *          判断是否是新的session对象  isNew()
 */
@WebServlet("/ser01")
public class Session01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();

        //获取session的会话标识符
        String id = session.getId();
        System.out.println(id);
        //获取session的创建时间
        System.out.println(session.getCreationTime());
        //获取最后一次访问时间
        System.out.println(session.getLastAccessedTime());
        //判断是否是新的session对象
        System.out.println(session.isNew());
    }
}

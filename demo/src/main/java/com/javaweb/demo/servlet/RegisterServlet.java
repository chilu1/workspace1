package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.UserDao;
import com.javaweb.demo.dao.impl.UserDaoImpl;
import com.javaweb.demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现用户注册的操作
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");//获取jsp页面传过来的参数
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String home = request.getParameter("home");
        String info = request.getParameter("info");

        User user = new User();//实例化一个对象，组装属性
        user.setName(name);
        user.setPwd(pwd);
        user.setSex(sex);
        user.setHome(home);
        user.setInfo(info);

        UserDao ud = new UserDaoImpl();

        if (ud.register(user)){
            request.setAttribute("username",name);//向request域中放置参数
            //request.setAttribute("xiaoxi","注册成功");
            request.getRequestDispatcher("/login.jsp").forward(request,response);//转发到登录页面
        }else {
            response.sendRedirect("index.jsp");//重定向到首页
        }
    }
}

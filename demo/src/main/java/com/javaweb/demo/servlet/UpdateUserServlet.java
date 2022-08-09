package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.UserDao;
import com.javaweb.demo.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/UpdateUser")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String home = request.getParameter("home");
        String info = request.getParameter("info");

        System.out.println("-----------------------------------"+userId);

        UserDao ud = new UserDaoImpl();

        if (ud.update(userId,name,pwd,sex,home,info)){
            request.setAttribute("xiaoxi","更新成功");
            request.getRequestDispatcher("/FindUserList").forward(request,response);
        }else {
            response.sendRedirect("index.jsp");
        }

    }
}

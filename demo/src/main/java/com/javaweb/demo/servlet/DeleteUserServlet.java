package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.UserDao;
import com.javaweb.demo.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除用户操作
 */
@WebServlet("/DeleteUser")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        UserDao ud = new UserDaoImpl();

        if (ud.delete(userId)){
            request.setAttribute("xiaoxi","删除成功");
            request.getRequestDispatcher("/FindUserList").forward(request,response);
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}

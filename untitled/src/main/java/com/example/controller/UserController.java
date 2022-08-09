package com.example.controller;

import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import com.example.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 用户模块的controller
 */
@WebServlet("/user")
public class UserController extends BaseServlet{

    public String check(HttpServletRequest req,HttpServletResponse resp){

        String username = req.getParameter("username");
        if (username == null){
            return Constants.HAS_USER;
        }
        UserService userService = new UserServiceImpl();
        boolean b = userService.checkUser(username);
        if (b){
            return  Constants.HAS_USER;
        }
        return Constants.NOT_HAS_USER;
    }
    public String checkEmail(HttpServletRequest req,HttpServletResponse resp){
        String uemail = req.getParameter("uemail");
        boolean result = isEmail(uemail);
        if (result){
            return "1";
        }
        return "0";
    }
    public static boolean isEmail(String string){
        if (string == null)
            return false;

            String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@(a-z0-9A-Z]+(-[a-z0-9A-Z]+)?//.)+[a-zA-Z]{2,}$";

            Pattern p;
            Matcher m;
            p = Pattern.compile(regEx1);
            m = p.matcher(string);

        if (m.matches()) {
            return true;
        } else{
            return false;
        }
    }

}

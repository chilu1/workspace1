package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    //请求地址 http://localhost/user/quick  //method:用于指定请求的方式,params = {"username"}，表示请求参数必须有username
    @RequestMapping(value = "quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("Controller save running....");
        return "/success.jsp";
    }

    @RequestMapping(value = "quick1",method = RequestMethod.GET)
    public String save1(){
        System.out.println("Controller save running....");
        return "成功";
    }
}

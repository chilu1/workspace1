package com.example.servlet04cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie的到期时间
 *      负整数
 *             表示只在浏览器内存中存活，关闭浏览器失效。（默认值-1）
 *      正整数
 *             表示存活指定秒数。单位秒。
 *      零
 *          表示删除cookie
 */
@WebServlet("/cook03")
public class Cookie03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*到期时间：负整数 （默认值-1，表示只在浏览器内存中存活，关闭浏览器失效*/
        Cookie cookie = new Cookie("uname1","zhangsan");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);

        /*到期时间：正整数 （表示存活指定秒数，会将数据存在磁盘中*/
        Cookie cookie2 = new Cookie("uname2","lisi");
        cookie2.setMaxAge(30); //存活30秒
        resp.addCookie(cookie2);

        /*到期时间：零 （表示删除cookie）*/
        Cookie cookie3 = new Cookie("uname3","wangwu");
        cookie.setMaxAge(0); //删除cookie
        resp.addCookie(cookie3);
    }
}

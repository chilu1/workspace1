package com.example.servletsesion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Session对象的销毁
 *      1.默认到期时间
 *          Tomcat中的session默认的存活时间为30min，即你不操作界面的时间，一旦有操作，session会重新计时。
 *          可以在Tomcat中的conf目录下的web.xml文件中进行修改。
 *          session 默认的最大不存活时间。单位：分钟。
 *          <session-config>
 *              <session-timeout>30</session-timeout>
 *          </session-config>
 *      2.手动设置到期时间
 *          可以在程序中自己设定session的生命周期。
 *          通过session.setMaxInactiveInterval(int) 来设定session的最大不活动时间，单位为秒 。
 *          可以通过getMaxInactiveInterval()方法来查看当前Session对象的最大不活动时间。
*       3.立即销毁
 *          可以通过session.invalidate()方法让session立即失效
*       4.关闭浏览器
 *          session底层依赖cookie对象默认只在浏览器内存活，关闭浏览器即失效
 *      5.关闭服务器
 *          当关闭服务器时，session 销毁
 *
 *
 */
@WebServlet("/ser03")
public class Session03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*session域对象*/
        //获取session对象
        HttpSession session = req.getSession();

        //设置session域对象
        session.setAttribute("uname","admin");

        /*//Session对象的最大不活动时间
        System.out.println("Session对象的最大不活动时间：" + session.getMaxInactiveInterval());
        //修改最大不活动时间
        session.setMaxInactiveInterval(15);//15秒失效*/

        //立即销毁     可以通过session.invalidate()方法让session立即失效
        //session.invalidate();

    }
}

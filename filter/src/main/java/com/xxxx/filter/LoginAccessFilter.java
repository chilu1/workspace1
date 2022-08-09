package com.xxxx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 非法访问拦截
 *      拦截的资源：
*           拦截所有资源  /*
*       需要放行的资源：
 *          1.放行指定页面，放行（无需登录即可访问到的页面，例如登录页面、注册页面等）
 *          2.静态资源，放行 （image、js、css文件等）
 *          3.指定操作，放行（无需登录即可执行的操作 例如：登录操作、注册操作）
 *          4.登录状态，放行（判断session中用户信息是否为空）
 *
 *          其他请求需要被拦截跳转到其他页面
 */
@WebFilter("/*")
public class LoginAccessFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //基于HTTP请求
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //获取请求路径
        String url = request.getRequestURI();
        System.out.println(url);

        //1.放行指定页面，放行（无需登录即可访问到的页面，例如登录页面、注册页面等）
        if (url.contains("login.jsp")){
            filterChain.doFilter(request,response);
            return;
        }

        //2.静态资源，放行 （image、js、css文件等）
        if (url.contains("/js") || url.contains("/image") || url.contains("/css")){
            filterChain.doFilter(request,response);
            return;
        }

        // 3.指定操作，放行（无需登录即可执行的操作 例如：登录操作、注册操作）
        if (url.contains("login")) {
            filterChain.doFilter(request, response);
            return;
        }

        //4.登录状态，放行（判断session中用户信息是否为空）
        String uname = (String) request.getSession().getAttribute("user");
        //判断session是否为空
        if (uname != null){
            filterChain.doFilter(request,response);
            return;
        }

        //当用户未登录时，拦截请求跳转到登录页面
        response.sendRedirect("login.jsp");
    }

    @Override
    public void destroy() {

    }
}

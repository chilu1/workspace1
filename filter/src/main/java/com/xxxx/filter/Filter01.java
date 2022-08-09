package com.xxxx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器
 *      1.@WebFilter("/s01")  配置拦截的资源路径
 *      2.doFilter()方法中需要设置放行，否则请求无法到达资源( filterChain.doFilter(servletRequest,servletResponse )
 *      3.如果是过滤器链，则先配置的先执行（首字母在前的先执行）;响应时，顺序反过来即可
 */

@WebFilter("/s01")//拦截路径s01的资源
public class Filter01 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter01 init...");
    }

    /**
     * 过滤方法
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //doFilter()放行方法前去做请求拦截的
        System.out.println("Filter01 正在拦截...");
        //放行资源
        filterChain.doFilter(servletRequest,servletResponse);
        //doFilter()放行方法后去做响应拦截的
        System.out.println("Filter01 处理响应...");
    }

    @Override
    public void destroy() {
        System.out.println("Filter01 init...");

    }
}

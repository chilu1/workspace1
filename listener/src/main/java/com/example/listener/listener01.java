package com.example.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class listener01 implements HttpSessionListener {

    /**
     * 当session对象被创建时执行
     * @param httpSessionEvent
     */

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session对象被创建了...");

    }

    /**
     * 当session对象被销毁时执行
     * @param httpSessionEvent
     */

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session对象被销毁了...");
    }
}

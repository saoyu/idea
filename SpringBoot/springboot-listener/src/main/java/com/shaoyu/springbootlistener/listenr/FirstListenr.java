package com.shaoyu.springbootlistener.listenr;

import ch.qos.logback.classic.util.ContextInitializer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListenr implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("listener destroy--->>>");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("first listener init--->>>");
    }
}

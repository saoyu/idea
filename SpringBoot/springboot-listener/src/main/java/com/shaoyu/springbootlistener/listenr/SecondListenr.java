package com.shaoyu.springbootlistener.listenr;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


public class SecondListenr implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("second listener destroy--->>>");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener init--->>>");
    }
}

package com.shaoyu.springbootlistener;

import com.shaoyu.springbootlistener.listenr.SecondListenr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

@SpringBootApplication
public class SpringbootListenerApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootListenerApplication02.class, args);
    }

    public ServletListenerRegistrationBean<SecondListenr> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListenr> bean = new ServletListenerRegistrationBean<>(new SecondListenr());
        return bean;
    }

}

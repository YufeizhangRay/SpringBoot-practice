package cn.zyf.springboot.springbootdemo2.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Mylistener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("系统启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

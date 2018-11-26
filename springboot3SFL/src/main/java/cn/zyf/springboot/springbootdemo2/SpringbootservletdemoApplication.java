package cn.zyf.springboot.springbootdemo2;

import cn.zyf.springboot.springbootdemo2.listener.Mylistener;
import cn.zyf.springboot.springbootdemo2.servlet.IndexServlet;
import cn.zyf.springboot.springbootdemo2.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;

@SpringBootApplication
//@ServletComponentScan
public class SpringbootservletdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootservletdemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new IndexServlet());
        bean.addUrlMappings("/index");
        return bean;
    }

    @Bean
    public FilterRegistrationBean getFilterBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new MyFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new Mylistener());
        return bean;
    }

}

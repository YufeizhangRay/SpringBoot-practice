package cn.zyf.springboot.springbootdemo2.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(filterName = "MyFilter",urlPatterns = "/index")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String url = request.getRequestURI();
        if (url.contains("favicon.ico")){
            return;
        }
        System.out.println("MyFilter拦截器进来了");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("MyFilter拦截器出去了");
    }

    @Override
    public void destroy() {

    }
}

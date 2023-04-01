//package com.example.demo.controller;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//public class SimpleFilter implements Filter {
//    @Override
//    public void destroy() {}
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
//        throws IOException, ServletException {
//
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException{
//        String site = filterConfig.getInitParameter("Site");
//
//        // 输出初始化参数
//        System.out.println("网站名称: " + site);
//    }
//}

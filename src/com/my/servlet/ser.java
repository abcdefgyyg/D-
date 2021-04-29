package com.my.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser06")
public class ser extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url=request.getRequestURL()+"";
        System.out.println("URL："+url);

        String uri=request.getRequestURI();
        System.out.println("URI："+uri);

        String queryString=request.getQueryString();
        System.out.println("参数："+queryString);
    }

}

package com.my.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser01")
//@WebServlet(name = "servlet01",value = {"/ser01","/ser02"})
//@WebServlet(name = "servlet01",urlPatterns = {"/ser01","/ser02"})
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet!");
        //通过流输出数据到浏览器
        resp.getWriter().write("Hello Servlet!");

    }

}

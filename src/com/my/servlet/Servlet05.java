package com.my.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser05")
public class Servlet05 extends HttpServlet {

    /**
     * 初始化方法
     * 系统方法，由服务器自动调用
     *
     * 该方法只会执行一次
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet被创建了");

    }
    /*
    * 销毁方法
    * 系统方法，由服务器自动调用
    * 当服务器关闭或者应用程序停止时调用
    * */
    @Override
    public void destroy() {
        System.out.println("Servlet被销毁了");
    }

    /*服务方法
    * 处理请求数据
    * 系统方法，由服务器自动调用
    * 当有请求到达Servlet时调用，可以多次调用
    * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet被调用了");

    }



}

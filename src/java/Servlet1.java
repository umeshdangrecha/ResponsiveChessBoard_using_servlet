/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author umesh
 */
public class Servlet1 implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("sevelet-config");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("servlet-info");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

}

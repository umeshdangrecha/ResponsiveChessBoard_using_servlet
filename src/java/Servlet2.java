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
public class Servlet2 implements Servlet {

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
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Servlet");
        out.println("</title>");
        out.println("</head>");
        out.println("<body bgcolor=cyan>");
        for(int i = 0 ; i<10 ; i++){
        out.println("<h1>This is H1</h1>");
        }
        out.println("</body>");
        out.println("</html>");
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

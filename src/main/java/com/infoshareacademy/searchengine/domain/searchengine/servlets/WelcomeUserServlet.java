package com.infoshareacademy.searchengine.domain.searchengine.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet{

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getParameter("name") == null){
        resp.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
        return;
        }

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body");
        writer.println("Cześć "+ req.getParameter("name") + "!<br />");
        writer.println("</body>");
        writer.println("</html>");
    }
}

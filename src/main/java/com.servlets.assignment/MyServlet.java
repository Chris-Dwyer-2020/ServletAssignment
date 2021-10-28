package com.servlets.assignment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("name",request.getParameter("name"));

        request.setAttribute("password",request.getParameter("password"));

        request.setAttribute("New name and password", "Attribute added");

        request.removeAttribute("name");

        request.setAttribute("password", "Test");

        RequestDispatcher rd = request.getRequestDispatcher("servlet-listener.html");
        rd.forward(request, response);
    }
}


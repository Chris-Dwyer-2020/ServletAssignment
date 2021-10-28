package com.servlets.assignment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HttpTestServlet")
public class HttpTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        String requestType = httpServletRequest.getParameter("requestType");
        if (requestType.equals("GET")) {
            HttpClient.get();
        }
        if (requestType.equals("PUT")) {
            HttpClient.put();
        }
        if (requestType.equals("DELETE")) {
            HttpClient.delete();
        }
        if (requestType.equals("POST")) {
            HttpClient.post();
        }
    }
}

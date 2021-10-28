package com.servlets.assignment;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private Map<String, String> userCredentials;

    @Override
    public void init() throws ServletException {
        userCredentials = new HashMap<>();
        userCredentials.put("Chris Dwyer", "testing1234#");
        userCredentials.put("Joe Blogs", "iamuser123");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Step 1: set content type
        response.setContentType("text/html");

        // Step 1.5: find out if the user has logged in
        String userName = request.getParameter("name");
        String password = request.getParameter("password");

        if ( userCredentials.containsKey(userName) && userCredentials.get(userName).equals(password)) {
            response.getWriter().println("Name/Password Match");
        } else {
            response.getWriter().println("Name/Password does not match");
        }

    }


}

package com.servlets.assignment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.print("This is coming from servlet 2");

        MyWrapper myWrapper = new MyWrapper(httpServletResponse);
        myWrapper.testConsole();
    }
}


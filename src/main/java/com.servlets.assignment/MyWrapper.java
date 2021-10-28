package com.servlets.assignment;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyWrapper extends HttpServletResponseWrapper {

    public MyWrapper(HttpServletResponse httpServletResponse) {
        super(httpServletResponse);
    }

    public void testConsole() {
        System.out.println("Does a wrapper even rap man?!");
    }
}

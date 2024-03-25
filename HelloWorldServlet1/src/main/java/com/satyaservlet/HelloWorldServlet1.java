package com.satyaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HelloWorldServlet1() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter writer = response.getWriter();
	writer.println("Satya");
	writer.println("Tech");
	writer.println("Ameerpet");
	
	}

}

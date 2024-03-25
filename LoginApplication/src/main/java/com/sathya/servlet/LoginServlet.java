package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public LoginServlet() {}
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step1: Read the form data
		String username=request.getParameter("Username");
		String password=request.getParameter("password");
	//step2:process the data
		String status;
		if (username.equals("Sathya")&&password.equals("Sathya@123"))
		{
			status="LoginSuccessfull...";
			
		}
		else
		{
			status="Login Fail...";
		}
		//step3:Render the response to client
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Loginstatus...</h1>"+status);
		writer.println("</html>");
	}

		
	

}

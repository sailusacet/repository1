package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		if(pwd.equals("admin"))
		{
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet2");
		
		rd.forward(request, response);
		}
		else
		{
			response.getWriter().println("sorry username or password error,kindly check once");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			
			rd.include(request, response);
		}
		
	}

}
package com.servletjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Banking")
public class Banking extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accnum=Integer.parseInt(request.getParameter("accno"));
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps=con.prepareStatement("select balance from accounts where accnum=?");
		ps.setInt(1, accnum);
		ResultSet rs=ps.executeQuery();
		PrintWriter pw=response.getWriter();
		
		pw.println("the available balance in the account is "+rs.getString(1));
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

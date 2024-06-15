package com.package8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveStudents {
	public static void main(String[] args) throws Exception {
		//1.load the driver class
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 //2.get the connection from db
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 //3.prepare the statement object
		 Statement st=con.createStatement();
		 //4.process the query
		 ResultSet rs=st.executeQuery("select * from student");
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+"===>"+rs.getString(2));
		 }
		 rs.close();
		 //5.close the connection
		 con.close();
		 
	}
}

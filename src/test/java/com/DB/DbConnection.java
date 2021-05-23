package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbConnection {
	//@Test
	public void mm() throws SQLException {
		String host = "localhost";
		String port = "3306";
		String url = "jdbc:mysql://" + host + ":" + port + "/qapr";
		Connection con = DriverManager.getConnection(url, "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from student where  name = 'siva';");
		rs.next();
		System.out.println(rs.getString("name"));
		
		con.close();
	}
	
	@Test
	public void mm2() throws SQLException {
		String host="localhost";
		String port="3306";
	
		String query="Select * from student where  name = 'siva';";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qapr","root","root");
		
 	   Statement stmt = con.createStatement();					

			
  		ResultSet rs= stmt.executeQuery(query);							
  		
			while (rs.next()){
		        		String myName = rs.getString("name");								        
                     					                               
                     System. out.println(myName);		
             }		
			 	
			con.close();		
	}

}

package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jdbcConnection {

	@Test
	public  void m() throws SQLException {
		
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qapr", "root", "root");
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("Select * from student where  id = 1;");
		
		while(rs.next()) {
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("location"));
		}
		con.close();
	}

}

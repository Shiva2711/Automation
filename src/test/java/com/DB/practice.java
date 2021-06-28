package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class practice {
	
	@Test
	public void f() throws SQLException {
		
		String host ="localhost";
		
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +port+ "/qapr", "root", "root");
		
		Statement s = con.createStatement();
		
		ResultSet r = s.executeQuery("Select * from student where  id = 1");
		
		while(r.next()) {
			System.out.println(r.getString("name"));
			System.out.println(r.getString("location"));
			System.out.println(r.getString("Age"));
		}
		}

}

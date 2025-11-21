package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dp {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:msql://localhost:33006/qapr";
		Connection con = DriverManager.getConnection(url, "root", "root");
		Statement sm =con.createStatement();
		ResultSet rs = sm.executeQuery("Select * from name");
		System.out.println(rs);
		con.close();

	}
}

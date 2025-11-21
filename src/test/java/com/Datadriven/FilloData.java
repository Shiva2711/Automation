package com.Datadriven;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloData {
	
	public Map<String, String> getData(String SheetName, String Testcasename) throws FilloException {

		Map<String, String> data = new HashMap<String, String>();
		
		Fillo fillo = new Fillo();
		
		String path = ""; //File location paths
		Connection connection = fillo.getConnection(path);
		
		String query = "Select * from "+SheetName+" where Testcase ="+Testcasename;
		
		Recordset recordset = connection.executeQuery(query);
		
		while(recordset.next()) {
			
			for(String field : recordset.getFieldNames()) {
				
				data.put(field, recordset.getField(field));
			}
		}
		recordset.close();
		connection.close();
		
		return data;

	}
	
	public void updateData(String SheetName, String TestcaseName, String ColumnName, String Value) throws FilloException {
		Fillo fillo = new Fillo();
		
		String path = "";
		Connection connection = fillo.getConnection(path);
		
		String query = "Update "+SheetName+" Set "+ColumnName+" = "+Value+" where TestCase = "+TestcaseName;
		connection.executeUpdate(query);
		connection.close();
	}

	public static void main(String[] args) throws FilloException {
		
		
	}

}

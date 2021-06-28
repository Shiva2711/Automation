package com.test.utility;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.excelUtility.Xls_Reader;


public class TestUtils {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() throws FileNotFoundException {

		ArrayList<Object[]> a = new ArrayList<Object[]>();

		reader = new Xls_Reader(System.getProperty("user.dir") + "/data/TestData2.xlsx");

		int rowCount = reader.getRowCount("Sheet1");

		for (int i = 2; i <= rowCount; i++) {

			String UserType = reader.getCellData("Sheet1", "UserType", i);
			String Username = reader.getCellData("Sheet1", "Username", i);
			String Password = reader.getCellData("Sheet1", "Password", i);

			Object[] ob = { UserType, Username, Password };
			
			a.add(ob);
		}
		return a;
	}
}

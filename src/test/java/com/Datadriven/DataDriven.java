package com.Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {

	public ArrayList<String> getData(String testcaseName) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rshiv\\git\\RummyBaaziProject\\data\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> row = sheet.iterator();
				Row firstRow = row.next();
				Iterator<Cell> col = firstRow.cellIterator();

				int k = 0;
				int column = 0;

				while (col.hasNext()) {
					Cell values = col.next();

					if (values.getStringCellValue().equalsIgnoreCase("Username")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (row.hasNext()) {
					Row r = row.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							
							Cell c = cv.next();
							
							if (c.getCellType()== CellType.STRING) {
								a.add(c.getStringCellValue());
							}
							
							else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}	
					}
				}
			}
		}
		return a;
	}
}

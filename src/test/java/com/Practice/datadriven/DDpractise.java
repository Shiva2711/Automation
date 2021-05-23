package com.Practice.datadriven;

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

public class DDpractise {

	public static ArrayList<String> dd() throws IOException {
		ArrayList<String> a = new ArrayList<>();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//data//TestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int NoOfSheet = workbook.getNumberOfSheets();

		for (int i = 0; i < NoOfSheet; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> row = sheet.rowIterator();

				row.next();
				Row r = row.next();
				
				Iterator<Cell> cell = r.cellIterator();
				
				while(cell.hasNext()) {
					
					Cell c = cell.next();
					
					if (c.getCellType()==CellType.STRING) {
						
						a.add(c.getStringCellValue());
					}
					
					else a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
				}
			}
		}
		return a;
	}
	
	public static void main(String args[]) throws IOException {
		ArrayList<String> a =DDpractise.dd();
		a.stream().forEach(s->System.out.println(s));
	}

}

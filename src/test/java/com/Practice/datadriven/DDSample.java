package com.Practice.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDSample {

	public static ArrayList<String> dd() throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//data//TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int noOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i < noOfSheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.rowIterator();
				row.next();
				Row value = row.next();
				Iterator<Cell> cell1 = value.cellIterator();
				while (cell1.hasNext()) {
					Cell c = cell1.next();

					if (c.getCellType() == CellType.STRING) {
						a.add(c.getStringCellValue());
					} else {
						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
				}
			}
		}

		return a;

	}

	public static void main(String[] args) throws IOException {
		ArrayList<String> gg = DDSample.dd();
		System.out.println(gg.get(0));
		System.out.println(gg.get(1));

	}

}
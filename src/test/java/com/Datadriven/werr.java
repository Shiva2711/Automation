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

public class werr {
	
	public static ArrayList<String> dd( ) throws IOException {
		
		ArrayList<String> a = new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rshiv\\git\\RummyBaaziProject\\data\\TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i =0; i<=sheets; i++) {
		
		if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
			
			XSSFSheet sheet = workbook.getSheetAt(i);
			
			Iterator<Row> row = sheet.iterator();
			
			row.next();
			
			Row r = row.next();
			
			Iterator<Cell> cell =r.cellIterator();
			
			Cell c =cell.next();
			
			if (c.getCellType() == CellType.STRING) {
				
				a.add(c.getStringCellValue());		
			}
			
			else a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
		}
	}
		return a;
	}
	
	public static void main(String args[]) throws IOException {
		
		werr.dd().stream().forEach(s->System.out.println(s));
		
	}

}

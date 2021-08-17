package com.Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rshiv\\git\\RummyBaaziProject\\data\\TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =workbook.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println((NumberToTextConverter.toText(sheet.getRow(1).getCell(1).getNumericCellValue())));
		//System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		
		sheet.getRow(3).getCell(0).setCellValue("rbtest53");
		sheet.getRow(3).getCell(1).setCellValue("Test@123");
		
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\rshiv\\\\git\\\\RummyBaaziProject\\\\data\\\\TestData.xlsx");
		
		workbook.write(fos);
		
		fos.close();
		
		String s = sheet.getRow(3).getCell(2).getStringCellValue();
	
		if(sheet.getRow(3).getCell(2).equals(s)) {
			String k = s.split("-")[1];
			System.out.println(k);
			int number = Integer.parseInt(k);
			System.out.println(number);
			sheet.getRow(3).getCell(2).setCellValue("Test-" +(NumberToTextConverter.toText(number+1)));
			
			workbook.write(fos);
			fos.close();
			
		}

	}

}

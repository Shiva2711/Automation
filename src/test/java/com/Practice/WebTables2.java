package com.Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTables2 {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
		
		driver1.get("https://www.demoqa.com/webtables");
		
		List<WebElement> lastname = driver1.findElements(By.xpath("//div[@role='gridcell'][2]"));
		
		List<String> Age = lastname.stream().filter(s->s.getText().contains("Cantrell")).map(s->getAge(s)).collect(Collectors.toList());
		Age.stream().forEach(s->System.out.println(s));
		
		driver1.close();
	}

	private static String getAge(WebElement s) {
		String a = s.findElement(By.xpath("parent::div/div[3]")).getText();
		return a;
	}
	public WebDriver driver; 
	
	@BeforeTest
	public void before() {

		
		System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/webtables");
	}
	
	//@Test
	public void f() {
		
		
		WebElement WebTable = driver.findElement(By.xpath("//div[@class='rt-table']"));
		
		List<WebElement> rowwithdata = WebTable.findElements(By.xpath(".//div[@class='rt-td'][text()]"));
		
		rowwithdata.stream().forEach(s->s.getText());
 	}
	
	@Test
	public void f1() {
		
		WebElement table = driver.findElement(By.className("rt-tbody"));
		
		List<WebElement> rowData = table.findElements(By.xpath("div//div[@class='rt-td' and text()]/parent::div"));
		
		for(int i =0; i<rowData.size();i++) {
			//System.out.println("Row Value: " +(i+1));
			
			List<WebElement> colData = rowData.get(i).findElements(By.xpath("div[@class='rt-td' and text()]"));
			
			
			for(int j=0; j<colData.size();j++) {
			System.out.println("Row: " +(i+1)+ " Coloumn: " +(j+1)+ " data is: " +colData.get(j).getText());
			}
		}

		
	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}


}



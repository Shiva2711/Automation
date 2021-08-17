package com.Practice.collection;

import java.util.HashMap;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MapScenario {
	
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		username.sendKeys(getUsername("Admin"));
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password'] "));
		
		password.sendKeys(getPassword("Admin"));
		
	}
	
	@Test
	public void f() {
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
	}
	
	public static HashMap<String, String> getCredentialMap() {
		
		HashMap<String, String> k = new HashMap<String, String>();
		
		k.put("Customer", "Customer:Password");
		k.put("Manager", "Manager:Password");
		k.put("Admin", "Admin:Password");
		k.put("Admin", "Manager:Password1");
		
		
		return k;
	}
	
	public String getUsername(String role) {
		
		return getCredentialMap().get(role).split(":")[0];
	}
	
	public String getPassword(String role) {
		
		return getCredentialMap().get(role).split(":")[1];
	}
	

}

package com.RummyBazzi;
import java.sql.Driver;
//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MobileLogin {
	 private static String total;
	    @Test
	    public void test() throws InterruptedException 
	    {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sarath\\Downloads\\chromedriver_win32\\chromedriver.exe");

	
	//	C:\Users\sarath\Downloads\chromedriver_win32
		//System.setProperty("webdriver.chrome.driver","D:\\Chromedrive_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.get("https://www.rummybaazi.com");
		driver.get("https://preprodoptsite.rummybaazi.com");
		//driver.findElement(By.className("mobile-menu-icon")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("testLogin")).click();
		driver.findElement(By.id("getusername")).click();
		driver.findElement(By.id("getpassword")).click();
		driver.findElement(By.id("loginSubmit")).click();
	
	Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("rbuser1008"); 
		driver.findElement(By.name("password")).sendKeys("Test@123");	
		driver.findElement(By.id("loginSubmit")).click();
		System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
	   
		driver.get("https://preprodoptsite.rummybaazi.com/mobile/index.html#!/app/lobby");
	    
	    }
	    
	    
	
	
	

}

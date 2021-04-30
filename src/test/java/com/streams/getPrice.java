package com.streams;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class getPrice {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement mobandTAB = driver.findElement(By.xpath("//span[text() ='Mobile & Tablets']"));
		Actions action = new Actions(driver);
		action.moveToElement(mobandTAB).build().perform();

		WebElement Smartphones = driver.findElement(By.xpath("//span[text() ='Smartphones']"));
		Smartphones.click();

		
		  WebElement sort = driver.findElement(By.
		  xpath("//i[@class = 'sd-icon sd-icon-expand-arrow sort-arrow']"));
		  sort.click();
		  
	   //   WebElement lowtoHigh = driver.findElement(By.id("//li[@data-index = '1'][@class = 'search-li']"));
		//  lowtoHigh.click();
		 
		
		List <String> orderPrice;
		
		do {
		List<WebElement> orderName = driver.findElements(By.className("product-title "));
		
		orderPrice = orderName.stream().filter(s->s.getText().contains("MI Mix 2 ( 128GB , 6 GB ) Black"))
		.map(s->getthePrice(s)).collect(Collectors.toList());
		System.out.println(orderPrice);
		orderPrice.forEach(a->System.out.println(a));
		
		if(orderPrice.size()<1) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(100);
		}
		} while(orderPrice.size()<1);

	}
	public String getthePrice(WebElement s) {
		
		String Price = s.findElement(By.xpath("//span[@class = 'lfloat product-price']s")).getText();
		return Price;
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

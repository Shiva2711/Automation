package com.Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNGskip {
	
	
	public WebDriver driver;
	
	@Test (enabled = false)
	public void f() {
		System.out.println("Inside Test 1");
		
		WebElement okButton = driver.findElement(By.id(""));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementByid('').click();");
		
		jse.executeScript("arguments[0].click();", okButton);
		
	}

	@Test
	public void f2() {
		System.out.println("Inside Test 2");
		
		throw new SkipException("This Test is Skipped");
	}
	
	@Test 
	public void f3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[contains(text(), 'ADD TO CART')]"));
		addtocart.get(0).click();
		
		WebElement bag = driver.findElement(By.className("cart-icon"));
		bag.click();
		
		WebElement proceedtoCheckout = driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
		proceedtoCheckout.click();
		
		Thread.sleep(4000);
		
		List<WebElement> placeOrder = driver.findElements(By.xpath("//button"));
		placeOrder.get(1).click();
		//placeOrder.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeAsyncScript("arguments[0].click();", placeOrder);
		
		WebElement chooseCountry = driver.findElement(By.xpath("//select"));

		
		Select sel = new Select(chooseCountry);
		List<WebElement> options =sel.getOptions();
		//List<WebElement> options = driver.findElements(By.xpath("//select/option"));
		for(int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());

		if (options.get(i).getText().equals("India")) {
			sel.selectByVisibleText("India");
		}
		}
	}
}

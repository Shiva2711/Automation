package com.Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class windowHandles2 {
	WebDriver driver;

	@Test
	public void f() {
		String parentWindow = driver.getWindowHandle();
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[contains(text(), 'Mobiles')]"))).keyUp(Keys.CONTROL).build().perform();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window: windows) {
			
			if(!window.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		Iterator<String> it = windows.iterator();
		
		String parentTab = it.next();
		System.out.println("Parent TAB: " +parentTab);
		
		String newTab = it.next();
		System.out.println("Child TAB: " + newTab);
		
		driver.switchTo().window(newTab);
		
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2[contains (text(), 'Latest launches in smartphones')]")).getText(), "Latest launches in smartphones");
		
		System.out.println("Following Text display in NewTab: " +driver.findElement(By.xpath("//div/h2[contains (text(), 'Latest launches in smartphones')]")).getText());
		}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}

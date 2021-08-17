package com.streams;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class streamFilters {
	WebDriver driver;

	@Test
	public void f() {
		
		WebElement search = driver.findElement(By.id("search-courses"));
		search.sendKeys("selenium webdriver");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class ='col-xs-12 col-sm-6 col-md-4']"));
		
		List<WebElement> filteredList = list.stream().filter(s->s.getText().contains("Selenium Webdriver with Java  (Basics+Advanced+Interview Guide)")).collect(Collectors.toList());
		
		Assert.assertEquals(list.size(), filteredList.size());
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://courses.rahulshettyacademy.com/courses");
	}

	@AfterTest
	public void afterTest() {
	}

}

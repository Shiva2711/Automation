package com.streams;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class streamSort {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void f() {
		WebElement mobileList = driver.findElement(By.xpath("//a[contains(text(), 'Mobiles')]"));
		mobileList.click();
		
		WebElement under100 = driver.findElement(By.xpath("//a/span[contains(text(),'Under ₹1,000')]"));
		under100.click();
		
		WebElement sort = driver.findElement(By.id("a-autoid-0-announce"));
		sort.click();
		
		WebElement lowtoHigh = driver.findElement(By.id("s-result-sort-select_1"));
		lowtoHigh.click();
		
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		
		List<String> Orginal = price.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(Orginal);
		
		List<String> Sorted = Orginal.stream().sorted().collect(Collectors.toList());
		System.out.println(Sorted);
		
		Assert.assertTrue(Sorted.equals(Sorted));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

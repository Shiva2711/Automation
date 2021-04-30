package com.streams;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class getPrice2 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		WebElement mobileList = driver.findElement(By.xpath("//a[contains(text(), 'Mobiles')]"));
		mobileList.click();

		WebElement under100 = driver.findElement(By.xpath("//a/span[contains(text(),'Under ₹1,000')]"));
		under100.click();

		WebElement sort = driver.findElement(By.id("a-autoid-0-announce"));
		sort.click();

		WebElement lowtoHigh = driver.findElement(By.id("s-result-sort-select_1"));
		lowtoHigh.click();
		
		//List <String> orderPrice;
		
		List<WebElement> orderName = driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
		
		for (int i=0; i<orderName.size(); i++) {
			if( orderName.get(i).getText() == "Generic Oppo A37 Transparent silicon back cover" ) {
				String price = driver.findElements(By.xpath("//span[@class = 'a-price-whole']")).get(i).getText();
				System.out.println(price);
			}
		}
		
		String prices = driver.findElements(By.xpath("//span[@class = 'a-price-whole']")).get(0).getText();
		
		//System.out.println(prices);
		
		/*
		 * orderPrice = orderName.stream().filter(s->s.getText().
		 * contains("CANVAS Unbreakable 2A Fast Charging Braided Micro USB Cable for Android Devices – 1.5 Meter (Black)"
		 * )) .map(s->getthePrice(s)).collect(Collectors.toList());
		 * System.out.println(orderPrice); orderPrice.forEach(a->System.out.println(a));
		 * 
		 * driver.findElement(By.xpath("//li[@class='a-last']")).click();
		 * Thread.sleep(2000);
		 */
	}
	public String getthePrice(WebElement s) {
		
		String Price = s.findElement(By.xpath("//span[@class = 'a-price-whole']")).getText();
		return Price;
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

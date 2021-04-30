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

public class getPrice3 {
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
		
		List <String> orderPrice;
		
		do {
		List<WebElement> orderName = driver.findElements(By.xpath("//div[@class = 'a-section a-spacing-none a-spacing-top-small'][1]"));
		
		orderPrice = orderName.stream().filter(s->s.getText().contains("Samsung Galaxy A70s - Soft Silicone Shockproof Bumper Case Back Cover in Transparent[Air Cushion Technology]-for Samsung Galaxy A70S"))
		.map(s->getthePrice(s)).collect(Collectors.toList());
		orderPrice.forEach(a->System.out.println(a));
		
		if(orderPrice.size()<1) {
			driver.findElement(By.xpath("//li[@class='a-last']")).click();
			Thread.sleep(2000);
		}
		} while(orderPrice.size()<1);

	}
	public String getthePrice(WebElement s) {
		
		String Price = s.findElement(By.xpath("//a[@class = 'a-size-base a-link-normal s-no-hover a-text-normal']/span")).getText();
		return Price;
	}
	
	//div[@class = 'a-section a-spacing-none a-spacing-top-small'][1]/following-sibling::div[2]/div[1]/a/span[1]

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

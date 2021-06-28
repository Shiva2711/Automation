package com.Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class webTables {

	WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/webtables");

		List<WebElement> heading = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));

		heading.stream().filter(s -> s.getText().contains("LastName")).map(s -> LastNameList(s)).forEach(s->System.out.println(s));

		
	}

	private List<String> LastNameList(WebElement s) {

		List<WebElement> Lastnamelist = s.findElements(
				By.xpath("parent::div/parent::div/parent::div/following-sibling::div//div[@role='gridcell'][2]"));

		List<String> k = Lastnamelist.stream().map(a -> a.getText()).collect(Collectors.toList());
		return k;
	}

	@AfterTest
	public void after() {
		driver.close();
	}

}

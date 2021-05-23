package com.Practice.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class screenshotDemo {
	WebDriver driver;

	@Test
	public void f() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\git\\RummyBaaziProject\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("C:\\Users\\rshiv\\rummyBaaziGit\\src\\test\\java\\com\\Practice\\screenshots\\screenshot.png"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

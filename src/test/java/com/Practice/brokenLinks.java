package com.Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\git\\RummyBaaziProject\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rummybaazi.com/");
	}

	@Test
	public void f() throws MalformedURLException, IOException {

		String url = driver.findElement(By.xpath("//a[@href='/withdrawal-policy']")).getAttribute("href");

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();

		int respcode = conn.getResponseCode();
		System.out.println(respcode);

	}

	@Test
	public void f1() throws MalformedURLException, IOException {

		SoftAssert s = new SoftAssert();

		List<WebElement> links = driver.findElements(By.xpath("//li/a[@href]"));

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respcode = conn.getResponseCode();
			System.out.println(respcode);

			s.assertTrue(respcode < 400, "The Link with Text " + link.getText() + " is broken with " + respcode);

		}
		s.assertAll();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}

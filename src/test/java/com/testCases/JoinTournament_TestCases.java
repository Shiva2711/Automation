package com.testCases;

import java.awt.Window;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.lobby_POF;
import com.pageFactory.login_POF;
import com.resources.base;

import okio.Timeout;

public class JoinTournament_TestCases extends base {
	public WebDriver driver;
	lobby_POF Lobby_TC;

	@BeforeTest
	public void before() throws IOException {

		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");

		login_POF Login_TC = new login_POF(driver);

		Login_TC.loginbutton();
		log.info("Clicked On Login button");

		Login_TC.loginAction(prop.getProperty("ExistingUser"), prop.getProperty("ExistingPassword"));
		log.info("Logged in to the site successfully");
	}

	@Test
	public void test() throws InterruptedException {

		Lobby_TC = new lobby_POF(driver);

		driver.get("https://preprodoptsite.rummybaazi.com//lobby/index.html?v=1621244149659#!/app/lobby");

		Thread.sleep(16000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String Lobby = it.next();
		String promotion = it.next();

		driver.switchTo().window(promotion).close();

		driver.switchTo().window(Lobby);

		Lobby_TC.tournament().click();
		

		Lobby_TC.tourname().stream().filter(s -> s.getText().contains("1K Free Entry")).map(s -> joinTour(s))
				.forEach(s -> s.click());


		Lobby_TC.register().click();

		Lobby_TC.reg_Ok().click();
		
		Lobby_TC.tourname().stream().filter(s -> s.getText().contains("1K Free Entry")).map(s -> joinTour(s))
		.forEach(s -> s.click());

		Lobby_TC.withdraw().click();

		Lobby_TC.with_Ok().click();

	}

	private WebElement joinTour(WebElement s) {

		WebElement regTour = s.findElement(By.xpath("following-sibling::div[5]"));

		return regTour;
	}
	
	@AfterTest
	public void after() {
		driver.close();
	}

}

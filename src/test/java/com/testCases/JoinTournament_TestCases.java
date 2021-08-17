package com.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.lobby_POF;
import com.pageFactory.login_POF;
import com.resources.base;

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
	public void JoinTournament() throws InterruptedException {

		Lobby_TC = new lobby_POF(driver);

		driver.get(prop.getProperty("Lobby"));
		log.info("Open Lobby URL");
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String Lobby = it.next();
		String promotion = it.next();

		driver.switchTo().window(promotion).close();
		log.info("Close Promotion Window");

		driver.switchTo().window(Lobby);
		log.info("Switch to Lobby Window");

		Lobby_TC.tournament().click();
		log.info("Click on Lobby Window");
		

		Lobby_TC.tourname().stream().filter(s -> s.getText().contains("1K Free Entry")).map(s -> joinTour(s))
				.forEach(s -> s.click());
		log.info("Search and Select 1K Free Entery Tournament");


		Lobby_TC.register().click();
		log.info("Click on Register");

		Lobby_TC.reg_Ok().click();
		log.info("Click on Register Okay button");
		
		Lobby_TC.tourname().stream().filter(s -> s.getText().contains("1K Free Entry")).map(s -> joinTour(s))
		.forEach(s -> s.click());
		log.info("Search and Select 1K Free Entery Tournament");

		Lobby_TC.withdraw().click();
		log.info("Click on Withdraw");

		Lobby_TC.with_Ok().click();
		log.info("Click on Withdraw Okay button");

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

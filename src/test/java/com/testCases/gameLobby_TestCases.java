package com.testCases;

import java.awt.Window;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.resources.base;

import okio.Timeout;

public class gameLobby_TestCases extends base {
	public WebDriver driver;

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

		driver.get("https://www.rummybaazi.com/lobby/index.html?v=1621244149659#!/app/lobby");

	    Thread.sleep(16000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String Lobby = it.next();
		//String promotion = it.next();

		//driver.switchTo().window(promotion).close();

		driver.switchTo().window(Lobby);

		WebElement hamburger = driver.findElement(By.xpath("//div[@class ='lobbymenu']"));
		hamburger.click();

		WebElement Myaccount = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'My Account')]"));
		Myaccount.click();

		driver.switchTo().window(Lobby);
		WebElement ReferandEarn = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Refer & Earn')]"));
		ReferandEarn.click();

		driver.switchTo().window(Lobby);
		WebElement ReedemCode = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Redeem Code')]"));
		ReedemCode.click();

		driver.switchTo().window(Lobby);
		WebElement MidStakeMania = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Mid Stake Mania')]"));
		MidStakeMania.click();

		driver.switchTo().window(Lobby);
		WebElement Promotion = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Promotions')]"));
		Promotion.click();

		driver.switchTo().window(Lobby);
		WebElement ChangePassword = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Change Password')]"));
		ChangePassword.click();
		
		WebElement changePasswordClose = driver.findElement(By.className("chapwd_close"));
		changePasswordClose.click();

		hamburger.click();
		WebElement InviteandEarn = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Invite to Earn')]"));
		InviteandEarn.click();

		driver.switchTo().window(Lobby);
		WebElement GameRules = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Game Rules')]"));
		GameRules.click();

		driver.switchTo().window(Lobby);
		WebElement Logout = driver
				.findElement(By.xpath("//div[@class = 'rightside_hamburgur'][contains(text(), 'Logout')]"));
		Logout.click();

		WebElement cancel = driver.findElement(By.xpath("//div[@ng-click= 'closeLogout()']"));
		cancel.click();
		
		hamburger.click();
		Logout.click();

		WebElement okay = driver.findElement(By.xpath("//div[@ng-click='logout()']"));
		okay.click();

	}
}

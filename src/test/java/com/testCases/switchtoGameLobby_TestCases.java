package com.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.gameLobby_POF;
import com.pageFactory.login_POF;
import com.resources.base;

public class switchtoGameLobby_TestCases extends base {

	gameLobby_POF gameLobby_TC;
	public WebDriver driver;

	@BeforeTest
	public void Login() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");

		login_POF Login_TC = new login_POF(driver);

		Login_TC.loginbutton();
		log.info("Clicked On Login button");

		Login_TC.loginAction(prop.getProperty("NewUser"), prop.getProperty("NPassword"));
		log.info("Logged in to the site successfully");
	}

	@Test
	public void switchToGameLobby() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		//Actions action = new Actions(driver);
		//action.moveToElement(gameLobby_TC.instantPlay()).build().perform();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("button[@class ='btn foot-instantplaybtn']")));

		gameLobby_TC.instantPlay().click();
		log.info("Clicked on the instant play");

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
	
		String siteWindow = it.next();
		String lobbyWindow = it.next();
	
		driver.switchTo().window(lobbyWindow);
		
		softAssert.assertEquals(gameLobby_TC.lobbygameinfo().getText(), "Game Information");
		log.info("Move to Lobby Window and get the text: " +gameLobby_TC.lobbygameinfo().getText());
	
	}
	
	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

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

	//@Test
	public void switchToGameLobby() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		//Actions action = new Actions(driver);
		//action.moveToElement(gameLobby_TC.instantPlay()).build().perform();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("button[@class ='btn foot-instantplaybtn']")));

		gameLobby_TC.instantPlay();
		log.info("Clicked on the instant play");

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
	
		String siteWindow = it.next();
		String lobbyWindow = it.next();
	
		driver.switchTo().window(lobbyWindow);
		
		softAssert.assertEquals(gameLobby_TC.lobbygameinfo().getText(), "Game Information");
		log.info("Move to Lobby Window and get the text: " +gameLobby_TC.lobbygameinfo().getText());
	
	}
	
	@Test
	public void gotoGameLobby() throws InterruptedException {
		driver.get("https://www.rummybaazi.com/lobby/index.html?v=1621244149659#!/app/lobby");
		
		Thread.sleep(16000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String Lobby = it.next();
		String promotion = it.next();

		driver.switchTo().window(promotion).close();
		log.info("Closed Promotion Window");

		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		
		gameLobby_TC.humburger().click();
		log.info("Click on HamburgerMenu");
		
		gameLobby_TC.MyRewards().click();
		log.info("Clicked on My Rewards");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		
		gameLobby_TC.ReferandEarn().click();
		log.info("Clicked on Refer and Earn");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		
		gameLobby_TC.ReedemCode().click();
		log.info("Clicked on Reedem Code");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		
		gameLobby_TC.MidStakeMania().click();
		log.info("Clicked on Mid Stake Mania");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		gameLobby_TC.Promotion().click();
		log.info("Clicked on Promotion");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		gameLobby_TC.changePassword();
		log.info("Clicked on Change Password");
		gameLobby_TC.changePasswordClose().click();
		log.info("Closed Changed Password Popup");
		
		gameLobby_TC.humburger().click();
		log.info("Click on HamburgerMenu");
		gameLobby_TC.InviteandEarn().click();
		log.info("Clicked on Invite and Earn");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		gameLobby_TC.GameRules().click();
		log.info("Clicked on Game Rule");
		
		driver.switchTo().window(Lobby);
		log.info("Switched to lobby window");
		gameLobby_TC.Logout();
		log.info("Clicked on Logout");
		gameLobby_TC.cancel();
		log.info("Clicked on Logout");
		
		gameLobby_TC.humburger().click();
		log.info("Click on HamburgerMenu");
		gameLobby_TC.Logout();
		log.info("Clicked on Logout");
		gameLobby_TC.okay();
		log.info("Clicked on Okay");	
		
	}
	
	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

package com.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.LobbyFilter_POF;
import com.pageFactory.lobby_POF;
import com.pageFactory.login_POF;
import com.resources.base;

public class JoinPointsCash_TestCases extends base {
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
	public void JoinPointsCash() throws InterruptedException {
		
		Lobby_TC = new lobby_POF(driver);
		
		LobbyFilter_POF LobbyFilter_TC = new LobbyFilter_POF(driver);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", Lobby_TC.instantPlay());
		log.info("Click on Instant Play");

		//driver.get(prop.getProperty("Lobby"));
		//log.info("Lobby URL Opens");
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();	

		String Site = it.next();
		String Lobby = it.next();
		String promotion = it.next();

		driver.switchTo().window(promotion).close();
		log.info("Close Promotion Window");

		driver.switchTo().window(Lobby);
		log.info("Switch to Lobby Window");
		
		LobbyFilter_TC.points().click();
		log.info("Click on Points Games");
		
		LobbyFilter_TC.highBet().click();
		log.info("Check on High Bet");
		
		LobbyFilter_TC.highBet().click();
		log.info("Uncheck on High Bet");
		
		LobbyFilter_TC.mediumBet().click();
		log.info("Check on Medium Bet");
		
		LobbyFilter_TC.mediumBet().click();
		log.info("Uncheck on Medium Bet");
		
		LobbyFilter_TC.lowBet().click();
		log.info("Check on Low Bet");
		
		LobbyFilter_TC.lowBet().click();
		log.info("Uncheck on Low Bet");

		LobbyFilter_TC.sixPlayer_Filter().click();
		log.info("Check Six Player Filter");
		
		log.info("********************Points Six Player Table Joined*****************************************************");
		joinTable(prop.getProperty("point_Sixplayer"));
		log.info("********************Points Six Player Table Left*****************************************************");
		log.info("");
		
		LobbyFilter_TC.All_Filter().click();
		log.info("Check All Player Filter");
		
		LobbyFilter_TC.twoPlayer_Filter().click();
		log.info("Check Two Player Filter");
		
		log.info("********************Points Two Player Table Joined*****************************************************");
		joinTable(prop.getProperty("point_Twoplayer"));
		log.info("********************Points Two Player Table Left*****************************************************");
		log.info("");
		

	}

	public void joinTable(String betvalue) {
		List<WebElement> table;

		do {

			List<WebElement> bets = driver.findElements(By.cssSelector(".time1.ng-binding"));

			table = bets.stream().filter(s -> s.getText().contains(betvalue)).map(s -> selectTable(s))
					.collect(Collectors.toList());

			if (table.size() < 1) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,10000");
			}
		} while (table.size() < 1);

		try {
			table.stream().forEach(s -> s.click());
			log.info("Join the Table");
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		WebElement Ok = driver.findElement(By.xpath("//div[@class='buyin-ok']"));
		Ok.click();
		log.info("Click on the BuyIn Ok button");

		Lobby_TC.avatarButton().click();
		log.info("Click on the Avatar Button");

		System.out.println(Lobby_TC.avatar().stream().count());

		try {

			Lobby_TC.avatar().stream().forEach(s -> s.click());
			log.info("Select All the Avatar");
		}

		catch (Exception e) {
			// TODO: handle exception
		}

		Lobby_TC.avatar_ok().click();
		log.info("Click Avatar Ok Button");

		Lobby_TC.reportaProblem().click();
		log.info("Click on Report a problem");

		Lobby_TC.rap_cancel();
		log.info("Cancel Report a problem");

		Lobby_TC.SettingsOpen().click();
		log.info("Open Settings");

		Lobby_TC.Sound_ONOFF().click();
		log.info("Turn OFF Sound");
		
		Lobby_TC.Sound_ONOFF().click();
		log.info("Turn ON Sound");
		
		Lobby_TC.autorebuyON();
		log.info("Auto Rebuy ON");
		
		Lobby_TC.autorebuyOFF();
		log.info("Auto Rebuy OFF");

		Lobby_TC.discardonProfile_ONOFF().click();
		log.info("Discard on Profile OFF");
		
		Lobby_TC.discardonProfile_ONOFF().click();
		log.info("Discard on Profile ON");

		Lobby_TC.Helper_ONOFF().click();
		log.info("Helper option OFF");
		
		Lobby_TC.Helper_ONOFF().click();
		log.info("Helper option ON");

		Lobby_TC.SettingsClose();
		log.info("Close the Settings");

		Lobby_TC.tablemessage().click();
		log.info("Table message opens");
		
		Lobby_TC.tablemessageClose().click();
		log.info("Table message closes");

		Lobby_TC.summaryOpen().click();
		log.info("Summary Opens");
		
		Lobby_TC.summaryClose().click();
		log.info("Summary Closes");

		Lobby_TC.emoji_button().click();
		log.info("Click on Emoji button");
		
		Lobby_TC.firstEmoji().click();
		log.info("Click on First Emoji");

		//Lobby_TC.exitTable().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", Lobby_TC.exitTable());
		log.info("Click on Exit Table");
		
		Lobby_TC.exitTable_Cancel().click();
		log.info("Cancel Exit Table");

		Lobby_TC.exitTable().click();
		log.info("Click on Exit Table");
		
		Lobby_TC.exitTable_Ok().click();
		log.info("Click Okay on Exit Table");
		
	}
	private WebElement selectTable(WebElement s) {

		WebElement Tables = s.findElement(By.xpath("following-sibling::div[6]"));

		return Tables;

	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}
}

package com.testCases;

import java.awt.Window;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.lobby_POF;
import com.pageFactory.login_POF;
import com.resources.base;

import okio.Timeout;

public class JoinTable_TestCases extends base {
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
		
		lobby_POF Lobby_TC = new lobby_POF(driver);

		driver.get(prop.getProperty("Lobby"));

		Thread.sleep(20000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String Lobby = it.next();
		String promotion = it.next();

		driver.switchTo().window(promotion).close();

		driver.switchTo().window(Lobby);
		
		//WebElement pool = driver.findElement(By.className("lobbypool2"));
		//pool.click();

		List<WebElement> bets = driver.findElements(By.cssSelector(".time1.ng-binding"));

		bets.stream().filter(s -> s.getText().contains("0.05")).map(s -> joinTable(s)).forEach(s->s.click());
		
		WebElement Ok = driver.findElement(By.xpath("//div[@class='buyin-ok']"));
		Ok.click();
		
		Lobby_TC.avatarButton().click();
		
		System.out.println(Lobby_TC.avatar().stream().count());
		
		try {
			
		Lobby_TC.avatar().stream().forEach(s->s.click());
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Lobby_TC.avatar_ok().click();
		
		Lobby_TC.reportaProblem().click();
		
		Lobby_TC.rap_cancel();
		
		Lobby_TC.SettingsOpen().click();
		
		Lobby_TC.Sound_ONOFF().click();
		Lobby_TC.Sound_ONOFF().click();
		
		Lobby_TC.autorebuyON().click();
		Lobby_TC.autorebuyOFF().click();
		
		Lobby_TC.discardonProfile_ONOFF().click();
		Lobby_TC.discardonProfile_ONOFF().click();
		
		Lobby_TC.Helper_ONOFF().click();
		Lobby_TC.Helper_ONOFF().click();
		
		Lobby_TC.SettingsClose();
		
		Lobby_TC.tablemessage().click();
		Lobby_TC.tablemessageClose().click();
		
		Lobby_TC.summaryOpen().click();
		Lobby_TC.summaryClose().click();
		
		Lobby_TC.emoji_button().click();
		Lobby_TC.firstEmoji().click();
		
		Lobby_TC.exitTable().click();
		Lobby_TC.exitTable_Cancel().click();
		
		Lobby_TC.exitTable().click();
		Lobby_TC.exitTable_Ok().click();
			
	}

	private WebElement joinTable(WebElement s) {

		WebElement Tables = s.findElement(By.xpath("following-sibling::div[6]"));
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0, 2000)");
		 */

		return Tables;

	}
}

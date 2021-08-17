package com.Practice.screenshots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadFileRobot {

	//@Test
	public void f() throws AWTException {
		Robot robot = new Robot();

		StringSelection str = new StringSelection(System.getProperty("user.dir") + "\\data\\Data.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test
	public void f1() throws AWTException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		Robot robot = new Robot();
		
		
			Actions action = new Actions(driver);
			
	
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		
		driver.get("https://www.snapdeal.com/");
		
		List<WebElement> footerlink = driver.findElements(By.xpath("//a[@class='underLineOnHover']"));
		
		 
		footerlink.stream().forEach(s->action.contextClick(s).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).build().perform());
	}

}

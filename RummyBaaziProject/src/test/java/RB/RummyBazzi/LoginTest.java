package RB.RummyBazzi;

import java.sql.Driver;
//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LoginTest {

	public WebDriver driver;

	@BeforeMethod
	public void Login1() throws InterruptedException {

		// public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\sarath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\RB\\RummyBazzi\\files\\chromedriver.exe");
		// E:\Chromedriver_win32
		// C:\Users\sarath\Downloads\chromedriver_win32
		// System.setProperty("webdriver.chrome.driver","D:\\Chromedrive_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.rummybaazi.com");
		// driver.get("https://preprodoptsite.rummybaazi.com");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.id("getusername")).click();
		driver.findElement(By.id("getpassword")).click();
		driver.findElement(By.id("loginSubmit")).click();

		// Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Tester6015");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginSubmit")).click();
		Thread.sleep(5000);

		// System.setProperty("webdriver.chrome.driver","https://www.rummybaazi.com/my-account");
		// System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// driver.findElement(By.id("instantplay")).click();

		// Thread.sleep(5000);
		// driver.findElement(By.className("{'active':hamburgerMenuShow==true}")).click();
		// driver.findElement(By.linkText("My Account")).click();

		// openHamburgerMenu($event);

		// driver.findElement(By.className("lgout")).click(); My Account

	}
}
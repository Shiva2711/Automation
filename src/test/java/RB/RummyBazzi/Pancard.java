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
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class Pancard {
	private static String total;
@Test
public void test() throws InterruptedException 
{
//public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sarath\\Downloads\\chromedriver_win32\\chromedriver.exe");


//	C:\Users\sarath\Downloads\chromedriver_win32
//System.setProperty("webdriver.chrome.driver","D:\\Chromedrive_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//driver.get("https://www.rummybaazi.com");
driver.get("https://www.rummybaazi.com");
driver.findElement(By.className("loginbtn")).click();
driver.findElement(By.id("getusername")).click();
driver.findElement(By.id("getpassword")).click();
driver.findElement(By.id("loginSubmit")).click();

//Thread.sleep(1000);s
driver.findElement(By.name("username")).sendKeys("sitered"); 
driver.findElement(By.name("password")).sendKeys("test1234");	
driver.findElement(By.id("loginSubmit")).click();
System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
//System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


//driver.findElement(By.linkText("My Profile")).click();

driver.findElement(By.linkText("Profile")).click();
driver.findElement(By.linkText("KYC")).click();

driver.findElement(By.name("aadhaarnumber")).sendKeys("511498108178");
WebElement fileInput = driver.findElement(By.name("aadhaarfront"));
fileInput.sendKeys("C:\\Users\\sarath\\Pictures\\gunda.png");
WebElement fileInput1 = driver.findElement(By.name("aadhaarback"));
fileInput1.sendKeys("C:\\Users\\sarath\\Pictures\\gunda.png");
driver.findElement(By.id("submitAadhaarProof")).click();



}

}

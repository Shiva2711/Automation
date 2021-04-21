/**
 * 
 */
package RB.RummyBazzi;
import java.sql.Driver;
//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Signup {
	private static String total;
	@Test
	public void test() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Chromedrive_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://preprodoptsite.rummybaazi.com");
		driver.findElement(By.className("regbtn")).click();
		//driver.findElement(By.linkText("registartionForm")).click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(1000);
	
		driver.findElement(By.id("rusername")).sendKeys("tester3023"); 
		driver.findElement(By.id("rpassword")).sendKeys("Test@123");
		Thread.sleep(1000);
		driver.findElement(By.id("remailid")).sendKeys("Tester3023@digient.in");
		driver.findElement(By.id("rcontactno")).sendKeys("9176031922");
		Thread.sleep(1000);
		driver.findElement(By.id("resent_text")).click();
		driver.findElement(By.id("otpverify")).click();
		
		driver.findElement(By.id("registartionSubmit")).click();
		System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
		//registartionSubmit
		//otpverify
		
		//driver.findElement(By.linkText("Sent OTP")).click();
		//resent_text
		
		 //Sent OTP
		
		//inputverifyotp
		

    }
}
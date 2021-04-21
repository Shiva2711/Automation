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
public class Mobilevalidforgot {
	 private static String total;
	    @Test
	    public void test() throws InterruptedException 
	    {
	//public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarath\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver","D:\\Chromedrive_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://preprodoptsite.rummybaazi.com");
			driver.findElement(By.id("testLogin")).click();

	
		
			driver.findElement(By.linkText("Forgot Password")).click();
			driver.findElement(By.id("forogotpwdSubmit")).click();	
			//This field required  
			Thread.sleep(1000);
			driver.findElement(By.name("femailID")).sendKeys("dfdfdsfdfdf");  
			driver.findElement(By.id("forogotpwdSubmit")).click();
			// (please enter valid email address ")
			Thread.sleep(1000);
			driver.findElement(By.name("femailID")).sendKeys("sarath33.digient@yahoo.com");  
			driver.findElement(By.id("forogotpwdSubmit")).click();	
			//email id does not exist 
	    }
}

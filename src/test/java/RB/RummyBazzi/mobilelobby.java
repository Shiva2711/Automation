
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

	import org.testng.annotations.Test;

public class mobilelobby {
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
		driver.get("https://preprodoptsite.rummybaazi.com/mobile/index.html#!/app/lobby");
		
		
		driver.findElement(By.id("signupUsername")).sendKeys("simons");
		driver.findElement(By.id("signupPassword")).sendKeys("test1234");
		driver.findElement(By.id("signupEmailID")).sendKeys("simon@digient.in");
		driver.findElement(By.id("signupMobileNumber")).sendKeys("9176031922");
		driver.findElement(By.id("resend_otp_btn")).click();
	    }
	
}

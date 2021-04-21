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
public class Pageredirection {
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
			driver.get("https://preprodoptsite.rummybaazi.com");
			driver.findElement(By.className("loginbtn")).click();
			driver.findElement(By.id("getusername")).click();
			driver.findElement(By.id("getpassword")).click();
			driver.findElement(By.id("loginSubmit")).click();
			
			//Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("rbuser1009"); 
			driver.findElement(By.name("password")).sendKeys("Test@123");	
			driver.findElement(By.id("loginSubmit")).click();
			Thread.sleep(5000);
			//System.setProperty("webdriver.chrome.driver","https://www.rummybaazi.com/my-account");
			System.setProperty("webdriver.chrome.driver","https://preprodoptsite.rummybaazi.com/my-account");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
		    driver.findElement(By.linkText("Bonuses")).click();
		    driver.findElement(By.linkText("Tourney Tickets")).click();
		    Thread.sleep(1000);
			//driver.findElement(By.partialLinkText("Profile"));
		    driver.findElement(By.linkText("Profile")).click();
			driver.findElement(By.linkText("KYC")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Refer a Friend")).click();
			driver.findElement(By.linkText("Change Password")).click();
			
			//Deposit /withdrawal page 
			driver.findElement(By.linkText("Deposit")).click();
			
			// kyc approved stauts  it will redirection withdrawal page otherwise it will point out to kyc page"
		    driver.findElement(By.linkText("Withdrawal")).click();
			driver.findElement(By.linkText("Rewards")).click();
	        Thread.sleep(1000);
			driver.findElement(By.linkText("Transactions")).click();
			driver.findElement(By.linkText("Purchase Summary")).click();
			driver.findElement(By.linkText("Withdraw Summary")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.linkText("TDS Summary")).click();
			driver.findElement(By.linkText("RAF Bonus Summary")).click();
			
			Thread.sleep(1000);
		    driver.findElement(By.linkText("Bonus")).click();
			driver.findElement(By.linkText("History")).click();
			driver.findElement(By.linkText("Tournament History")).click();
			
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("How To Play")).click();
			//driver.findElement(By.linkText("Monthly Promotions")).click();
			
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("Rummy Tutorial")).click();
			//driver.findElement(By.linkText("Basic Rules of Rummy")).click();
			//driver.findElement(By.linkText("Online Rummy Skills")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("Download & Play")).click();
			
			
			//driver.findElement(By.linkText("Sitemap")).click();
			//driver.findElement(By.linkText("FAQ")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("Legality")).click();
			//driver.findElement(By.linkText("Terms of Use")).click();
			
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("Privacy Policy")).click();
			//driver.findElement(By.linkText("Withdrawal Policy")).click();
			
			//driver.findElement(By.linkText("Responsible Gaming")).click();
			//driver.findElement(By.linkText("Rewards")).click();
			////driver.findElement(By.linkText("About Us")).click();
			//driver.findElement(By.linkText("Blog")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.linkText("Contact Us")).click();
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//driver.findElement(By.id("instantplay")).click();
			//driver.findElement(By.className("lobbypool1 act_101")).click();
			//driver.findElement(By.linkText("Tournaments")).click();
			
			
			//driver.findElement(By.className("lobbypool1")).click();
			//driver.findElement(By.linkText("201 Pool")).click();
			//driver.findElement(By.linkText("Best of X")).click();
			//driver.findElement(By.linkText("Tournaments")).click();
			//driver.findElement(By.linkText("Practice")).click();
			//driver.findElement(By.linkText("Private Table")).click();
	       
	    
			
		
			//Tournaments
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//driver.findElement(By.id("lobbybtn1")).click();
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    //sdriver.findElement(By.id("buyin-ok-btn")).click();
			//System.out.println("Executed successfully");
			
			//WebElement element= driver.findElement(By.id("lobbybtn1"));
			//JavascriptExecutor executor = (JavascriptExecutor) driver;
			//executor.executeScript("arguments[0].click();", element);
			
			//List<WebElement> tables = driver.findElements(By.xpath("//div[@class='join_in']']"));
			//for (int i = 0; i < tables.size();) {
			
			//if (total.contains("lobbybtn1") {
					//driver.findElements(By.xpath("//button[@class='table-play-button btn btn-primary ng-binding']")).get(i).click();
							//break;
							//}
			
			//}
			
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//List<WebElement> lobbby=driver.findElements(By.id("lobbybtn1"));
			 //int size=lobbby.size();
		        
		        //System.out.print(size);
			//driver.findElement(By.className("lobbyinnerjoin")).click();
			//System.out.println("Executed successfully");
			
			 //List<webelement> signUpForm=driver.findElements(By.className("lobbyinnerjoin"));
			
			
			//Set<String> handlesSet = driver.getWindowHandles();
			//List<String> handlesList = new ArrayList<String>(handlesSet);
			//driver.switchTo().window(handlesList.get(1));
			
		
			driver.findElement(By.className("lgout")).click();		
			
		}
	}


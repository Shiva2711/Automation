package makemyTrip;

import org.testng.annotations.Test;

import com.Datadriven.DDpractise;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class makemyTrip {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	DataDriven data = new DataDriven();

	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
	}

	@Test
	public void f() throws InterruptedException, IOException {
		ArrayList<String> a =data.getData("FromCity");
		a.stream().forEach(s->System.out.println("From Cities: "+s));
		wait = new WebDriverWait(driver, 10);

		WebElement close = driver.findElement(By.className("langCardClose"));
		wait.until(ExpectedConditions.visibilityOf(close));
		close.click();

		WebElement loginTab = driver
				.findElement(By.xpath("//li[@class ='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']"));
		loginTab.click();

		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		from.click();

		WebElement fromcity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromcity.sendKeys(a.get(0));
		Thread.sleep(3000);
		fromcity.sendKeys(Keys.ARROW_DOWN);
		fromcity.sendKeys(Keys.ENTER);

		WebElement source = driver.findElement(By.xpath("//span[@class='truncate airPortName ']"));
		System.out.println(source.getText());

		// WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
		WebElement tocity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		tocity.sendKeys(data.getData("ToCity").get(0));
		Thread.sleep(3000);
		tocity.sendKeys(Keys.ARROW_DOWN);
		tocity.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.xpath("//span[@class='truncate airPortName ']"));
		System.out.println(destination.getText());

		Thread.sleep(3000);
		
		List<WebElement> cities = driver.findElements(By.xpath("//p[@class='code makeRelative']"));

		
		
		/*
		 * System.out.println("From City Code: " +fromcityCode);
		 * System.out.println("To City Code: " +tocityCode);
		 */

		for (int i = 0; i < cities.size(); i++) {
			String fromcityCode = cities.get(i).getText().split(",")[0];
			String tocityCode = cities.get(i+1).getText().split(",")[0];

			if (fromcityCode.contains("SYD")
					&& tocityCode.contains("BLR")) {
				/*
				 * WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
				 * wait.until(ExpectedConditions.visibilityOf(search));
				 * js.executeScript("arguments[0].click();", search); Thread.sleep(3000);
				 */
				
			}
			break;

		}

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

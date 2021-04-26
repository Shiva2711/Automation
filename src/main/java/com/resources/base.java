package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

public class base {
	public WebDriver driver;
	public Properties prop;
	public static Logger log = LogManager.getLogger(base.class.getName());
	public DesiredCapabilities dc;
	public SoftAssert softAssert = new SoftAssert();

	public WebDriver intializeDriver() throws IOException {

		dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rshiv\\rummyBaaziGit\\src\\main\\java\\com\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		log.info(browserName);

		String drivername = prop.getProperty("driver");
		log.info(drivername);

		if (browserName.equals("chrome") && drivername.equals("hub")) {
			dc.setBrowserName("chrome");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		}

		else if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox") && drivername.equals("hub")) {
			dc.setBrowserName("firefox");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("edge") && drivername.equals("hub")) {
			dc.setBrowserName("edge");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		}

		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public String getSceenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		// String destinationFile
		// ="C:\\Users\\kkr26\\Documents\\MavenDemoTest2\\src\\main\\java\\resource"+testCaseName+
		// ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

		// File screenshotFile = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.FILE);
		// * String screenshotBase64 = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.BASE64);

	}

}

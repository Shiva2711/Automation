package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SSLCertDemo {
  @Test
  public void f() {
	  
	  DesiredCapabilities ch = DesiredCapabilities.chrome();
	  ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	  ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	  
	  ChromeOptions c = new ChromeOptions();
	  c.merge(ch);
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\rummyBaaziGit\\lib\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(c);
	  
	  driver.get("");
	  
  }
}

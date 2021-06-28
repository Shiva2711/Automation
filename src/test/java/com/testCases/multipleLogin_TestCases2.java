package com.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.resources.base;
import com.test.utility.TestUtils;

import org.openqa.selenium.WebDriver;

public class multipleLogin_TestCases2 extends base {
	login_POF Login_TC;
	public WebDriver driver;

	@Test(dataProvider = "getData")
	public void MultiLoginAction(String userType, String username, String password) throws IOException {

		driver = intializeDriver();

		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");

		Login_TC = new login_POF(driver);

		Login_TC.loginbutton();
		log.info("Clicked on loginbuton");

		Login_TC.loginAction(username, password);
		log.info("Entered Credentials");

		log.info("Login Successful");

		log.info(userType);
		driver.quit();
	}

	@DataProvider
	public static Iterator<Object[]> getData() throws IOException {

		ArrayList<Object[]> b = TestUtils.getDataFromExcel();
		return b.iterator();
	}

	@AfterTest()
	public void teardown() {
		driver.quit();
	}

}

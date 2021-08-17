package com.pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class withdrawal_POF {

	SoftAssert softAssert = new SoftAssert();
	JavascriptExecutor jse;

	public withdrawal_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		jse= (JavascriptExecutor)driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Withdrawal") //// li[@class ='p-2 pr-3 withdrawal_submenu_color']
	private WebElement Withdrawal;

	@FindBy(how = How.ID, using = "withdrawAmount")
	private WebElement withdrawAmount;

	@FindBy(how = How.ID, using = "withdrawAmount-error")
	private WebElement withdrawAmounterror;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;

	public void clickWithdrwal() {
		Withdrawal.click();
	}

	public void emptyAmount() {
		jse.executeScript("arguments[0].click();", continueButton);
		//continueButton.click();
		softAssert.assertEquals(withdrawAmounterror.getText(), "Enter your amount");
	}

	public void maxAmountValidation() {
		withdrawAmount.sendKeys("9999999");
		jse.executeScript("arguments[0].click();", continueButton);
		softAssert.assertEquals(withdrawAmounterror.getText(), "Enter the Amount less than 30000");
	}

	public void insufficentbalanceAlert() {
		withdrawAmount.sendKeys("29999");
		jse.executeScript("arguments[0].click();", continueButton);
		softAssert.assertEquals(withdrawAmounterror.getText(), "You do not have sufficient Withdrawable balance.");
	}

	public void clearAmount() {
		withdrawAmount.clear();
	}

	public void validAmountWithdraw(String withdrawAmount) {

		this.withdrawAmount.sendKeys(withdrawAmount);
		// continueButton.click();
	}

	public void softAssertAll() {
		softAssert.assertAll();
	}

}

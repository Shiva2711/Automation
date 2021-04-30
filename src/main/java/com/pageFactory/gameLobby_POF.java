package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class gameLobby_POF {

	public gameLobby_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "#instantplay")
	private WebElement instantPlay;
	
	@FindBy(how = How.CLASS_NAME, using = "lobbygameinfo")
	private WebElement lobbygameinfo;

	public WebElement instantPlay() {
		return instantPlay;
	}
	
	public WebElement lobbygameinfo() {
		return lobbygameinfo;
		
	}

}

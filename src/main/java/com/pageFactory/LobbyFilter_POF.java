package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LobbyFilter_POF {
	
	public LobbyFilter_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//label[@for='cashplay1']")
	private WebElement sixPlayer_Filter;

	@FindBy(how = How.XPATH, using = "//label[@for='cashplay0']")
	private WebElement twoPlayer_Filter;

	@FindBy(how = How.XPATH, using = "//label[@for='cashall']")
	private WebElement All_Filter;

	@FindBy(how = How.XPATH, using = "//label[@for='cashbet0']")
	private WebElement lowBet;

	@FindBy(how = How.XPATH, using = "//label[@for='cashbet1']")
	private WebElement mediumBet;
	
	@FindBy(how = How.XPATH, using = "//label[@for='cashbet2']")
	private WebElement highBet;
	
	@FindBy(how = How.CSS, using = ".lobbypoints.points_act")
	private WebElement points;
	
	@FindBy(how = How.CLASS_NAME, using = "lobbypool")
	private WebElement pools;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Deals']")
	private WebElement deals;
	
	//@FindBy(how = How.CLASS_NAME, using = "lobbypool2")
	//private WebElement deals;
	
	@FindBy(how = How.CLASS_NAME, using = "lobbypool3")
	private WebElement oneshots;
	
	
	@FindBy(how = How.CSS, using = ".lobbyrupee.prac_nor")
	private WebElement practice;
	
	
	public WebElement sixPlayer_Filter() {
		return sixPlayer_Filter;
	}
	
	public WebElement twoPlayer_Filter() {
		return twoPlayer_Filter;
	}
	
	public WebElement All_Filter() {
		return All_Filter;
	}
	
	public WebElement lowBet() {
		return lowBet;
	}
	
	public WebElement mediumBet() {
		return mediumBet;
	}
	
	public WebElement highBet() {
		return highBet;
	}
	
	public WebElement points() {
		return points;
	}
	
	public WebElement pools() {
		return pools;
	}
	
	
	public WebElement deals() {
		return deals;
	}
	
	public WebElement oneshots() {
		return oneshots;
	}
	
	public WebElement practice() {
		return practice;
	}
	
	
}

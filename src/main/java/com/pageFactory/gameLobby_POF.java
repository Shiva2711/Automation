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

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]") //div/button[contains(text(), ' Instant Play')]
	private WebElement instantPlay;
	
	@FindBy(how = How.XPATH, using = "//div[@class ='lobbymenu")
	private WebElement hamburger;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'My Account')]")
	private WebElement MyRewards;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Refer & Earn')]")
	private WebElement ReferandEarn;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Redeem Code')]")
	private WebElement ReedemCode;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Mid Stake Mania')]")
	private WebElement MidStakeMania;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Promotions')]")
	private WebElement Promotion;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Change Password')]")
	private WebElement changePassword;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Invite to Earn')]")
	private WebElement InviteandEarn;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Game Rules')]")
	private WebElement GameRules;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'Logout')]")
	private WebElement Logout;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'rightside_hamburgur'][contains(text(), 'My Account')]")
	private WebElement lobbygameinfo;
	
	@FindBy(how = How.CLASS_NAME, using = "chapwd_close")
	private WebElement changePasswordClose;
	
	@FindBy(how = How.XPATH, using = "//div[@ng-click= 'closeLogout()']")
	private WebElement cancel;
	
	@FindBy(how = How.XPATH, using = "//div[@ng-click='logout()']")
	private WebElement okay;

	public void instantPlay() {
		 instantPlay.click();;
	}
	
	public WebElement lobbygameinfo() {
		return lobbygameinfo;
		
	}
	
	public WebElement humburger() {
		return hamburger;
		
	}
	
	public WebElement MyRewards() {
		return MyRewards;
		
	}
	
	public WebElement ReferandEarn() {
		return ReferandEarn;
		
	}
	
	public WebElement ReedemCode() {
		return ReedemCode;
		
	}
	
	public WebElement MidStakeMania() {
		return MidStakeMania;
		
	}
	
	public WebElement Promotion() {
		return Promotion;
		
	}
	
	public WebElement changePassword() {
		return changePassword;
		
	}
	
	public WebElement changePasswordClose() {
		return changePasswordClose;
		
	}
	
	
	public WebElement InviteandEarn() {
		return InviteandEarn;
		
	}
	
	public WebElement GameRules() {
		return GameRules;
		
	}
	
	public WebElement Logout() {
		return Logout;
		
	}
	
	public WebElement cancel() {
		return cancel;
		
	}
	
	public WebElement okay() {
		return okay;
		
	}
	


}

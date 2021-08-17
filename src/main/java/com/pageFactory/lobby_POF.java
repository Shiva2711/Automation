package com.pageFactory;

import java.util.List;

import org.apache.pdfbox.contentstream.operator.text.SetWordSpacing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class lobby_POF {
	
	public lobby_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//span[@class='buyin-take-input']/input[@id='buyin-amount']")
	private WebElement editChips;
	
	@FindBy(how = How.XPATH, using ="//div[@class='lobbyrupee tour_nor']")
	private WebElement tournament;
	
	@FindBy(how = How.XPATH, using ="//div[@class='logoutbtncont ng-scope']/div[1]")
	private WebElement register;
	
	@FindBy(how = How.XPATH, using ="//div[@class='logoutyesBtn']")
	private WebElement reg_Ok;
	
	@FindBy(how = How.XPATH, using ="//div[@class='logoutbtncont ng-scope']/div[1]")
	private WebElement withdraw;
	
	@FindBy(how = How.XPATH, using ="//div[@class='logoutyesBtn']")
	private WebElement with_Ok;

	@FindBy(how =How.XPATH, using ="//div[@class='re-buy1 ng-binding']")
	private List<WebElement> tourName;
	
	@FindBy(how =How.XPATH, using ="//div[@class='avatar_high']")
	private List<WebElement> avatar;
	
	@FindBy(how = How.XPATH, using ="//div[@id='avatarButton']")
	private WebElement avatarButton;
	
	@FindBy(how = How.XPATH, using ="//div[@class='avatar_ok']")
	private WebElement avatar_ok;
	
	@FindBy(how = How.XPATH, using ="//div[@class='topMenu one']")
	private WebElement reportaProblem;
	
	@FindBy(how = How.XPATH, using ="//div[@class='rap_cancel']")
	private WebElement rap_cancel;
	
	@FindBy(how = How.CSS, using =".topMenu.second")
	private WebElement SettingsOpen;
	
	@FindBy(how = How.CLASS_NAME, using ="topMenu second active")
	private WebElement SettingsClose;
	
	@FindBy(how = How.ID, using ="setsoundon_1")
	private WebElement Sound_ONOFF;
	
	@FindBy(how = How.XPATH, using ="//div[@class='settings rebuy-off']")
	private WebElement autorebuyON;
	
	@FindBy(how = How.XPATH, using ="//div[@class='settings rebuy-on']")
	private WebElement autorebuyOFF;
	
	@FindBy(how = How.ID, using ="setshowon_1")
	private WebElement discardonProfile_ONOFF;
	
	@FindBy(how = How.XPATH, using ="//input[@name='Helper']")
	private List<WebElement> Helper_ONOFF;
	
	@FindBy(how = How.XPATH, using ="//div[@id='outside_tblmsg']")
	private WebElement tablemessage;
	
	@FindBy(how = How.XPATH, using ="//div[@class='tblmes_close']")
	private WebElement tablemessageClose;
	
	@FindBy(how = How.XPATH, using ="//div[@class='discard_button']")
	private WebElement summaryOpen;
	
	@FindBy(how = How.XPATH, using ="//div[@class='discardsActive']")
	private WebElement summaryClose;
	
	@FindBy(how = How.XPATH, using ="//div[@class='emoji_button']")
	private WebElement emoji_button;
	
	@FindBy(how = How.XPATH, using ="//div[@class='emoji_high']")
	private WebElement firstEmoji;
	
	@FindBy(how = How.ID, using ="leaveButton_1")
	private WebElement exitTable;
	
	@FindBy(how = How.XPATH, using ="//div[@id='CommonErrorcancelButtonWithOk']")
	private WebElement exitTable_Cancel;
	
	@FindBy(how = How.XPATH, using ="//div[@id='CommonErrorokButtonWithCancel']")
	private WebElement exitTable_Ok;
	
	@FindBy(how = How.XPATH, using ="//button[@id='instantplay']")
	private WebElement instantPlay;
	
	
	public WebElement editChips() {
		return editChips;
	}
	
	public WebElement tournament() {
		return tournament;
	}
	
	public WebElement register() {
		return register;
	}
	
	public WebElement reg_Ok() {
		return reg_Ok;
	}
	
	public WebElement withdraw() {
		return withdraw;
	}
	
	public WebElement with_Ok() {
		return with_Ok;
	}
	
	public List<WebElement> tourname() {
		return tourName;
	}
	
	public List<WebElement> avatar() {
		return avatar;
	}
	
	public WebElement avatarButton() {
		return avatarButton;
	}
	
	public WebElement avatar_ok() {
		return avatar_ok;
	}
	
	public WebElement reportaProblem() {
		return reportaProblem;
	}
	
	public WebElement rap_cancel() {
		return rap_cancel;
	}
	
	public WebElement SettingsOpen() {
		return SettingsOpen;
	}
	
	public WebElement SettingsClose() {
		return SettingsClose;
	}
	
	
	public WebElement Sound_ONOFF() {
		return Sound_ONOFF;
	}
	
	public WebElement autorebuyON() {
		return autorebuyON;
	}
	
	public WebElement autorebuyOFF() {
		return autorebuyOFF;
	}
	
	public WebElement discardonProfile_ONOFF() {
		return discardonProfile_ONOFF;
	}
	
	public WebElement Helper_ONOFF() {
		return Helper_ONOFF.get(0);
	}
	
	public WebElement tablemessage() {
		return tablemessage;
	}
	
	public WebElement tablemessageClose() {
		return tablemessageClose;
	}
	
	public WebElement summaryOpen() {
		return summaryOpen;
	}
	
	public WebElement summaryClose() {
		return summaryClose;
	}
	
	public WebElement emoji_button() {
		return emoji_button;
	}
	
	public WebElement firstEmoji() {
		return firstEmoji;
	}
	
	public WebElement exitTable() {
		return exitTable;
	}
	
	public WebElement exitTable_Cancel() {
		return exitTable_Cancel;
	}
	
	public WebElement exitTable_Ok() {
		return exitTable_Ok;
	}
	
	public WebElement instantPlay() {
		return instantPlay;
	}
}

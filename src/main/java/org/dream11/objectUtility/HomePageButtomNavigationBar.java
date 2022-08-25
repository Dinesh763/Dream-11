package org.dream11.objectUtility;

import org.dream11.genericUtility.ThreadLocalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageButtomNavigationBar {
	
	 public HomePageButtomNavigationBar() {
		  PageFactory.initElements(ThreadLocalClass.getDriver(), this);
	  }

	@FindBy(xpath="//android.widget.FrameLayout[@content-desc='My Matches']/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement myMatchesBtn;

	@FindBy(xpath="(//android.widget.TextView[@text='My Matches'])[1]")
	private WebElement myMatchesTitle;

	@FindBy(xpath="//android.widget.FrameLayout[@content-desc='Winners']/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement winnersBtn;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Winners' ])[1]")
	private WebElement winnersTitle;
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc='Chat']")
	private WebElement chatBtn;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Chat' ])[1]")
	private WebElement chatTitle;
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc='Rewards']")
	private WebElement rewardsBtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='DreamRuns Balance' ]")
	private WebElement dreamRunsBalance;

 
public void clickMyMatchesBtn() {
	myMatchesBtn.click();
}

public  String getMyMatchesTitle() {
	return myMatchesTitle.getText();
}

public void clickWinnersBtn() {
	winnersBtn.click();
}

public  String getWinnersTitle() {
	return winnersTitle.getText();
}

public void clickChatBtn() {
 chatBtn.click();
}

public  String getChatTitle() {
	return chatTitle.getText();
}

public void clickRewardsBtn() {
	rewardsBtn.click();
}

public  String getDreamRunsBalance() {
	return dreamRunsBalance.getText();
}

}

package org.dream11.objectUtility;

import org.dream11.genericUtility.ThreadLocalClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageContentOfMatchCard {
	
	public HomePageContentOfMatchCard() {
		PageFactory.initElements(ThreadLocalClass.getDriver(), this);
	}

	@FindBy(xpath="//android.widget.ImageView[@content-desc='Match_Card_1_Flag_1']")
	private WebElement team1Flag;

	@FindBy(xpath="//android.widget.ImageView[@content-desc='Match_Card_1_Flag_2']")
	private WebElement team2Flag;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc='Match_Card_1']/android.widget.TextView[1]")
	private WebElement tourName;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc='Match_Card_1']/android.widget.ImageView[1]")
	private WebElement bellIcon;

	@FindBy(xpath="//android.widget.TextView[@text='Set Reminders']")
	private WebElement reminderTitle;

	@FindBy(xpath="//android.widget.ImageView[@bounds='[55,1770][92,1807]']")
	private WebElement crossBtn;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc='Match_Card_1']/android.widget.ImageView[4]")
	private WebElement streamingIcon;


	public String getTeam1Flag(String attributeName) {
		return team1Flag.getAttribute(attributeName);
	}

	public String getTeam2Flag(String attributeName) {
		return team2Flag.getAttribute(attributeName);
	}

	public String getTourName() {
		return tourName.getText();
	}


	public void clickBellIconAction() {
		bellIcon.click();
	}

	public String getReminder() {
		return reminderTitle.getText();
	}

	public void clickCrossBtnAction() {
		crossBtn.click();
	}

	public void clickStreamingIcon() {
		streamingIcon.click();
	}
	private String teamName="//android.widget.TextView[@text='%s']";
	public  WebElement convertStringToXpath(String partialElementXpath,String replaceData) {
		String xpath = String.format(partialElementXpath, replaceData);
		return ThreadLocalClass.getDriver().findElement(By.xpath(xpath));		
	}

	public String getTeamName(String expectTeamName) {
		return convertStringToXpath(teamName, expectTeamName).getText();
	}
}

package org.tyss.dream11;

import org.dream11.genericUtility.BaseClass;
import org.dream11.objectUtility.HomePageButtomNavigationBar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyBottonNavigationbarOnHomeTest extends  BaseClass {
	@Test
	public void verifyBottonNavigationbarOnHomeTest() {
		
		HomePageButtomNavigationBar homePageNavigationBar=new HomePageButtomNavigationBar();
		androidDriverUtility.implicitlyWait(longTimeouts);
		homePageNavigationBar.clickMyMatchesBtn();
		String actualMyMatchesPageTitle = homePageNavigationBar.getMyMatchesTitle();
		homePageNavigationBar.clickWinnersBtn();
		String actualWinnerPageTitle = homePageNavigationBar.getWinnersTitle();
		homePageNavigationBar.clickChatBtn();
		String actualChatPageTitle = homePageNavigationBar.getChatTitle();
		homePageNavigationBar.clickRewardsBtn();
		String actualRewardBalanceTitle = homePageNavigationBar.getDreamRunsBalance();
		String sheetName="dream11";
		String expectedMyMatchesPageTitle = excelUtility.getDataFromExcel(sheetName,7,1);
		String expectedWinnerPageTitle = excelUtility.getDataFromExcel(sheetName,8,1);
		String expectedChatPageTitle = excelUtility.getDataFromExcel(sheetName,9,1);
		String expectedRewardBalanceTitle = excelUtility.getDataFromExcel(sheetName,10,1);
		Assert.assertEquals(expectedMyMatchesPageTitle, actualMyMatchesPageTitle);
		Assert.assertEquals(expectedWinnerPageTitle, actualWinnerPageTitle);
		Assert.assertEquals(expectedChatPageTitle, actualChatPageTitle);
		Assert.assertEquals(expectedRewardBalanceTitle, actualRewardBalanceTitle);

	}
}

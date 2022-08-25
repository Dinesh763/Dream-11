package org.dream11.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
/**
 * This class contains Android driver reusable methods
 * @author Dinesh
 *
 */
public class MobileDriverUtility {
	public AndroidDriver driver=ThreadLocalClass.getDriver();

	
	
	public void tabAction(int finger,int x,int y,int durationInMiliSec) {
		driver.tap(finger,x,y, durationInMiliSec);
	}
	public void hideKeyboard() {
		driver.hideKeyboard();
	}

	public void lanchApp() {
		driver.launchApp();
	}
	public void closeApp() {
		driver.closeApp();
	}
	public void installApp(String apkPath) {
		driver.installApp(apkPath);
	}
	public void uninstallApp(String appBundleId) {
		driver.removeApp(appBundleId);
	}
	
	public void dragAndDropAction(MobileElement src,MobileElement dest) {
		TouchAction action=new TouchAction(driver);
		action.longPress(src).waitAction().moveTo(dest).release().perform();
	}
	public String getToastMessage(String attributeName ) {
		return driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("attributeName");
	}
	
	public void swipeAction(int startX,int startY,int endX,int endY,int duration) {
		driver.swipe(startX,startY,endX,endY,duration);
	}
	public void scrollTillElement(String attributeName,String attributeValue) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+attributeValue+"\"))");
	}
	
	public void openNotification() {
		driver.openNotifications();
	}
	public void implicitlyWait(long longTime) {
	ThreadLocalClass.getDriver().manage().timeouts().implicitlyWait(longTime, TimeUnit.SECONDS);
	}
	
}

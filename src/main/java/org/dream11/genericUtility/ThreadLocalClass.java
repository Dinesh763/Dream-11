package org.dream11.genericUtility;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
/**
 * This class contains getter and setters of instances
 * @author Dinesh
 *
 */
public class ThreadLocalClass {
	private static ThreadLocal<AndroidDriver> driver=new ThreadLocal<>();
    private static ThreadLocal<MobileDriverUtility> androidDriverUtility=new ThreadLocal<>();
	public static  AndroidDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(AndroidDriver actualdriver) {
		driver.set(actualdriver);
	}

	public static MobileDriverUtility getAndroidDriverUtility() {
		return androidDriverUtility.get();
	}

	public static void setAndroidDriverUtility(MobileDriverUtility actAndroidDriverUtility) {
		androidDriverUtility.set(actAndroidDriverUtility);
	}
	
}

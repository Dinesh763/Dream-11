package org.dream11.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods for csv and property file
 * @author Dinesh
 *
 */
public final class PropertyUtility {
	public Properties property;
	/**
	 * This method is used to initialize propertyfile
	 */
	public void initializePropertyFile(String filePath) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to fetch the value for a perticular key
	 * @param key
	 * @return
	 */
	public String getDataFromPropertyfile(String key) {
		return property.getProperty(key);
	}

}

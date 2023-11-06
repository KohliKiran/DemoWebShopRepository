package genericlibrery;
/**
/* @Kiran
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bouncycastle.util.Properties;
public class PropertyUtility implements IAutoConstants{
	/**
	 * This method is developed to read the data from property file
	 * This method accept key of which parameter you want to fetch
	 * @param key
	 * @return
	 */
	public String readingDataFromPropertyFile(String key)  {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.util.Properties property=new java.util.Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);

	}
}

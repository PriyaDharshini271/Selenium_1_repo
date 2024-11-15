package genericUtility;

import java.io.FileInputStream;
/**@author priya dharshini
 * 
 */
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * This method is used to read data from property file
	 * This method takes key as a parameter and returns value
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestScriptData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	 String properties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

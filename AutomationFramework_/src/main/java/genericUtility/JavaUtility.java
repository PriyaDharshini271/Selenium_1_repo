package genericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	//public WebDriver driver;
	/**
	 * This method is used to capture current system date and time
	 * @return String
	 */
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
		
	}
	/**
	 * This method is used to generate random numbers with 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ram = new Random();
		return ram.nextInt(1000);
	}

}

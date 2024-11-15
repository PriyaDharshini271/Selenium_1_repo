package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(partialLinkText  = "Log in")
	private WebElement LoginLink;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLoginLink() {
    return LoginLink;
	}
}

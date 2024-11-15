package ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(partialLinkText = "Log in")
	private WebElement LoginLink;
	
	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

}

package screens;

import org.openqa.selenium.WebElement;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends ScreenBase {

	@AndroidFindBy(id="flipboard.app:id/first_launch_cover_continue")
	public WebElement getStartedButton;
	
	
	public void clickGetStartedButton() {
		
		getStartedButton.click();
		
	}
	
	
}

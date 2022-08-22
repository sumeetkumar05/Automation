package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.FlipboardSteps;

@RunWith(SerenityRunner.class)
public class FlipBoardLoginTest extends BaseTest {

	@Managed(driver="appium")
	public WebDriver driver;
	
	
	
	@Steps
	FlipboardSteps flipboard;
	
	@Title("Login to the Flip board App")
	@Test
	public void loginTest() {
		
		flipboard.clickGetStartedButton();
		flipboard.chooseTopics(4);
		flipboard.clickContinue();
		
	}
	
	
}

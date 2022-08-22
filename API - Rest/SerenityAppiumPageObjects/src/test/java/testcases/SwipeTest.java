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
public class SwipeTest extends BaseTest {

	
	@Managed(driver="appium")
	public WebDriver driver;
	
	
	
	@Steps
	FlipboardSteps flipboard;
	
	@Title("Swiping test")
	@Test
	public void swipeTest() {
		
		
		flipboard.clickGetStartedButton();
		flipboard.chooseTopics(3);
		flipboard.clickContinue();
		flipboard.skipLogin();
		
		flipboard.scrollUp(3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flipboard.scrollDown(2);
		
	}
	
}

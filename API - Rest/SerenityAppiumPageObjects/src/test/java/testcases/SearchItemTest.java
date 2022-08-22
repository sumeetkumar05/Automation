package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.FlipboardSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(".\\src\\test\\resources\\testdata\\searchitem.csv")
public class SearchItemTest extends BaseTest {
	
	
	private String searchitem;
	
	
	public void setSearchitem(String searchitem) {
		this.searchitem = searchitem;
	}

	@Managed(driver="appium")
	public WebDriver driver;
	
	
	
	@Steps
	FlipboardSteps flipboard;
	
	@Title("Search Item Test")
	@Test
	public void searchItemTest() {
		
		flipboard.clickGetStartedButton();
		flipboard.chooseTopics(3);
		flipboard.clickContinue();
		flipboard.skipLogin();
		flipboard.selectBottomPanel(3);
		flipboard.searchFlipBoard(searchitem);
		flipboard.verifySearchText(searchitem);
		
		
	}
	
	
	

}

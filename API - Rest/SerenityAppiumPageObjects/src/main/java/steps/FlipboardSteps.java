package steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import screens.ChooseTopicsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SearchScreen;

public class FlipboardSteps {
	
	
	
	LoginScreen login;
	ChooseTopicsScreen topicScreen;
	HomeScreen home;
	SearchScreen search;
	
	@Step("Clicking on Get started Button")
	public void clickGetStartedButton() {
		
		login.clickGetStartedButton();
	}
	
	
	@Step("selecting topics count as {0}")
	public void chooseTopics(int topicCount) {
		
		topicScreen.chooseTopics(topicCount);
		
	}
	
	@Step("Clickinng on Continue button")
	public void clickContinue() {
		
		topicScreen.clickContinue();
		
		
	}

	
	@Step("Clicking on Skip now")
	public void skipLogin() {
		
		topicScreen.skipLogin();
		
		
	}
	
	
	
	@Step("selecting the panel number {0}")
	public void selectBottomPanel(int screenNo) {
		
		home.selectBottomPanel(screenNo);
		
		
		
	}
	
	@Step("Searching the flipboard for : {0}")
	public void searchFlipBoard(String text) {
		
		search.searchFlipBoard(text);
	}
	
	@Step("Scrolling up {0} times")
	public void scrollUp(int count) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.scrollUp(count);
	}
	
	

	@Step("Scrolling down {0} times")
	public void scrollDown(int count) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.scrollDown(count);
	}
	
	@Step("Verifying searched text {0}")
	public void verifySearchText(String text) {
		
		Assert.assertTrue(search.verifySearchText(text));
		
	}
}

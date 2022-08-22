package screens;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.ScreenBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseTopicsScreen extends ScreenBase {

	@AndroidFindBy(id="flipboard.app:id/topic_picker_topic_row_topic_tag")
	public List<AndroidElement> topic;
	
	@AndroidFindBy(id="flipboard.app:id/topic_picker_continue_button")
	public WebElement contButton;
	
	
	@AndroidFindBy(id="flipboard.app:id/icon_button_text")
	public WebElement skipLogin;
	
	
	public void chooseTopics(int topicsCount) {
		
		
		for(int i=0; i<topicsCount; i++) {
			
			waitFor(topic.get(i)).click();
		}
		
		
	}
	
	
	public void clickContinue() {
		
		contButton.click();
		
	}
	
	
	public void skipLogin() {
		
		skipLogin.click();
	}
	
	
	
}

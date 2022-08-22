package screens;

import java.util.List;

import base.ScreenBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends ScreenBase{
	
	
	@AndroidFindBy(id="flipboard.app:id/bottom_nav_view_icon")
	public List<AndroidElement> bottomNavigation;
	
	
	public void selectBottomPanel(int screenNo) {
		
		bottomNavigation.get(screenNo-1).click();
		
	}
	
	
	
	

}

package pages;

import base.BasePage;

public class NewCarsPage extends BasePage {

	
	
	public void chooseCarBrand(String brandName) {
		
		click("link="+brandName);
	}
	
}

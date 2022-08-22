package pages;

import base.BasePage;

public class HomePage extends BasePage{
	
	String newCarMenu = "xpath=//span[@class='margin-right5 top-nav-label-text'][contains(text(),'New Cars')]";
	String findNewCar = "xpath=//a[@class='js-main-nav-submenu'][contains(text(),'Find New Cars')]";
	
	
	public void navigateToNewCars() {
		
		moveMouseTo(newCarMenu);
	}
	
	public NewCarsPage navigateTofindNewCars() {
		
		
		click(findNewCar);
		
		return this.switchToPage(NewCarsPage.class);
	}

	
	
	public void findUsedCars() {
		
		
		
	}
	
	
	public void doLogin() {
		
		
	}
	
	
	public void checkOnRoadPrice() {
		
		
	}
}

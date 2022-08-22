package steps;


import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class CarWaleSteps {
	
	
	HomePage home;
	
	
	@Step
	public CarWaleSteps navigate() {
		
		home.open();
		return this;
		
	}
	
	@Step
	public void findNewCars(String brandName) {
		
		home.findNewCars().chooseCarBrand(brandName);
		Assert.assertTrue(home.getCarPageHeading().contains(brandName));
		
	}
	
	
	@Step
	public void findNameandPrice() {
		
		home.getCarNameAndPrice();
		
	}
	
	@Step
	public void updateCarPriceInFile(String fileName) {
		
		home.updateCarPriceInFile(fileName);
	}

}

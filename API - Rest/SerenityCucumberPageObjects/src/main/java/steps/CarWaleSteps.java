package steps;


import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.NewCarsPage;

public class CarWaleSteps {
	
	
	HomePage home;
	NewCarsPage newCar;
	
	
	@Step("Navigating to Carwale.com website HomePage")
	public CarWaleSteps navigate() {
		
		home.open();
		return this;
		
	}
	
	@Step("Navigate to New Car menu")
	public void navigateToNewCars() {
		
		home.navigateToNewCars();
	}
	
	
	@Step("Navigate to Find New Car menu")
	public void navigateToFindNewCar() {
		
		home.navigateTofindNewCars();
	}
	
	
	
	@Step("Finding Car Brand")
	public void findNewCars(String brandName) {
		
		newCar.chooseCarBrand(brandName);
		Assert.assertTrue(home.getCarPageHeading().contains(brandName));
		
	}
	
	@Step("Validating brand name")
	public boolean validateBrandName(String brandName) {
		
		return home.getCarPageHeading().contains(brandName);
	}
	
	
	@Step("Finding Car name and price")
	public void findNameandPrice() {
		
		home.getCarNameAndPrice();
		
	}
	
	@Step("Update Car price in a file")
	public void updateCarPriceInFile(String fileName) {
		
		home.updateCarPriceInFile(fileName);
	}

}

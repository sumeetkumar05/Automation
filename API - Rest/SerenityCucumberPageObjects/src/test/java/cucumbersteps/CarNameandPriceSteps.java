package cucumbersteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.CarWaleSteps;

public class CarNameandPriceSteps {
	
	@Steps
	CarWaleSteps car;
	
	
	@And("^user find car name and price$")
	public void user_find_car_name_and_price() {

		car.findNameandPrice();
	}
	
	
	@And("^user updates the name and price in a file for each (.*)$")
	public void user_updates_the_name_and_price_in_a_file(String brandName) {
	   
		car.updateCarPriceInFile(brandName);
	}

}

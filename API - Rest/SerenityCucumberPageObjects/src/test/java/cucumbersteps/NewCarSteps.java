package cucumbersteps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CarWaleSteps;

public class NewCarSteps {
	
	
	
	@Steps
	CarWaleSteps car;
	
	
	
	@Given("^user navigate to the website$")
	public void user_navigate_to_the_website() {
		
		
		car.navigate();
	
	    
	}


	@When("^user choose menu as new cars$")
	public void user_choose_menu_as_new_cars() {
		
		
		car.navigateToNewCars();
	    
	    
	}

	@Then("^user clicks on find new cars$")
	public void user_clicks_on_find_new_cars() {
		
		
		
		car.navigateToFindNewCar();
	 
	   
	}

	@And("^user search for (.*) car$")
	public void user_search_for_car(String brandName) {
	    

		car.findNewCars(brandName);
	 
		
	}
	
	
	@And("^user validate car title (.*)$")
	public void user_validate_car_title(String brandName) {

		Assert.assertTrue(car.validateBrandName(brandName));
	}

}

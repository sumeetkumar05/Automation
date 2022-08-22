package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.CarWaleSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(".\\src\\test\\resources\\testdata\\cardetails.csv")
public class FindCarTest {
	
	private String carbrand;
	
	
	


	public void setCarbrandName(String carbrand) {
		this.carbrand = carbrand;
	}



	@Managed
	WebDriver driver;
	
	
	@Steps
	CarWaleSteps car;
	
	
	
	@Title("Finding Car Test")
	@Test
	public void findCarTest() {
		
		car.navigate();
		car.findNewCars(carbrand);
		
	}

}

package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import pages.NewCarPage;
import utilities.DataUtil;

public class FindNewCarTest extends BaseTest{
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void findNewCar(String browserName, String carBrand, String carTitle, String runMode) {
		
		if(runMode.equals("N")) {
			
			throw new SkipException("Skipping the test as the run mode is NO");
		}
		
		
		setUp(browserName);
		HomePage home = new HomePage(driver);
		NewCarPage carPage = home.findNewCar();
		
		if(carBrand.equals("Hyundai")) {
			
			carPage.gotoHyundai();
			
		}else if(carBrand.equals("Toyota")) {
			
			carPage.gotoToyota();
			
		}else if(carBrand.equals("BMW")) {
			
			carPage.gotoBMW();
			
		}
		
		
		String title = BasePage.carBase.getCarTitle();
		System.out.println("Car Title is : "+title);
		Assert.assertEquals(title,carTitle);
		
		
		//new HomePage(driver).findNewCar().gotoBMW();
		
	}
	
}

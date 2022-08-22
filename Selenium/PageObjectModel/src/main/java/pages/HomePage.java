package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[1]/div")
	public WebElement newCarsMenu;
	
	@FindBy(xpath = "//div[contains(text(),'Find New Cars')]")
	public WebElement findNewCars;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/input")
	public WebElement searchNewCar;
	
	public NewCarPage findNewCar() {
		
		new Actions(driver).moveToElement(newCarsMenu).perform();
		findNewCars.click();
		
		return new NewCarPage(driver);
	
	}
	
	
	public void searchNewCar(String carName) {
		
		searchNewCar.sendKeys(carName);
		
	}
	
	
	public void searchUsedCar(String carName) {
		
		
		
	}
	
	
	
	
	
}

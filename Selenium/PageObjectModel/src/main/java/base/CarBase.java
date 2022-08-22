package base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarBase {
	
	WebDriver driver;
	
	public CarBase(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/div/h1")
	public WebElement carTitle;
	
	public String getCarTitle() {
		
	
		return carTitle.getText();
		
	}
	
	@FindBy(xpath = "//div/div/div/a/h3")
	public List<WebElement> carName;

	
	@FindBy(xpath = "//div/div/div[1]/div[2]/span[1]")
	public List<WebElement> carPrices;
	
	
	
	public void getCarNameAndPrices() {
		
		for(int i=0; i<carPrices.size(); i++) {
			
			
			System.out.println(carName.get(i).getText()+"----car price is : "+carPrices.get(i).getText());
			
		}
		
		
	}
	
	
	
}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public static WebDriver driver;
	public static CarBase carBase;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		carBase = new CarBase(driver);
		PageFactory.initElements(driver,this);
	}

}

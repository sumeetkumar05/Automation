package runners;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "steps" }, tags = {"@Search-Cars"}, monochrome = true, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })


public class PositiveTest  extends AbstractTestNGCucumberTests  {
	
	
}



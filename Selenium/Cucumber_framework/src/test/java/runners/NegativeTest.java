package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
@CucumberOptions(
        plugin = {"json:target/negative/cucumber.json", "pretty", "html:target/negative/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "C:\\Users\\ADMIN\\Downloads\\cucumber-testing-master\\src\\test\\resources\\FeatureFiles",
        glue = "steps",
        tags = {"@Used-Car-Search"}        
        )*/

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "steps" }, tags = {"@Used-Car-Search"}, monochrome = true, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class NegativeTest extends AbstractTestNGCucumberTests {

}

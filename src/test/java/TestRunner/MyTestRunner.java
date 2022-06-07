package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class MyTestRunner {
	@RunWith(Cucumber.class) 
	@CucumberOptions(features ="./src/test/resources/features",glue= {"StepDefinitions","AppHooks"},
	          plugin={"pretty","html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	          monochrome = true,
			  dryRun = false,
			  strict = true
			 	 )
	public class TestRunner {

	}
}
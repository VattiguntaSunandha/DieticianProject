package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

<<<<<<< HEAD
=======
	@RunWith(Cucumber.class) 
	@CucumberOptions(features ="./src/test/resources/features",glue= {"StepDefinitions","AppHooks"},
	          plugin={"pretty","html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	          monochrome = true,
			  dryRun = false,
			  strict = true
			 	 )
	public class MyTestRunner {
>>>>>>> refs/heads/master

	@RunWith(Cucumber.class)
	@CucumberOptions(features = {".\\src/test/resources/com/features"}, glue = { "stepdefinitions", "AppHooks" },
			plugin={"pretty","html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			monochrome = true,
			dryRun = false
			// strict = true
	)
	
public class MyTestRunner {
	}
<<<<<<< HEAD
	
=======

>>>>>>> refs/heads/master

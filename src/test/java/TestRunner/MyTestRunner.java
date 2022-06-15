package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class) 
	@CucumberOptions(features ={"src/test/resources/com/features/SignInPageTitle.feature"},glue= {"stepdefinitions","AppHooks"},
	          plugin={"pretty","html:target/HtmlReports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	          monochrome = true,
			  dryRun = false
			  
			 	 )
	public class MyTestRunner {

	}


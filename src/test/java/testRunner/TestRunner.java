package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/features/"},
				 glue = {"stepDefinition","Apphooks"},
				 plugin = {"pretty",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 })
public class TestRunner {
	//to run thread , use mvn verify 
	// place to above plugin "timeline:test-output-thread/"
}


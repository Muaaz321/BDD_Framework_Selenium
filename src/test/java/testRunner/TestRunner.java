package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/features/LoginPage.feature"},
				 glue = {"stepDefinition","Apphooks"},
				 plugin = {"pretty"})
public class TestRunner {

}

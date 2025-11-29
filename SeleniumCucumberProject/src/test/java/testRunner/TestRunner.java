package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C://Users//FAHIM//eclipse-workspace//SeleniumCucumberProject//Feature//FacebookLogo.feature",
	glue = "stepDefinition"
	
)


public class TestRunner {

}

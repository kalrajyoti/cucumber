package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "stepDefinition")

public class TestRunner extends AbstractTestNGCucumberTests {

}

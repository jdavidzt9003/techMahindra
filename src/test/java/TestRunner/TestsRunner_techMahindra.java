package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinitions",
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumberInfo.json"},
		publish = true
		)
public class TestsRunner_techMahindra {

}

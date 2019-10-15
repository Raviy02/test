package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "classpath:/", glue = { "classpath:/stepdefinitions", "runner" }, tags = {
		"@MULTI_FA or @MULTI_NFA" }, plugin = { "html:target/cucumber-report/Regression",
				"json:target/cucumber-report/Regression.json", "rerun:rerun/failed_scenarios.txt" })

public class Runner_AT {

}

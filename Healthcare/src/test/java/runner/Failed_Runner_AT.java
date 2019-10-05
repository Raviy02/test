package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "@rerun/failed_scenarios.txt", glue = { "classpath:/stepdefinitions",
		"runner" }, plugin = { "html:target/cucumber-report/Rerun", "json:target/cucumber-report/Rerun.json" })

public class Failed_Runner_AT {

}

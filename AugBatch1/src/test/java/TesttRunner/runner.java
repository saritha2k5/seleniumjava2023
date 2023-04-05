package TesttRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/register.feature",
glue="pac1",
dryRun = false,
monochrome = true)

public class runner {

	
}

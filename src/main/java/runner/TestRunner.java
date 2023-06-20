package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "stepdefinitions",
        plugin = {"pretty","html:target/HTMLReports.html"},
        dryRun = false,
        monochrome = true, //formatted steps,
        tags = "@prasanna"

)
public class TestRunner {
}

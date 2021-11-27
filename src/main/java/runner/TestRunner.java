package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    plugin = {"pretty","html:target/site/cucumber-pretty.html"},
    features={"src/test/resources/features"},
    glue={"stepDefs"},
    //tags="@tagTest",
    dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {

}

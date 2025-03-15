package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\PC\\eclipse-workspace\\Rassignment\\src\\test\\resources\\Rsystem",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner extends AbstractTestNGCucumberTests{

}

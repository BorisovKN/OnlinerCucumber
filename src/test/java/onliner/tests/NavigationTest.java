package onliner.tests;

import framework.BaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/onliner/features/navigation.feature"},
        glue = "onliner/steps",
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucumber.json","json:target/cucumber-reports/CucumberTestReport.json"}
)
public class NavigationTest extends BaseTest {}

package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
	    features = "src/test/java/featureFile",
	    glue = {"stepDefination"},
	    plugin = {
	                "pretty",
	                "html:target/cucumber-reports/cucumber-pretty",
	                "json:target/cucumber-reports/CucumberTestReport.json",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}
)

public class Runner extends AbstractTestNGCucumberTests {


}

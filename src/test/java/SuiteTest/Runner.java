package SuiteTest;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features ="C:/Users/Toshiba/eclipse-workspace/ProjetJumia/src/test/resources/Achatproduit.feature",
	glue ="SuiteTest",
	plugin={"pretty","html:target/Cucumber-report.html"}
)

public class Runner {

}

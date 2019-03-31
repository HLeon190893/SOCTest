package soctest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/Felipe/Documents/workspace/soctest/src/main/java/soctest/soctest/features/busca.feature",
		plugin = {"pretty","html:target/cucumber-reports"})
public class TestRunner {

}

package soctest;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.Utils;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/Felipe/Documents/workspace/soctest/src/main/java/soctest/soctest/features/busca.feature",
		plugin = {"pretty","html:target/reports/cucumber-reports"})
public class TestRunner {

	@BeforeClass
	public static void teste() {
		System.out.println(Utils.LOGO);
	}
	
}

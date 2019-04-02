package soctest;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.Utils;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= Utils.COMMOM_PATH + "src/main/java/soctest/soctest/features/busca.feature",
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {
	
	/*
	 *	 @Before roda antes da funcionalidade.  
	 */

	@BeforeClass
	public static void logo() {
		System.out.println(Utils.LOGO);
	}
	
	/*
	 *	 @After roda depois da funcionalidade
	 *	 Abre o relatório da execução de testes gerado automaticamente
	 */
	
	@AfterClass
	public static void footer() throws IOException {
		System.out.println(Utils.FOOTER);
		java.awt.Desktop.getDesktop().open( new File(Utils.COMMOM_PATH + "target/cucumber-reports/report.html" ));
	}
	
}

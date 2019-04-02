package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import exceptions.ExecucaoTesteException;
import factory.DriverFactory;
import soctest.soctest.features_steps.Steps;

public class Log{
	
	private static final Logger LOGGER = Logger.getLogger(Steps.class.getName());
	
	/*
	 *	 Método para imprimir LOG no console 
	 */
	
	public static void LogInfo(String texto) {
		LOGGER.info(texto);
	}
	
	/*
	 *	 Método para tirar screenshot da execução de teste
	 */
	
	public static void takeScreenShot(Scenario scenario) throws WebDriverException, ExecucaoTesteException, IOException {
		File sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + scenario.getName() + ".png");
		Files.copy(sourcePath, destinationPath);
		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}
	
	/*
	 *	 Método para adicionar um LOG no relatório, e imprimí-lo no console  
	 */
	
	public static void addStepReport(String texto) {
		Reporter.addStepLog(texto);
		Log.LogInfo(texto);
	}
	
}

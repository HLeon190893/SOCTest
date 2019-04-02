package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Utils;

public class DriverFactory {
	
	private static WebDriver driver;
	
	/*
	 *	 Método para inicialização do Chrome Driver  
	 */
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", Utils.COMMOM_PATH + "\\lib\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	
	/*
	 *	 Método para fechamento do Chrome Driver  
	 */
	
	public static void closeDriver() {
		driver.close();
	}
	
	/*
	 *	 Método para retornar o Chrome Driver  
	 */
	
	public static WebDriver getDriver() {
		return driver;
	}

}

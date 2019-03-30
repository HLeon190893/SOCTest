package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static void initDriver() {
		driver = new ChromeDriver();
	}
	
	public static void closeDriver() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}

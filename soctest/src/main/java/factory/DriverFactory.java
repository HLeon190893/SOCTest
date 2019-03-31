package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Felipe\\Documents\\workspace\\soctest\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void closeDriver() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}

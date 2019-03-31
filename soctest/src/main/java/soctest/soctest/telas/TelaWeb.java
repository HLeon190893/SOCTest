package soctest.soctest.telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import exceptions.ExecucaoTesteException;
import factory.DriverFactory;

public abstract class TelaWeb {
	
	WebDriver driver;
	
	public TelaWeb() {
		driver = DriverFactory.getDriver();
	}

	public WebElement encontrarElementoPorClasse(String classe) {
		return driver.findElement(By.className(classe));
	}
	
	public WebElement encontrarElementoPorLinkText(String link) throws ExecucaoTesteException {
		try {
			return driver.findElement(By.linkText(link));
		} catch (Exception e) {
			throw new ExecucaoTesteException(e);
		}
	}
	
}

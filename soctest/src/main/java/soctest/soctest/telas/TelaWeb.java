package soctest.soctest.telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import exceptions.ExecucaoTesteException;
import factory.DriverFactory;

public abstract class TelaWeb {
	
	WebDriver driver;
	
	/*
	 *	 Construtor da TelaWeb  
	 */
	
	public TelaWeb() {
		driver = DriverFactory.getDriver();
	}
	
	/*
	 *	 Método para encontrar elemento por classe
	 */

	public WebElement encontrarElementoPorClasse(String classe) {
		return driver.findElement(By.className(classe));
	}
	
	/*
	 *	 Método para retornar elemento por link text  
	 */
	
	public WebElement encontrarElementoPorLinkText(String link) throws ExecucaoTesteException {
		try {
			return driver.findElement(By.linkText(link));
		} catch (Exception e) {
			throw new ExecucaoTesteException(e);
		}
	}
	
	/*
	 *	 Método para retornar elemento por xpath  
	 */
	
	public WebElement encontrarElementoPorXPath(String xpath) throws ExecucaoTesteException {
		try {
			return driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			throw new ExecucaoTesteException(e);
		}
	}
}

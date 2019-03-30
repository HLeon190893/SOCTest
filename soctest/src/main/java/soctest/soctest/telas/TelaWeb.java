package soctest.soctest.telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;

public abstract class TelaWeb {
	
	WebDriver driver;
	
	public TelaWeb() {
		driver = DriverFactory.getDriver();
	}

	public WebElement encontrarElementoPorClasse(String classe) {
		return driver.findElement(By.className(classe));
	}
	
	public void inserirTexto(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}
}

package soctest.soctest.telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TelaArtigo extends TelaWeb{
	
	/*
	 *	 Método para retornar o WebElement título de um artigo  
	 */
	
	public WebElement acharTituloArtigo() {
		return driver.findElement(By.tagName("h1"));
	}

}

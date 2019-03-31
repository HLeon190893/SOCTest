package soctest.soctest.telas;

import org.openqa.selenium.WebElement;

public class TelaSocBlog extends TelaWeb{
	
	public WebElement buscarBotaoLimpar() {
		return encontrarElementoPorClasse("limpar-busca");
	}
	
	public WebElement buscarCampoPesquisa() {
		return encontrarElementoPorClasse("form-control");
	}
	
	public WebElement buscarBotaoPesquisar() {
		return encontrarElementoPorClasse("lupa-form");
	}
	
	public WebElement buscarLinkArtigo(String text) {
		return encontrarElementoPorLinkText(text);
	}

}

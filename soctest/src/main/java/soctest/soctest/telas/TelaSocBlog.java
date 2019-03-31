package soctest.soctest.telas;

import org.openqa.selenium.WebElement;

import exceptions.ExecucaoTesteException;

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
	
	public WebElement buscarLinkArtigo(String text) throws ExecucaoTesteException {
		return encontrarElementoPorLinkText(text);
	}
	
	public WebElement buscarTextRetornoVazio() {
		return encontrarElementoPorClasse("col-md-9");
	}

}

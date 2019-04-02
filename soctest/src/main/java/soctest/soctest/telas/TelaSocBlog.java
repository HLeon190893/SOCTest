package soctest.soctest.telas;

import org.openqa.selenium.WebElement;

import exceptions.ExecucaoTesteException;

public class TelaSocBlog extends TelaWeb{
	
	/*
	 *	 Método para retornar WebElement botão limpar  
	 */
	
	public WebElement buscarBotaoLimpar() {
		return encontrarElementoPorClasse("limpar-busca");
	}
	
	/*
	 *	 Método para retornar WebElement campo pesquisa  
	 */
	
	public WebElement buscarCampoPesquisa() {
		return encontrarElementoPorClasse("form-control");
	}
	
	/*
	 *	 Método para retornar WebElement botão pesquisar 
	 */
	
	public WebElement buscarBotaoPesquisar() {
		return encontrarElementoPorClasse("lupa-form");
	}
	
	/*
	 *	 Método para retornar WebElement do link de um artigo passado por parâmetro  
	 */
	
	public WebElement buscarLinkArtigo(String text) throws ExecucaoTesteException {
		return encontrarElementoPorLinkText(text);
	}
	
	/*
	 *	 Método para retornar o campo de texto com mensagem de retorno vazio para pesquisa  
	 */
	
	public WebElement buscarTextRetornoVazio() {
		return encontrarElementoPorClasse("col-md-9");
	}

}

package soctest.soctest.features_steps;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import factory.DriverFactory;
import soctest.soctest.telas.TelaArtigo;
import soctest.soctest.telas.TelaSocBlog;

public class Steps {
	
	TelaSocBlog tela;
	TelaArtigo telaArtigo;
	
	@Before
	public void iniciarDriver() {
		DriverFactory.initDriver();
		tela = new TelaSocBlog();
		telaArtigo = new TelaArtigo();
	}
	
	@Dado("^que eu estou no site do blog da SOC$")
	public void que_eu_estou_no_site_do_blog_da_SOC() throws Throwable {
		DriverFactory.getDriver().get("https://ww2.soc.com.br/blog/");
	}

	@Quando("^eu utilizar a barra de busca para pesquisar sobre \"([^\"]*)\"$")
	public void eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(String artigo) throws Throwable {
		tela.buscarCampoPesquisa().sendKeys(artigo);
		tela.buscarBotaoPesquisar().click();
		tela.buscarLinkArtigo(artigo).click();
	}
	
	@Então("^eu conseguirei acessar o artigo retornado$")
	public void eu_conseguirei_acessar_o_artigo_retornado() throws Throwable {
		Assert.assertEquals("SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional", telaArtigo.acharTituloArtigo().getText());
	}
	
	@After
	public void tearDown() {
		DriverFactory.closeDriver();
	}
	
}

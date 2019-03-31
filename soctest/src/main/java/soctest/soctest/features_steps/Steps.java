package soctest.soctest.features_steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import exceptions.ExecucaoTesteException;
import factory.DriverFactory;
import soctest.soctest.telas.TelaArtigo;
import soctest.soctest.telas.TelaSocBlog;
import utils.Log;

public class Steps {
	
	TelaSocBlog tela;
	TelaArtigo telaArtigo;
	Scenario scenario;
	
	@Before
	public void iniciarDriver(Scenario scenario) {
		DriverFactory.initDriver();
		Log.LogInfo("Inicializando o Chrome Driver");
		this.scenario = scenario;
		Log.LogInfo("Executando o cenário: " + scenario.getName());
		tela = new TelaSocBlog();
		telaArtigo = new TelaArtigo();
	}
	
	@Dado("^que eu estou no site do blog da SOC$")
	public void que_eu_estou_no_site_do_blog_da_SOC() throws ExecucaoTesteException {
		Log.LogInfo("Acessando a página SOC Blog.");
		DriverFactory.getDriver().get("https://ww2.soc.com.br/blog/");
	}

	@Quando("^eu utilizar a barra de busca para pesquisar sobre \"([^\"]*)\"$")
	public void eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(String artigo) throws ExecucaoTesteException {
		tela.buscarCampoPesquisa().sendKeys(artigo);
		tela.buscarBotaoPesquisar().click();
		tela.buscarLinkArtigo(artigo).click();
	}
	
	@Então("^eu conseguirei acessar o  artigo \"([^\"]*)\"$")
	public void eu_conseguirei_acessar_o_artigo(String artigo) throws ExecucaoTesteException {
		Assert.assertEquals(artigo, telaArtigo.acharTituloArtigo().getText());
	}
	
	@After
	public void tearDown() throws WebDriverException, ExecucaoTesteException {
		if(scenario.isFailed()) {
			Log.LogInfo("O cenário falhou. Favor verificar o relatório da execução");
			scenario.embed(Log.takeScreenShot(), "image/png");
		}
		DriverFactory.closeDriver();
	}
	
}

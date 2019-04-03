package soctest.soctest.features_steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ExecucaoTesteException;
import factory.DriverFactory;
import soctest.soctest.telas.TelaArtigo;
import soctest.soctest.telas.TelaSocBlog;
import utils.Log;

public class Steps {
	
	TelaSocBlog tela;
	TelaArtigo telaArtigo;
	Scenario scenario;
	
	
	/*
	 *	 @Before roda antes de cada cenário
	 *	 Inicializa o Driver e as telas da funcionalidade busca
	 */
	
	@Before
	public void iniciarDriver(Scenario scenario) {
		DriverFactory.initDriver();
		this.scenario = scenario;
		Reporter.addScenarioLog("Inicializando o Chrome Driver");
		Log.LogInfo("Executando o cenário: " + scenario.getName());
		tela = new TelaSocBlog();
		telaArtigo = new TelaArtigo();
	}
	
	
	/*
	 *	 Step: Acessar o site do blog da SOC  
	 */
	
	@Given("^que eu estou no site do blog da SOC$")
	public void que_eu_estou_no_site_do_blog_da_SOC() throws ExecucaoTesteException {
		Log.addStepReport("Acessando a página SOC Blog.");
		DriverFactory.getDriver().get("https://ww2.soc.com.br/blog/");
	}
	
	/*
	 *	 Step: Preenche a barra de busca do blog da SOC 
	 */
	
	@Given("^que a barra de pesquisa esteja preenchida$")
	public void que_a_barra_de_pesquisa_esteja_preenchida() throws ExecucaoTesteException {
		this.que_eu_estou_no_site_do_blog_da_SOC();
		Log.addStepReport("Preenchendo campo de pesquisa.");
		tela.buscarCampoPesquisa().sendKeys("Teste de preenchimento");
	}
	
	/*
	 *	 Step: Pesquisar na barra de busca sobre o parâmetro 
	 */
	
	@When("^eu utilizar a barra de busca para pesquisar sobre \"([^\"]*)\"$")
	public void eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(String artigo) throws Throwable {
		Log.addStepReport("Pesquisando no blog: " + artigo);
		tela.buscarCampoPesquisa().sendKeys(artigo);
		Log.addStepReport("Clicando no botão pesquisar");
		tela.buscarBotaoPesquisar().click();
	}
	
	/*
	 *	 Step: Utilizar a barra de pesquisa para pesquisar com retorno negativo  
	 */

	@When("^eu utilizar a barra de busca para pesquisar sobre um artigo inexistente")
	public void eu_utilizar_a_barra_de_busca_para_pesquisar_sobre_um_artigo_inexistente() throws ExecucaoTesteException {
		Log.addStepReport("Pesquisando no blog.");
		tela.buscarCampoPesquisa().sendKeys("Clicando no botão pesquisar");
		tela.buscarBotaoPesquisar().click();
	}
	
	/*
	 *	 Step: Clicar no botão limpar 
	 */

	@When("^eu clicar o botão Limpar$")
	public void eu_clicar_o_botão_Limpar() throws ExecucaoTesteException {
		Log.addStepReport("Clicando no botão Limpar");
		tela.buscarBotaoLimpar().click();
	}
	
	/*
	 *	 Step: Clicar no botão pesquisar 
	 */

	
	@When("^eu clicar no botão pesquisar$")
	public void eu_clicar_no_botão_pesquisar() throws Throwable {
		Log.addStepReport("Clicando no botão Pesquisar.");
		tela.buscarBotaoPesquisar().click();
	}
	
	/*
	 *	 Step: Acessar o artigo e verificar título  
	 */
	
	@Then("^eu conseguirei acessar o  artigo \"([^\"]*)\"$")
	public void eu_conseguirei_acessar_o_artigo(String artigo) throws ExecucaoTesteException {
		Log.addStepReport("Clicando no resultado da pesquisa.");
		tela.buscarLinkText(artigo).click();
		Log.addStepReport("Verificando se o título do artigo condiz com o artigo pesquisado.");
		Assert.assertEquals(artigo, telaArtigo.acharTituloArtigo().getText());
	}
	
	/*
	 *	 Step: Verifica a busca sem resultados  
	 */
	
	@Then("^eu terei a mensagem de retorno negativa$")
	public void eu_terei_a_mensagem_de_retorno_negativa() throws ExecucaoTesteException {
		Log.addStepReport("Verificando se houve retorno na busca.");
	   Assert.assertEquals("Nenhum post encontrado. Tente uma busca diferente", tela.buscarTextRetornoVazio().getText());
	}
	
	/*
	 *	 Step: Assert na barra de pesquisas
	 */
	
	@Then("^a barra de pesquisa voltará a ficar em branco$")
	public void a_barra_de_pesquisa_voltará_a_ficar_em_branco() throws ExecucaoTesteException {
		Log.addStepReport("Verificando conteúdo da barra de busca.");
		Assert.assertEquals("", tela.buscarCampoPesquisa().getText());
	}
	
	/*
	 *	 Step: Assert no número de páginas no rodapé
	 */
	
	@Then("^todos os artigos serão retornados$")
	public void todos_os_artigos_serão_retornados() throws Throwable {
		Log.addStepReport("Verificando retorno da pesquisa.");
		tela.buscarLinkText("30").click(); tela.buscarLinkText("40").click();
		tela.buscarLinkText("42").click(); tela.buscarLinkText("43").click();
		tela.buscarLinkText("45").click(); tela.buscarLinkText("46").click();
		Log.addStepReport("Verificando último artigo do blog.");
		tela.buscarLinkText("Equipe AGE empata em eletrizante jogo de futebol society");
		
	}
	
	/*
	 *	 @After roda após cada cenário.
	 *	 Fecha o Driver, e em caso de erro, printa a tela e adiciona a imagem ao relatório
	 */
	
	@After
	public void tearDown() throws WebDriverException, ExecucaoTesteException, IOException {
		if(scenario.isFailed()) {
			Log.LogInfo("O cenário falhou. Favor verificar o relatório da execução.");
			scenario.write("Erro do cenário " + scenario.getName());
			Log.takeScreenShot(scenario);
		}
		DriverFactory.closeDriver();
	}
	
}

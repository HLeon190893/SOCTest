package factory;

import cucumber.api.java.en.Given;

public class Aplicacao {
	
	public Aplicacao() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Felipe\\Documents\\workspace\\soctest\\lib\\chromedriver.exe");
	}
	
	@Given("^Eu estou no site do blog da SOC$")
	public void eu_estou_no_site_do_blog_da_SOC() throws Throwable {
		DriverFactory.initDriver();
		DriverFactory.getDriver().get("https://ww2.soc.com.br/blog/");
	}
	
	public void fecharAplicacao() {
		DriverFactory.closeDriver();
	}

}

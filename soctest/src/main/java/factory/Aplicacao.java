package factory;

public class Aplicacao {
	
	public Aplicacao() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Felipe\\Documents\\workspace\\soctest\\lib\\chromedriver.exe");
	}
	
	public void abrirAplicacao() {
		DriverFactory.initDriver();
		DriverFactory.getDriver().get("https://ww2.soc.com.br/blog/");
	}
	
	public void fecharAplicacao() {
		DriverFactory.closeDriver();
	}

}

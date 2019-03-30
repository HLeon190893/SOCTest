package soctest.soctest.ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.Aplicacao;
import soctest.soctest.telas.TelaSocBlog;

public class CT01 {	
	
	Aplicacao aplicacao = new Aplicacao();
	
	@Before
	public void before(){
		aplicacao.abrirAplicacao();
	}
	
	@Test
	public void main() {
		TelaSocBlog telablog = new TelaSocBlog();

		telablog.inserirTexto(telablog.buscarCampoPesquisa(), "teste");
	
	}
	
	@After
	public void burnOut() {
		aplicacao.fecharAplicacao();
	}

}

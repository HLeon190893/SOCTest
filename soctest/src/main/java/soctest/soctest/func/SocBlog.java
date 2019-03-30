package soctest.soctest.func;

import soctest.soctest.telas.TelaSocBlog;

public class SocBlog {

	TelaSocBlog tela = new TelaSocBlog();
	
	public void realizarBusca() {
		tela.inserirTexto(tela.buscarCampoPesquisa(), "teste");
	}
}

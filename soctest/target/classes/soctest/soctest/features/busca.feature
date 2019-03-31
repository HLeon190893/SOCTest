# language: pt
Funcionalidade: Busca

	Esquema do Cenário: Busca no blog com sucesso
	Dado que eu estou no site do blog da SOC
	Quando eu utilizar a barra de busca para pesquisar sobre "<artigo>"
	Então eu conseguirei acessar o  artigo "<artigo>"
	
	Exemplos:
	| artigo |
	|SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional |
	
	Esquema do Cenário: Busca no blog sem sucesso
	Dado que eu estou no site do blog da SOC
	Quando eu utilizar a barra de busca para pesquisar sobre "<artigo>"
	Então eu terei a mensagem de retorno negativa
	
	Exemplos:
	| artigo |
	|Teste de busca que não possui retorno |
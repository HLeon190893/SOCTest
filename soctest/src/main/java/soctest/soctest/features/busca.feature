Feature: Busca

	Scenario Outline: Busca no blog com sucesso
	Given que eu estou no site do blog da SOC
	When eu utilizar a barra de busca para pesquisar sobre "<artigo>"
	Then eu conseguirei acessar o  artigo "<artigo>"
	
	Examples:
	| artigo |
	|SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional|
	|Artigo que não existe para exemplo de cenário com erro				   										 |
	
	Scenario: Busca no blog sem sucesso
	Given que eu estou no site do blog da SOC
	When eu utilizar a barra de busca para pesquisar sobre um artigo inexistente
	Then eu terei a mensagem de retorno negativa
	
	Scenario: Funcionamento do botão Limpar
	Given que a barra de pesquisa esteja preenchida
	When eu clicar o botão Limpar
	Then a barra de pesquisa voltará a ficar em branco


	
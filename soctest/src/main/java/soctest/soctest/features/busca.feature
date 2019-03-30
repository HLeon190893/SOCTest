Feature: Busca

	Scenario: Busca no blog
	Given Eu estou no site do blog da SOC
	When Eu utilizar a barra de busca para pesquisar sobre "<algo>"
	Then Eu conseguirei ver o resultado "<resultado>"
	
	| algo      					  | resultado  |
	| Certificação Profissional SOC   | sucesso    |
	| Sua busca não entrou resultados | falha      |
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Felipe/Documents/workspace/soctest/src/main/java/soctest/soctest/features/busca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Busca",
  "description": "",
  "id": "busca",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Busca no blog com sucesso",
  "description": "",
  "id": "busca;busca-no-blog-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 5,
  "name": "que eu estou no site do blog da SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "eu utilizar a barra de busca para pesquisar sobre \"\u003cartigo\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 7,
  "name": "eu conseguirei acessar o  artigo \"\u003cartigo\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "busca;busca-no-blog-com-sucesso;",
  "rows": [
    {
      "cells": [
        "artigo"
      ],
      "line": 10,
      "id": "busca;busca-no-blog-com-sucesso;;1"
    },
    {
      "cells": [
        "SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional"
      ],
      "line": 11,
      "id": "busca;busca-no-blog-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 10764450716,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Busca no blog com sucesso",
  "description": "",
  "id": "busca;busca-no-blog-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 5,
  "name": "que eu estou no site do blog da SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "eu utilizar a barra de busca para pesquisar sobre \"SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 7,
  "name": "eu conseguirei acessar o  artigo \"SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.que_eu_estou_no_site_do_blog_da_SOC()"
});
formatter.result({
  "duration": 3966058853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional",
      "offset": 51
    }
  ],
  "location": "Steps.eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(String)"
});
formatter.result({
  "duration": 2464539124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional",
      "offset": 34
    }
  ],
  "location": "Steps.eu_conseguirei_acessar_o_artigo(String)"
});
formatter.result({
  "duration": 51859247,
  "status": "passed"
});
formatter.after({
  "duration": 715539953,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Busca no blog sem sucesso",
  "description": "",
  "id": "busca;busca-no-blog-sem-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 14,
  "name": "que eu estou no site do blog da SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu utilizar a barra de busca para pesquisar sobre \"\u003cartigo\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu terei a mensagem de retorno negativa",
  "keyword": "Então "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "busca;busca-no-blog-sem-sucesso;",
  "rows": [
    {
      "cells": [
        "artigo"
      ],
      "line": 19,
      "id": "busca;busca-no-blog-sem-sucesso;;1"
    },
    {
      "cells": [
        "Teste de busca que não possui retorno"
      ],
      "line": 20,
      "id": "busca;busca-no-blog-sem-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 3489814437,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Busca no blog sem sucesso",
  "description": "",
  "id": "busca;busca-no-blog-sem-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 14,
  "name": "que eu estou no site do blog da SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu utilizar a barra de busca para pesquisar sobre \"Teste de busca que não possui retorno\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu terei a mensagem de retorno negativa",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.que_eu_estou_no_site_do_blog_da_SOC()"
});
formatter.result({
  "duration": 3870013879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teste de busca que não possui retorno",
      "offset": 51
    }
  ],
  "location": "Steps.eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(String)"
});
formatter.result({
  "duration": 1759665963,
  "error_message": "exceptions.ExecucaoTesteException\r\n\tat soctest.soctest.telas.TelaWeb.encontrarElementoPorLinkText(TelaWeb.java:26)\r\n\tat soctest.soctest.telas.TelaSocBlog.buscarLinkArtigo(TelaSocBlog.java:22)\r\n\tat soctest.soctest.features_steps.Steps.eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(Steps.java:44)\r\n\tat ✽.Quando eu utilizar a barra de busca para pesquisar sobre \"Teste de busca que não possui retorno\"(C:/Users/Felipe/Documents/workspace/soctest/src/main/java/soctest/soctest/features/busca.feature:15)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1503158189,
  "status": "passed"
});
});
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
  "name": "eu conseguirei acessar o artigo retornado",
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
  "duration": 9520828094,
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
  "name": "eu conseguirei acessar o artigo retornado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.que_eu_estou_no_site_do_blog_da_SOC()"
});
formatter.result({
  "duration": 3725333396,
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
  "duration": 2970776426,
  "status": "passed"
});
formatter.match({
  "location": "Steps.eu_conseguirei_acessar_o_artigo_retornado()"
});
formatter.result({
  "duration": 55040064,
  "status": "passed"
});
formatter.after({
  "duration": 703514620,
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
  "duration": 2506738823,
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
  "duration": 3976588950,
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
  "duration": 1793004817,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"SOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d73.0.3683.68 (47787ec04b6e38e22703e856e101e840b65afe72),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027DESKTOP-KV96PH6\u0027, ip: \u0027192.168.0.197\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 73.0.3683.68 (47787ec04b6e3..., userDataDir: C:\\Users\\Felipe\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59803}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: 77566c0d627219b8fec3c5ecd2e41334\n*** Element info: {Using\u003dlink text, value\u003dSOC completa 15 anos de mercado e consolida liderança nacional em Gestão Ocupacional}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat soctest.soctest.telas.TelaWeb.encontrarElementoPorLinkText(TelaWeb.java:22)\r\n\tat soctest.soctest.telas.TelaSocBlog.buscarLinkArtigo(TelaSocBlog.java:20)\r\n\tat soctest.soctest.features_steps.Steps.eu_utilizar_a_barra_de_busca_para_pesquisar_sobre(Steps.java:35)\r\n\tat ✽.Quando eu utilizar a barra de busca para pesquisar sobre \"Teste de busca que não possui retorno\"(C:/Users/Felipe/Documents/workspace/soctest/src/main/java/soctest/soctest/features/busca.feature:15)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 712489299,
  "status": "passed"
});
});
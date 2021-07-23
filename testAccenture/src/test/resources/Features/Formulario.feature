#Author: digo.1903@hotail.com

@tag
Feature: Preencher os formularios do site Sampleapp
  Eu como usuario quero preencher os formularios do site e enviar
  
  @tag1
  Scenario: Preenchendo os formularios
    Given que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
    When eu preencho todos formularios necessarios e enviar
    Then validar o envio do e-mail com SUCESSO
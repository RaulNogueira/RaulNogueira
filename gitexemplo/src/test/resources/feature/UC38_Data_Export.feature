@UC38Work
Feature: Data Export
  System has to allow the user to export the project data to Overleaf

  @UC38_Cenario1
  Scenario: Create Document Review
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
    And user wait 2 seconds
    And user click on "HomePage.btnExport"
    And user click on "OverleafExport.selectIntegration"
    And user click on "OverleafExport.selectScope"
    And user click on "OverleafExport.selectSchedule"
    And user click on "OverleafExport.selectCost"
    And user click on "OverleafExport.selectQuality"
    And user click on "OverleafExport.selectResources"
    And user click on "OverleafExport.selectCommunication"
    And user click on "OverleafExport.selectRisk"
    And user click on "OverleafExport.selectProcurement"
    And user click on "OverleafExport.selectStakeholder"
    And user wait 2 seconds
    And user click on "OverleafExport.btnOpenOverleaf"

  @UC38_Cenario2
  Scenario: Create Document Review without any information
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
    And user wait 2 seconds
    And user click on "HomePage.btnExport"
    And user clear the text Area "OverleafExport.textArea"
    And user wait 2 seconds
    And user click on "OverleafExport.btnOpenOverleaf"

  @UC38_Cenario3
  Scenario: Create Document Review with one selection
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
    And user wait 2 seconds
    And user click on "HomePage.btnExport"
    And user click on "OverleafExport.selectIntegration"
    And user click on "OverleafExport.selectScope"
    And user click on "OverleafExport.selectIntegration"
    And user wait 2 seconds
    And user click on "OverleafExport.btnOpenOverleaf"

  @UC38_Cenario4
  Scenario: Create Document Review without options selected
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
     And user wait 2 seconds
    And user click on "HomePage.btnExport"
    And user wait 2 seconds
    And user click on "OverleafExport.btnOpenOverleaf"

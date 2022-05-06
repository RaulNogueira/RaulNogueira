@Login
Feature: Login no sistema Lesse
  Eu quero fazer o login no sistema Lesse

  @LoginCenario1
  Scenario Outline: Login com sucesso
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
    And user wait 2 seconds
    And user click on "HomePage.btnIdioma"
    Then user closes the browser

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      
  @LoginCenario2
  Scenario Outline: Login com sucesso
    Given browser is open
    When user needs to autenticate
    And user click on "LoginPage.btnLogin"
    And user wait 2 seconds
    And user click on "HomePage.btnOpen"
    And user click on "OpenDetailPage.btnWorkBreakdownStructure"
    Then user closes the browser

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
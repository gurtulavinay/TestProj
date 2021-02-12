Feature:
  As a user
  I should register

  @login
  Scenario: Validate registration with valid data

    Given When I'm on Home page "http://www.zoopla.co.uk"
    When I click on sign in button
    When I enter valid email "prachipi@yopmail.com"
    When I enter valid password "12345678"
    When I click on signin
    Then i should get registered


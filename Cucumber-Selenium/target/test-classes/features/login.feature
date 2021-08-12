@demosite
Feature: Login selenium test
  I want to use this template for my feature file

	@login
  Scenario: Go to login
  	Given I have registered
  	And I am on the login page
    When I enter login details
    And login
    Then check I have been logged in
 
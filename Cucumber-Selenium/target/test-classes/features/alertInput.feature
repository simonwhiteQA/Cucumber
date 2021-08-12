@alert
Feature: Alert input test
  I want to use this template for my feature file

	@alertInput
  Scenario: Go to alert
  	Given The alert page
  	And selecting the alert box
    When I enter my name
    Then the message should say my name
 

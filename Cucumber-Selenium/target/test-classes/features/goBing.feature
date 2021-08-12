Feature: Bing selenium test
  I want to use this template for my feature file

	@bing
  Scenario: Go to Bing
    When I request www.bing.com
    And search for doge
    Then I am on the bing home page
 
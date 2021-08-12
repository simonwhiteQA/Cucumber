@calculator
Feature: Calculator multiplication
  Testing whether the calculator can successfully multiply numbers.
  
  As a user, I want to multiply two or more numbers so I can then use 
  the sum in further calculations or data based decision making.
 
 	@multiplication
  Scenario Outline: Integer multiplication
    Given the first number <num1>
    And the second number <num2>
    When the numbers are multiplied
    Then the result should be <result>
    
    Examples:
			| num1 | num2 | result |
			| 20   | 2    | 40     |
			| 40   | 4    | 160    |
			| 20   | 10   | 200    |
			| 12   | 4    | 48     |
			
	

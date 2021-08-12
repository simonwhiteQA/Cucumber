@calculator
Feature: Calculator subtraction
  Testing whether the calculator can successfully subtract numbers.
  
  As a user, I want to subtract two or more numbers so I can then use 
  the sum in further calculations or data based decision making.

	@subtraction
  Scenario Outline: Integer subtraction
    Given the first number <num1>
    And the second number <num2>
    When the numbers are subtracted
    Then the result should be <result>
    
    Examples:
			| num1 | num2 | result |
			| 20   | 2    | 18     |
			| 40   | 4    | 36     |
			| 20   | 10   | 10     |
			| 145  | 100  | 45     |
			
	

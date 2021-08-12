package com.qa.cucumber.stepdef;

import static org.junit.Assert.assertEquals;

import com.qa.calculator.Calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
	
	private Calculator calculator;
	private int num1, num2, actual;
	
	@Before("@calculator")
	public void setup() {
		this.calculator = new Calculator();
	}
	
	@Given("the first number {int}")
	public void theFirstNumber(Integer int1) {
	    this.num1 = int1;
	}

	@Given("the second number {int}")
	public void theSecondNumber(Integer int1) {
	    this.num2 = int1;
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
	    actual = calculator.addNumbers(num1, num2);
	}
	
	@When("the numbers are subtracted")
	public void theNumbersAreSubtracted() {
	    actual = calculator.subtractNumbers(num1, num2);
	}
	
	@When("the numbers are multiplied")
	public void theNumbersAreMultiplied() {
	    actual = calculator.multiplyNumbers(num1, num2);
	}

	@Then("the result should be {int}")
	public void theResultShouldBe(Integer int1) {
	    assertEquals(int1.intValue(), actual);
	}
	
}


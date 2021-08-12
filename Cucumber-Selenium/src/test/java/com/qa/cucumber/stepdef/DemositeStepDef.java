package com.qa.cucumber.stepdef;

import org.openqa.selenium.WebDriver;

import com.qa.cucumber.SeleniumHooks;
import com.qa.pages.Login;
import com.qa.pages.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemositeStepDef {
	
private WebDriver driver;
private Register register;
private Login login;

	public DemositeStepDef(SeleniumHooks hooks) {
		this.driver = hooks.getWebDriver();
		login = new Login(hooks.getWebDriver());
		register = new Register(hooks.getWebDriver());
	}
	
	@Given("I have registered")
	public void i_have_registered() {
		driver.get(Register.registerURL);
		register.enterRegDetails();
		register.saveDetails();
	}
	
	@And("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get(Login.loginURL);
	}
	
	@When("I enter login details")
	public void enter_login_details() {
		login.loginDetails();
	}
	
	@And("login")
	public void login_button() {
		login.loginButton();
	}
	
	@Then("check I have been logged in")
	public void check_i_have_been_logged_in() {
		login.loginVerify();
	}

}

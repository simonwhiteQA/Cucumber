package com.qa.cucumber.stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber.SeleniumHooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDef {
	
	private WebDriver driver;
	
	public BingStepDef(SeleniumHooks hooks) {
		this.driver = hooks.getWebDriver();
	}
	
	@When("I request www.bing.com")
	public void i_request_www_bing_com() {
		driver.get("https://www.bing.com");
	}
	
	@And("search for doge")
	public void search_for_doge() {
		WebElement input = driver.findElement(By.id("sb_form_q"));
		input.sendKeys("doge");
		WebElement search = driver.findElement(By.cssSelector("#search_icon > svg"));
		search.click();
	}
	
	@Then("I am on the bing home page")
	public void i_am_on_the_bing_home_page() {
		assertEquals(driver.getTitle(), "doge - Bing");
	}
	
}

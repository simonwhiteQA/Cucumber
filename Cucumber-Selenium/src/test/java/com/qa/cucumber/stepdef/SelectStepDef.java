package com.qa.cucumber.stepdef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber.SeleniumHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectStepDef {
	
	private WebDriver driver;
	
		public SelectStepDef(SeleniumHooks hooks) {
			this.driver = hooks.getWebDriver();
		}
		
		@Given("I am on the load box page")
		public void i_am_on_the_load_box_page() {
			driver.get("http://way2automation.com/way2auto_jquery/selectable.php#load_box");
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='selectable/default.html']")));
		}
		
		@When("I select an item")
		public void select_an_item() {
			WebElement item = this.driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
			item.click();
		}
		
		@Then("the background should be orange")
		public void orange_background() {
			WebElement item = this.driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
			String itemBackground = item.getCssValue("background");
			assertTrue(itemBackground.contains("rgb(243, 152, 20)"));
		}

}

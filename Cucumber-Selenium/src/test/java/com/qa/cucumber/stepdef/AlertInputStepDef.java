package com.qa.cucumber.stepdef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber.SeleniumHooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertInputStepDef {
	
	private WebDriver driver;
	
	public AlertInputStepDef(SeleniumHooks hooks) {
		this.driver = hooks.getWebDriver();
	}
	
	@Given("The alert page")
	public void theAlertPage() {
		driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
		WebElement alertTab = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a"));
		alertTab.click();
	}

	@And("selecting the alert box")
	public void selectingTheAlertBox() {
	   driver.switchTo().frame(driver.findElement(By.cssSelector("#example-1-tab-2 > div > iframe")));
	   WebElement alertButton = driver.findElement(By.xpath("/html/body/button"));
	   alertButton.click();
	}

	@When("I enter my name")
	public void iEnterMyName() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Simon");
		alert.accept();
	}

	@Then("the message should say my name")
	public void theMessageShouldSayMyName() {
		WebElement textVerify = driver.findElement(By.id("demo"));
		assertTrue(textVerify.getText().contains("Simon"));
	}

}

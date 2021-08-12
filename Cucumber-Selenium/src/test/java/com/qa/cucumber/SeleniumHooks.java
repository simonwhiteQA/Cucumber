package com.qa.cucumber;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SeleniumHooks {
	
	private WebDriver webDriver;

	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		this.webDriver = new ChromeDriver();
	}

	@After
	public void teardown() {
		this.webDriver.quit();
	}
	
	@AfterStep
	public void reset(Scenario scenario) {
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	private byte[] takeScreenshot() {
		return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
	}

}


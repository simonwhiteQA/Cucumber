package com.qa.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SeleniumHooks {
	
	private WebDriver webDriver;

	@Before()
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		this.webDriver = new ChromeDriver();
	}

	@After()
	public void teardown() {
		this.webDriver.quit();
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

}

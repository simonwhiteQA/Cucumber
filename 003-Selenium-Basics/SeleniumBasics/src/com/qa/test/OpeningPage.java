package com.qa.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningPage {
	
	// Instanitating a WebDriver from import
	private WebDriver driver;
	
	// Runs before all other tests
	@Before
	public void setup() {
		// Using the driver object, creating a Chrome driver
		this.driver = new ChromeDriver();
		
		// Making the chrome window the full size of the page
		// Using driver object, configure the window and other properties
		driver.manage().window().maximize();
	}
	
	@Test
	public void testBingTitle() {
		
		// Arrange
		//	- Grabbing the URL and creating the webdriver
		
		// Act
		//	- Going to the Bing URL
		
		// Chrome driver as driver gets the URL we pass in
		driver.get("https://www.bing.com/");
		
		// Assert
		//	- Validating the title of the webpage
		
		// Testing what we expect to be the title, compared to what the title is
		assertEquals("Bing", driver.getTitle());
		
		// When the user goes to the Bing website
		// The title of the website should be "Bing"
		
	}
	
	@Test
	public void testBBCTitle() {
		
		// Arrange
		
		// Act
		driver.get("https://www.bbc.co.uk/news");
		
		// Assert
		assertTrue(driver.getTitle().contains("Home - BBC News"));
		
		
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	

}

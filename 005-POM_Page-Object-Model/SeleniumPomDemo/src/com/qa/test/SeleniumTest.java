package com.qa.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.SearchPage;

public class SeleniumTest {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	// Using POM (Page Object Model) when I search into the BBC Search search bar I want an article containing that string to appear
	@Test
	public void searchString() throws InterruptedException {
		
		String testString = "keyboard";
		
		// Create a new object of SearchPage called searchPage
		// Object will be created with pageFactory, where we pass in the class
		SearchPage page = PageFactory.initElements(driver, SearchPage.class);
		
		// using driver navigate to the pages object URL
		this.driver.get(page.URL);
		
		// Run the objects methods to use the search bar
		page.search(testString);
		
		Thread.sleep(6000);
		
		// Test the first article contains the testString 
		assertTrue(page.checkResult().contains(testString));
		
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}

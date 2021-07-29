package com.qa.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.pages.SearchPage;

public class SeleniumTest {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true); // Stops the windows from displaying
		
		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();
	}
	
	// Using POM (Page Object Model) when I search into the BBC Search search bar I want an article containing that string to appear
//	@Test
//	public void searchString() throws InterruptedException {
//		
//		String testString = "keyboard";
//		
//		// Create a new object of SearchPage called searchPage
//		// Object will be created with pageFactory, where we pass in the class
//		SearchPage page = PageFactory.initElements(driver, SearchPage.class);
//		
//		// using driver navigate to the pages object URL
//		this.driver.get(page.URL);
//		
//		// Run the objects methods to use the search bar
//		page.search(testString);
//		
//		Thread.sleep(6000);
//		
//		// Test the first article contains the testString 
//		assertTrue(page.checkResult().contains(testString));
//		
//	}
	
	// Using POM when I click the BBC logo from the Search page I want to go to the BBC Home page (and validate it)
	@Test
	public void homeTakesYouHome() throws InterruptedException {
		
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		
		// Gone to Search page URL
		this.driver.get(searchPage.URL);
		
		Thread.sleep(2000);
		
		// Running the go back home method
		searchPage.backHome();
		
		Thread.sleep(2000);
		
		// Create a new object called home page
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		// Using method in homepage object, is the header the same
		assertTrue(homePage.returnHeader().contains("welcome to the bbc"));
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}

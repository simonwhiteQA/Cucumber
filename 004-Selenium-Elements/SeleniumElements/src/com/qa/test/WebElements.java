package com.qa.test;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		
	}
	
	// When searching a String in the search bar, we expect an article with said string to be contained
	@Test
	public void testBBCSearch() throws InterruptedException {
		
		// Arrange
		
		String testString = "computer";
		String url = "https://www.bbc.co.uk/search";
		
		this.driver.get(url);
		
		// Grabbing the Search bar and saving it as a web element called searchBar
		WebElement searchBar = this.driver.findElement(By.id("search-input"));
		
		// Grabbing the Search button and saving it as a web element called searchButton
		WebElement searchButton = this.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/form/div/div/div/button"));
		
		System.out.println("searchBar: " + searchBar);
		System.out.println("searchButton: " + searchButton);
		
		// Act
		
		// Mock the search bar being typed into using sendKeys(String)
		searchBar.sendKeys(testString);
		
		Thread.sleep(2000);
		
		// Mock pressing the Search button
		searchButton.click();
		
		Thread.sleep(3000);
		
		// Mocks Pressing enter on the keyboard, submitting the data
//		searchBar.sendKeys(Keys.ENTER);
		
		// Assert
		
		WebElement searchResult = this.driver.findElement(By.cssSelector("#main-content > div:nth-child(1) > div.ssrcss-1v7bxtk-StyledContainer.enjd40x0 > div > div > ul > li:nth-child(1) > div > div > div.ssrcss-som5se-PromoContent.e1f5wbog7 > div.ssrcss-rjdkox-Stack.e1y4nx260 > a > span > p > span"));
		System.out.println(searchResult.getText());
		
		// Does the text result contain the original string
		// Taking the searchResult element, grabbing the text AND making it lower case
		assertTrue(searchResult.getText().toLowerCase().contains(testString));
		
		
	}
	
	@After
	public void tearDown() {
		this.driver.close();
	}

}

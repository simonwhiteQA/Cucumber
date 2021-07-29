package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// THIS IS NOT A TEST
// WILL NOT CONTAIN TESTS. IT IS A OBJECT FOR THE TEST CLASS TO USE AND CREATE

// We will be creating an object of the page we're wanting Selenium to test

public class SearchPage {
	
	// The URL of this page
	public final String URL = "https://www.bbc.co.uk/search";
	
	
	@FindBy(id = "search-input") // Find by annotation takes in id, css, xpath etc.
	private WebElement searchBar; // Assigning the Webelement Search bar to be id = "search-input"
	
	@FindBy(xpath = "/html/body/div/div/main/div[1]/form/div/div/div/button")
	private WebElement searchButton;
	
	@FindBy(css = "#main-content > div:nth-child(1) > div.ssrcss-1v7bxtk-StyledContainer.enjd40x0 > div > div > ul > li:nth-child(1) > div > div > div.ssrcss-som5se-PromoContent.e1f5wbog7 > div.ssrcss-rjdkox-Stack.e1y4nx260 > a > span > p > span")
	private WebElement searchResult;
	
	
	// Method to send keys and click search button
	public void search(String searchTerm) {
		searchBar.sendKeys(searchTerm);
		searchButton.click();
	}
	
	// Method to return value of search result
	public String checkResult() {
		return searchResult.getText().toLowerCase();
	}

}

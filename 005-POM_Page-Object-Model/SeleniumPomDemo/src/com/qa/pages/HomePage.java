package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public final String URL = "https://www.bbc.co.uk/";
	
	@FindBy(xpath = "/html/body/div/div/header/div[3]/div/div/div/div/div")
	private WebElement header;
	
	// Method to return the header
	public String returnHeader() {
		return this.header.getText().toLowerCase();
	}

}

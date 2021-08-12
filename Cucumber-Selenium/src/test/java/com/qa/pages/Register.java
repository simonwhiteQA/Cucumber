package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	private WebDriver driver;
	public final static String registerURL = "http://thedemosite.co.uk/addauser.php";
	
	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterRegDetails() {
		WebElement usernameInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		usernameInput.sendKeys("simon");
		
		WebElement passwordInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput.sendKeys("password123");
	}
	
	public void saveDetails() {
	WebElement saveButton = driver.findElement(By.xpath(
			"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
	saveButton.click();
	}

}

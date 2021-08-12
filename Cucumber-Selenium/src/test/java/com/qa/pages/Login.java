package com.qa.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	public final static String loginURL = "http://thedemosite.co.uk/login.php";
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginDetails() {
		WebElement usernameInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		usernameInput.sendKeys("simon");
		
		WebElement passwordInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput.sendKeys("password123");
		
	}
	
	public void loginButton() {
		WebElement saveButton = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		saveButton.click();
	}
	
	public void loginVerify() {
		WebElement loginSuccess = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals(loginSuccess.getText(), "**Successful Login**");
	}

}

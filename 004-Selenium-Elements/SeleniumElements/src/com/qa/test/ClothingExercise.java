package com.qa.test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClothingExercise {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}
	
	@Test
	public void tShirtProcess() {
		
		// Go to Automation website
		
		this.driver.get("http://automationpractice.com/index.php");
		
		// Click T Shirts
		
		WebElement tShirtButton = this.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
		tShirtButton.click();
		
		// Click first t shirt
		
		WebElement firstTShirt = this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]"));
		firstTShirt.click();
		
		// On new page save the name of the product as a variable
		
		String productName = this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1")).getText();
		System.out.println(productName);
		
		// Click add to cart
		
		WebElement addToCart = this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button"));
		addToCart.click();
		
		// On modal select continue to checkout
		
		WebElement proceedCheckout = this.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		System.out.println(proceedCheckout);
		proceedCheckout.click();
		
		// Check item clicked matches what is in basket
		
		WebElement basketItem = this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a"));
		
		// Assertion
		assertTrue(basketItem.getText().contains(productName));
	}

}

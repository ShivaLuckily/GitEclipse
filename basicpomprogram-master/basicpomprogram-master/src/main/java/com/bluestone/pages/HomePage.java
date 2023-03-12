package com.bluestone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id="login")
	WebElement loginLink;
	

	
	
	   public BrowsePage clickOnCategoryLink(String link) throws Exception
	    {
	       
		   
		   Thread.sleep(9000);
		    driver.findElement(By.xpath("//nav[@class='wh-navbar']//a[contains(@title,'"+link+"')]")).click();
	        return PageFactory.initElements(driver, BrowsePage.class);
	    }

}

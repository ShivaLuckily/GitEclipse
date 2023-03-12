package com.bluestone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bluestone.utils.TestUtils;



public class BrowsePage {
	
	
	WebDriver driver;

	public BrowsePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath ="//section[contains(@class,'sort-by')]")
	WebElement sortby_dropdown;
	

	
	
	
	/*
	 * public BrowsePage mouseOverOnSortByDropdown() throws Exception {
	 * 
	 * 
	 * if (!isElementDisplayed("browsepage.sortby_dropdown_menu")) {
	 * mouseOver("browsepage.sortby_dropdown"); }
	 * 
	 * return this; }
	 * 
	 * }
	 */
}
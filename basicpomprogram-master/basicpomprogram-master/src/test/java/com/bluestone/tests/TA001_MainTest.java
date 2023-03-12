package com.bluestone.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bluestone.base.BaseTest;
import com.bluestone.pages.BrowsePage;
import com.bluestone.pages.HomePage;
import com.bluestone.pages.LoginPage;
import com.bluestone.utils.ExcelUtil;

public class TA001_MainTest extends BaseTest {

	LoginPage loginpage;

	HomePage homePage;
	BrowsePage browsePage;
	String sheetName = "Sheet1";

	ExcelUtil excelUtil = new ExcelUtil(
			"C:\\Users\\mohan\\OneDrive\\Desktop\\SanuWorkspace\\basicpomprogram-master\\basicpomprogram-master\\src\\main\\resource\\testdata.xlsx");

	@Test(priority = 1)
	public void loginPageTitleTest() throws Exception {

		homePage = PageFactory.initElements(driver, HomePage.class);
		
		  browsePage =	homePage.clickOnCategoryLink("Rings");
		

		
		//for(int datarow=2; datarow<=excelUtil.getRowCount(sheetName);datarow++) {

		//String username = excelUtil.getCellData(sheetName,2, "Username");

		
		
		
		
		
		}
	}



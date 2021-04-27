package com.redbus.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.base.TestBase;
import com.redbus.qa.pages.CarPoolPage;
import com.redbus.qa.pages.HomePage;

public class CarPoolPageTest extends TestBase
{
   CarPoolPage carpool;
   HomePage homepage;
   
	
	public CarPoolPageTest()
	{
		super();
		
	}
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		carpool=new CarPoolPage();
		homepage=new HomePage();
		
	}
	@Test(priority=1)
	public void pageTitleTest()
	{
		homepage.clickOnCarPoolLink();
	String title=carpool.pageTitle();
	Assert.assertEquals(title, "rPool - India’s new Carpool & Bikepool mobile app");
	
	}
	@Test(priority=2)
	public void navigateToHomePageTest()
	{
		carpool.navigateToHomePage();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

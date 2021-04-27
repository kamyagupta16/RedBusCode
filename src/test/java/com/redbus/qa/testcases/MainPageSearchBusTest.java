package com.redbus.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.base.TestBase;
import com.redbus.qa.pages.MainPageSearchBus;

public class MainPageSearchBusTest extends TestBase

{
	MainPageSearchBus mainpage;
	public MainPageSearchBusTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		mainpage=new MainPageSearchBus();
	}
	@Test(priority=1)
	public void getFromLocationTest()
	{
		mainpage.getFromLocation();
	}
	@Test(priority=2)
	public void getToLocationTest()
	{
		mainpage.getToLocation();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

package com.redbus.qa.pages;

import org.openqa.selenium.support.PageFactory;

public class CarPoolPage extends HomePage


{

	public CarPoolPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String pageTitle()
	{
		 return driver.getTitle();
	}
	public void navigateToHomePage()
	{
		driver.navigate().back();
	}
}

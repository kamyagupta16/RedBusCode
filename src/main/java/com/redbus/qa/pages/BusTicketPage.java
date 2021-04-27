package com.redbus.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTicketPage extends HomePage
{
	
	@FindBy(xpath="//input[@id='txtSource']")
	WebElement source;
	@FindBy(xpath="//input[@id='txtDestination']")
	WebElement desination;
	
	public BusTicketPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String  validatePageTitle()
	{
		
		return driver.getTitle();
	}
	
	
	
	public void navigateToHome()
	{
		driver.navigate().back();
	}
}

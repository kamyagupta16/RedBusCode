package com.redbus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.base.TestBase;

public class HomePage extends TestBase

{
	//Page Factory 
	@FindBy(xpath="//a[@class='redbus-logo home-redirect']")
	WebElement redbuslogo;
	@FindBy(id="redBus")
	WebElement busTicketLink;
	@FindBy(xpath="//a[@id='cars']")
	WebElement carPoolLink;
	@FindBy(xpath="//a[contains(text(),'BUS HIRE ')]")
	WebElement busHireLink;
	@FindBy(id="pilgrimages")
	WebElement pilgrImagesLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateRedBusLogo()
	{
		return redbuslogo.isDisplayed();
	}
	public BusTicketPage clickOnBusTicketLink()
	{
		busTicketLink.click();
		return new BusTicketPage();
	}
	public CarPoolPage clickOnCarPoolLink()
	{
		carPoolLink.click();
		return new CarPoolPage();
	}
	public BusHirePage clickOnBusHireLink()
	{
		busHireLink.click();
		return new BusHirePage();
	}
	public PilGriMagesPage clickOnPilGriImagesLink()
	{
		pilgrImagesLink.click();
		return new PilGriMagesPage();
	}
}

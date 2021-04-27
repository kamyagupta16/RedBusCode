package com.redbus.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.base.TestBase;
import com.redbus.qa.pages.BusTicketPage;
import com.redbus.qa.pages.HomePage;

public class BusTicketPageTest extends TestBase
{
	BusTicketPage busticket;
	HomePage homepage;
	
	public BusTicketPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		busticket=new BusTicketPage();
		homepage =new HomePage();
	}
	@Test(priority=1)
	public void validatePageTitleTest()
	{
		homepage.clickOnBusTicketLink();
	String title=	busticket.validatePageTitle();
	Assert.assertEquals(title, "Online Bus Tickets Booking: Book Bus Ticket and Bus Reservation -redBus India");
	}
	@Test(priority=2)
	public void navigateToHomeTest()
	{
		busticket.navigateToHome();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}

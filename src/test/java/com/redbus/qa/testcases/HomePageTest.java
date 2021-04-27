package com.redbus.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.base.TestBase;
import com.redbus.qa.pages.BusTicketPage;
import com.redbus.qa.pages.HomePage;

public class HomePageTest extends TestBase
{
	HomePage homepage;
	BusTicketPage busticketpage;

public HomePageTest()
{
	super();
}
@BeforeMethod
public void setup()
{
	initialization();
	homepage =new HomePage();
}
@Test(priority=1)
public void HomePageTitleTest()
{
	String title=homepage.validateLoginPageTitle();
	Assert.assertEquals(title, "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
}
@Test(priority=2)
public void redBusImageTest()
{
	boolean flag=homepage.validateRedBusLogo();
	Assert.assertTrue(flag);
}
@Test(priority=3)
public void VerifyBusTicketLinkTest()
{
	busticketpage=homepage.clickOnBusTicketLink();
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}

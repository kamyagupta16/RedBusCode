package com.redbus.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.base.TestBase;

public class MainPageSearchBus extends TestBase
{
	@FindBy(id="src")
	WebElement loc;
	@FindBy(xpath="//input[@id='src']/../ul/li")
	List<WebElement> exactloc;
	@FindBy(id="dest")
	WebElement toloc;
	@FindBy(xpath="//input[@id='dest']/../ul/li")
	List<WebElement> toexactloc;
	
	
	public MainPageSearchBus()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getFromLocation()
	{
		loc.sendKeys(prop.getProperty("fromloc"));
		int x=exactloc.size();
		for(int k=0;k<x;k++)
		{
		String fromstation=	exactloc.get(k).getText();
		if(fromstation.equals(prop.getProperty("stationname")))
		{
			exactloc.get(k).click();
			break;
		}
		}
		
	}
	public void getToLocation()
	{
		toloc.sendKeys(prop.getProperty("desloc"));
	int j=	toexactloc.size();
	for(int i=0;i<j;i++)
	{
		String tostation=toexactloc.get(i).getText();
		if(tostation.equals(prop.getProperty("desname")))
		{
			toexactloc.get(i).click();
			break;
		}
	}
	}
}

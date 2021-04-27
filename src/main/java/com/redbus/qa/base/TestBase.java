package com.redbus.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.redbus.qa.util.TestUtil;

public class TestBase 
{
public static WebDriver driver;
public static Properties prop;
public static ChromeOptions option;



public TestBase()
{
	try
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Krishna\\eclipse-workspace\\RedBusTest"
				+ "\\src\\main\\java\\com\\redbus\\qa\\config\\config.properties");
		prop.load(ip);
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
public static void  initialization()
{
	String browserName=prop.getProperty("browser");
	option=new ChromeOptions();
	option.addArguments("--Start-maximize");
	option.addArguments("--disable-notifications");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver" ,"D:\\Software\\Automation Tools\\selinium\\Driver\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else
	{
		System.out.println("Please enter only chrome browser");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}


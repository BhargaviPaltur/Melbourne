package com.qa.jtv.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class BaseClass {
	public static WebDriver driver;
	public static void initialize(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
			 driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firfox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckoDriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.jtv.com");
		
		;
		
		
		
		
	}

}

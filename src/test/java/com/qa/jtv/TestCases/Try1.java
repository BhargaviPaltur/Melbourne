package com.qa.jtv.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utility.ScreenShot.class)
public class Try1 {
	
	@Test
	public void openApplication()
	{
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			Assert.assertEquals(driver.getTitle(),"abc");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
	}
	

}

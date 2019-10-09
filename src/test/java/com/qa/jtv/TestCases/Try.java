package com.qa.jtv.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Try {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 

	}
	@Test
	public void init()
	{
		
	}

	

}

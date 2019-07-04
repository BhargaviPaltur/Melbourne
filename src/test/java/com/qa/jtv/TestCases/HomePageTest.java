package com.qa.jtv.TestCases;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jtv.base.BaseClass;
import com.qa.jtv.pages.HomePage;

public class HomePageTest extends BaseClass {
	HomePage h;
	
	@BeforeMethod
	public void setUp()
	{
		BaseClass.initialize("chrome");
		 h=new HomePage();
	}
	
	@Test
	public void goToCreatePage()
	{
		h.goToCreateAccountPage();
		System.out.println("lemme try");
		System.out.println("lemme see");
		System.out.println("conflict resolve");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser closed");
	}	
	
	

}


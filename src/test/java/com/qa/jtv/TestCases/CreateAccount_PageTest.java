package com.qa.jtv.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.base.ReadXL;
import com.qa.jtv.pages.CreateAccount_Page;
import com.qa.jtv.pages.Home_Page;

@Listeners(Utility.ScreenShot.class)
public class CreateAccount_PageTest extends Base {
	Home_Page hp;
	CreateAccount_Page cap;
	
	@BeforeMethod
	public void setup()
	{
		Base.start();
		hp=new Home_Page();
		cap= new CreateAccount_Page();
	}
	
	@Test
	public void checkTitle()
	{
		String s= cap.verifyTitle();
		Assert.assertEquals(s,"abc");
	}
	
	@Test(dataProvider="getXlData", enabled=false)
	public void createAccount(String fn, String ln, String email, String phone, String pass, String cpass)
	{
		hp.goToCreateAccountPage();
		cap.createUser(fn,ln,email,phone,pass,cpass);
		
	}
	
	@DataProvider
	public Object[][] getXlData()
	{
		Object[][] d = ReadXL.getTestData();
		return d;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	
}

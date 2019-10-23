package com.qa.jtv.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.base.ReadXL;
import com.qa.jtv.pages.Home_Page;
import com.qa.jtv.pages.Login_Page;

public class LoginPage_Test extends Base {
	Home_Page hp;
	Login_Page lp;
	
	@BeforeMethod
	public void setup()
	{
		Base.start();
		hp=new Home_Page();
		lp=new Login_Page();
	}
	
	@Test(dataProvider="getData",enabled=false)
	public void letsLogin(String email, String password)
	{
		hp.goToLoginPage();
		lp.login(email, password);
		Assert.assertEquals(lp.verifyTitle(),"Account Home | JTV.com" );
		
	}
	
	@Test(dataProvider="getData")
	public void letsEmailSignup(String email, String password)
	{
		hp.goToLoginPage();
		lp.emailSignup(email, password);
		Assert.assertEquals(lp.verifyTitle(),"Account Home | JTV.com" );
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = ReadXL.getTestData("Sheet2");
		return data;
	}
	

}
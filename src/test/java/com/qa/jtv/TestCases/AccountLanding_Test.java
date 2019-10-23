package com.qa.jtv.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.pages.Account_landing;
import com.qa.jtv.pages.Home_Page;
import com.qa.jtv.pages.Login_Page;

public class AccountLanding_Test extends Base {
	Home_Page hp;
	Login_Page lp; 
	Account_landing ap;
	
	@BeforeMethod
	public void initialize()
	{
		Base.start();
		hp=new Home_Page();
		lp=new Login_Page();
		hp.goToLoginPage();
		lp.singleLogin();
		ap= new Account_landing();		
	}
	
	@Test
	public void goToAddress()
	{
		ap.clickOnAddress();
	}

}

package com.qa.jtv.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.pages.Account_landing;
import com.qa.jtv.pages.Home_Page;
import com.qa.jtv.pages.Login_Page;
import com.qa.jtv.pages.Shipping_Address;

public class ShippingAddress_Test extends Base{
	Home_Page hp;
	Login_Page lp;
	Account_landing ap;
	Shipping_Address sp;
	
	@BeforeMethod
	public void initialize()
	{
		Base.start();
		hp=new Home_Page();
		lp=new Login_Page();
		ap=new Account_landing();
		sp=new Shipping_Address();
	}
	
	@Test
	public void selectC()
	{
	    hp.goToLoginPage();
	    lp.singleLogin();
	    ap.clickOnAddress();
		sp.selectCountry("CA");
	}
	

}

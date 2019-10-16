package com.qa.jtv.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.pages.Category_Page;
import com.qa.jtv.pages.CreateAccount_Page;
import com.qa.jtv.pages.Home_Page;

@Listeners(Utility.ScreenShot.class)
public class Home_PageTest extends Base {
	Home_Page hp;
	CreateAccount_Page cp;
	Category_Page cap;
	
	@BeforeMethod
	public void setup()	{
		Base.start();
		hp=new Home_Page();
	}
	
	@Test(enabled=false)
	public CreateAccount_Page goToCreateAccount()
	{
		
		hp.goToCreateAccountPage();
		cp=new CreateAccount_Page();
		Assert.assertEquals(cp.verifyTitle() , "JTV - Jewelry, Diamonds, Gemstones, Rings, Necklaces, Earrings");
		return cp;
	}
	
	
	@Test(enabled=false)
	public Category_Page goingToCategoryPage()
	{
	   hp.goToCategoryPage();
	   cap=new Category_Page();
	   Assert.assertEquals(cap.verifyTitle(),"Clearance Jewelry | J.com");
	   return cap;
	}
	
	@Test
	public void clickfooterlink()
	{
		hp.footerLinks();
	}


}

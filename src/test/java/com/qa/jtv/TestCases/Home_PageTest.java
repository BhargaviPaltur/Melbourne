package com.qa.jtv.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jtv.base.Base;
import com.qa.jtv.pages.Home_Page;

public class Home_PageTest extends Base {
	Home_Page hp;
	
	@BeforeMethod
	public void setup()	{
		Base.start();
		hp=new Home_Page();
	}
	
	@Test
	public void goToCreateAccount()
	{
		
		hp.goToCreateAccountPage();
	}

}

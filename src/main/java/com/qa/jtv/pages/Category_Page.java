package com.qa.jtv.pages;

import com.qa.jtv.base.Base;

public class Category_Page extends Base{
	Home_Page hp;
	
	
	public String verifyTitle()
	{
		String t=driver.getTitle();
		return t;
	}

}

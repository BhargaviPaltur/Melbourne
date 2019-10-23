package com.qa.jtv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.jtv.base.Base;

public class Shipping_Address extends Base{
	
	@FindBy(xpath="//select[@name='/atg/userprofiling/ProfileFormHandler.value.country']") WebElement country;
	
	public Shipping_Address()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectCountry(String c)
	{
		Select sel=new Select(country);
		sel.selectByValue(c);
	}

}

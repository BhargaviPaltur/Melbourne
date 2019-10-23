package com.qa.jtv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.Base;

public class Account_landing extends Base {
	
	@FindBy(xpath="//div[@class='account-content']/div[4]//a[contains(text(),'Manage Addresses')]")WebElement address;
	
	public Account_landing()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddress()
	{
		address.click();
	}

}

package com.qa.jtv.pages;

import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.Base;

public class Login_Page extends Base {
	
	@FindBy(xpath="//a[contains(text(),'Sign in to see your information')]") WebElement signIn;
	@FindBy(xpath="//div[@class='account-menu']")WebElement w;
	@FindBy(xpath="//input[@type='email']") WebElement email;
	@FindBy(xpath="//input[@type='password']") WebElement password;
	@FindBy(xpath="//input[@type='submit']") WebElement signInButton;
	
	public Login_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void login(String e, String p) {
		email.sendKeys(e);
		password.sendKeys(p);
		signInButton.click();
		
	}

}

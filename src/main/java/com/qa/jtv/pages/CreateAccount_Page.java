package com.qa.jtv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.Base;

public class CreateAccount_Page extends Base {
Home_Page hp;

@FindBy(xpath="//input[@id='firstName']") WebElement fn;
@FindBy(xpath="//input[@id='lastName']") WebElement ln;
@FindBy(xpath="//input[@id='email']") WebElement email;
@FindBy(xpath="//input[@id='user.attributes.phoneNumber']") WebElement phone;
@FindBy(xpath="//input[@id='password']") WebElement pass;
@FindBy(xpath="//input[@id='password-confirm']") WebElement cpass;
@FindBy(xpath="//input[@value='Create Account']") WebElement createButton;

public CreateAccount_Page()
{
	PageFactory.initElements(driver,this);
}

	
	
	public String verifyTitle()
	{
		String t=driver.getTitle();
		return t;
	}
	
	//public void createUser(String fn1, String ln1, String email1, String phone1, String pass1, String cpass1)
	



	public void createUser(String fn2, String ln2, String email2, String phone2, String pass2, String cpass2) {
		{
			fn.sendKeys(fn2);
			ln.sendKeys(ln2);
			email.sendKeys(email2);
			phone.sendKeys(phone2);
			pass.sendKeys(pass2);
			cpass.sendKeys(cpass2);
			createButton.click();
			
		}
		
	}
	

}

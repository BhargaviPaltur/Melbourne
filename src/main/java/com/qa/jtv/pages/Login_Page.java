package com.qa.jtv.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	@FindBy(xpath="//input[@id='modal-email']") WebElement modalEmail;
	@FindBy(xpath="//input[@value='Subscribe' and @tabindex='2']") WebElement subscribeButton;
	
	public Login_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTitle()
	{
		String s=driver.getTitle();
		return s;
	}
	
	
	public void login(String e, String p) {
		email.sendKeys(e);
		password.sendKeys(p);
		signInButton.click();
		try {
		    Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public void singleLogin()
	{
		email.sendKeys("aaa@gmail.com");
		password.sendKeys("password123");
		signInButton.click();
		try {
		    Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public void emailSignup(String em, String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		signInButton.click();
		modalEmail.sendKeys(em);	
		subscribeButton.click();
		try {
		    Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

package com.qa.jtv.pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.Base;
public class Home_Page extends Base {	
	public Home_Page()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@class='account-menu']")WebElement w;
	@FindBy(xpath="//a[text()='Create an Account']") WebElement createAccount;
	
	public void getPageTitle()
	{
		String s= driver.getTitle();
		System.out.println(s);
	}
	
	public void goToCreateAccountPage()
	{
		try {
		int x= (w.getLocation().getX());
		int y= (w.getLocation().getY());
		Robot r=new Robot();
	    r.mouseMove(x+20,y+130);
		driver.switchTo().activeElement();
		createAccount.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
package com.qa.jtv.pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.BaseClass;


public class HomePage extends BaseClass {

	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="//div[@class='account-menu']")
	WebElement w;
	
	
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
		driver.findElement(By.xpath("//a[text()='Create an Account']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}

package com.qa.jtv.pages;

import java.awt.AWTException;
import java.awt.List;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.jtv.base.Base;
public class Home_Page extends Base {	
	
	@FindBy(xpath="//a[contains(text(),'Sign in to see your information')]") WebElement signIn;
	@FindBy(xpath="//div[@class='account-menu']")WebElement w;
	@FindBy(xpath="//a[text()='Create an Account']") WebElement createAccount;
	@FindBy(xpath="//a[@href='/clearance/_/N-2619281658']") WebElement clearance;
	@FindBy(xpath= "//nav[@aria-label='Main']/ul/li[6]/div[2]/ul/li/div/section/ul/li/a") WebElement jewelry;
	@FindBy(xpath="//button[@id='facet-title-price_range']/span[@class='icon icon-plus']") WebElement plusButton;
	@FindBy(xpath= "//div[@data-dim='price_range']/div")WebElement price;
	@FindBy(xpath="//div[@class='modal-close']") WebElement modalClose;
/*
	   @FindBys({
		@FindBy(how=How.XPATH, using="//div[@data-dim='price_range']/div[1]"),
		@FindBy(how=How.ID, using="//div[@data-dim='price_range']/div[2]"),
		@FindBy(how=How.NAME, using="//div[@data-dim='price_range']/div[3]"),
		@FindBy(how=How.CLASS_NAME, using="//div[@data-dim='price_range']/div[4]"),
		@FindBy(how=How.CSS, using="//div[@data-dim='price_range']/div[5]"),
		@FindBy(how=How.TAG_NAME, using="//div[@data-dim='price_range']/div")
	})
	private List<WebElement> priceranges;
	*/
	public Home_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getPageTitle()
	{
		String s= driver.getTitle();
		return s;
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
	public void goToLoginPage()
	{
		try 
		{
		int x= (w.getLocation().getX());
		int y= (w.getLocation().getY());
		Robot r=new Robot();
	    r.mouseMove(x+20,y+130);
		driver.switchTo().activeElement();
		signIn.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void goToCategoryPage()
	{
		
		try {
		Robot r = new Robot();
			r.mouseMove(clearance.getLocation().getX()+20, clearance.getLocation().getY()+130);
			driver.switchTo().activeElement();
			jewelry.click();
			
			
			 r.keyPress(KeyEvent.VK_ESCAPE);
			 r.keyRelease(KeyEvent.VK_ESCAPE);
			 
			//modalClose.click();
			plusButton.click();
			//if(price.getAttribute("data-id").contains("$100---$200-price_range"))
			price.click();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
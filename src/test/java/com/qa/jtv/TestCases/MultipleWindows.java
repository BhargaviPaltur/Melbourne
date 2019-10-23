package com.qa.jtv.TestCases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	WebDriver driver;
	Set<String> whs; String parent;

	@BeforeMethod
	public void multipleWindow()
	{
	System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");	
	 driver = new ChromeDriver();

driver.get("https://www.naukri.com");
 parent = driver.getWindowHandle();
 whs = driver.getWindowHandles();
	}

@Test(enabled=false)
public void multipleWin()
{
for(String child:whs)
{
	
	if(!parent.equals(child))
	{
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
	}
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
         }
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
          driver.close();

}
	@Test
	public void getWin()
	{
		ArrayList<String> list=new ArrayList(whs);
		for(int i=0; i< list.size();i++)
		{
			driver.switchTo().window(list.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			
		}
	}
}
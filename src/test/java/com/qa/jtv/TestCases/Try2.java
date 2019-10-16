package com.qa.jtv.TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Try2 {
	
	@Test
	public void multipleWindow()
	{
	System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();

driver.get("https://www.naukri.com");
String parent = driver.getWindowHandle();
Set<String> whs = driver.getWindowHandles();
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
}
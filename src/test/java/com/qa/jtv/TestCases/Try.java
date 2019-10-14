package com.qa.jtv.TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Try {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.jtv.com");
		driver.manage().window().maximize();
		
		WebElement e= driver.findElement(By.xpath("//a[@href='/clearance/_/N-2619281658']"));
		Robot r= new Robot();
		r.mouseMove(e.getLocation().getX()+20, e.getLocation().getY()+130);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//nav[@aria-label='Main']/ul/li[6]/div[2]/ul/li/div/section/ul/li/a")).click();
		driver.findElement(By.xpath("//button[@id='facet-title-price_range']/span[@class='icon icon-plus']")).click();
		//driver.findElement(By.xpath("//label[@for='Under-$25-price_range']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//div[@data-dim='price_range']/div"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			WebElement we= l.get(i);
			System.out.println("normal for loop= "+we.getAttribute("data-id"));
			
		}
		
		for(WebElement w:l)
		{			
			System.out.println("for each loop= "+w.getAttribute("data-id"));
			if(w.getAttribute("data-id").contains("$100---$200-price_range"))
			{
				w.click();
			}		
		}
		
		

	}

}

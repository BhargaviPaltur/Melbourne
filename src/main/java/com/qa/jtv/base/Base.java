package com.qa.jtv.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	
	public Base() 
	{
		
		
		try {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("C:\\Melbourne\\Melbourne\\src\\main\\java\\com\\qa\\jtv\\base\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public static void start()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webDriver.gecko.driver","./driver/firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}

}

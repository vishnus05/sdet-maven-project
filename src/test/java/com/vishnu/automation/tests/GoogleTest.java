package com.vishnu.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleTest {
	
	@Test
	
	public void openGoogleAndCheckTitle()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		WebDriver driver=new ChromeDriver(options);
		
		try
		{
			driver.get("https://www.google.com");
			String title=driver.getTitle();
			System.out.println("Page Title is "+title);
			Assert.assertTrue(title.toLowerCase().contains("google"));
			
		}finally {
			driver.quit();
		}
	}

}

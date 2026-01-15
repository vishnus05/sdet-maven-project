package com.vishnu.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleTest {
	
	@Test
	
	public void openGoogleAndCheckTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
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

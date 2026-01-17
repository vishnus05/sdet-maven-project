package com.vishnu.automation.base;
import com.vishnu.automation.utils.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();	
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("---headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--window-size=1920-1080");
		
		driver =new ChromeDriver(options);
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtil.takeScreenshot(driver, result.getName());
		}
		
		if(driver !=null)
		{
			driver.quit();
		}
			
		
	}
	

}

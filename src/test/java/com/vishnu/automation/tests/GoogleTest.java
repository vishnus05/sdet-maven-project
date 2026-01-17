package com.vishnu.automation.tests;

import com.vishnu.automation.base.BaseTest;
import com.vishnu.automation.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {
	
	@Test
	public void openGoogleAndCheckTitle()
	{
		GooglePage google=new GooglePage(driver);
		google.open();
		
		String title=google.getTitle();
		System.out.println("The Title is "+title);
		
		Assert.assertTrue(title.toLowerCase().contains("google"));

		}
}

package com.vishnu.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.nio.file.Files;

public class ScreenshotUtil {
	
	
	public static void takeScreenshot(WebDriver driver,String testName)
	{
	   try
	   {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destDir=new File("targets/Screenshots");
		destDir.mkdir();
		
		File dest=new File(destDir, testName+".png");
		
		Files.copy(src.toPath(), dest.toPath());
	   }
	   catch(Exception e)
	   {
		   System.out.println("Failed to capture Screenshots: "+e.getMessage());
	   }
		
		
	
	
	}
}

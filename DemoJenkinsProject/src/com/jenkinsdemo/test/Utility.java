package com.jenkinsdemo.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String ScreenshotName) throws IOException
	{
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Palliumskills\\AutomationScreenshot\\TestNgAssignmentsLogin\\"+ScreenshotName+".png"));
		System.out.println("Screenshots sucessfully taken");
		
	}
}

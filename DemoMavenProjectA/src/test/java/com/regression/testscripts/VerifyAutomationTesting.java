package com.regression.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.test.HomePage;
import com.utility.test.BrowserFactory;



public class VerifyAutomationTesting {
	
	/*@Test
	public void verifyRegister()
	{
		WebDriver driver1=BrowserFactory.startBrowser("Chrome", "http://practice.automationtesting.in/");
		
		HomePage home_page=PageFactory.initElements(driver1, HomePage.class);
		
		home_page.clickOnMyAccountButton();
		
		
		
	}*/
	
		@Test
		public void verifyRegister()
		{
			WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://practice.automationtesting.in/");
			HomePage home_page=PageFactory.initElements(driver, HomePage.class);
			home_page.clickOnMyAccountButton();
			
			
		}
	
	

}

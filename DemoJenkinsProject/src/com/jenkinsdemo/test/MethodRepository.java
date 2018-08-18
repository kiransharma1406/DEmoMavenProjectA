package com.jenkinsdemo.test;


	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MethodRepository {public static WebDriver driver;

	public void browserAppLaunch() throws IOException
	{
		
		System.out.println("Jenkins Installation and project setup is done and its working");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Palliumskills\\AutomationTesting\\Tools\\NewChrom\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		Utility.captureScreenshot(driver, "Browser Launch");
	}

	public void validLogin() throws InterruptedException, IOException
	{
		
		WebElement uName=driver.findElement(By.xpath("//input[@name='userName']"));
		uName.sendKeys("dasd");
		
		Utility.captureScreenshot(driver, "Id");
		
		WebElement uPassword=driver.findElement(By.xpath("//input[@name='password']"));
		uPassword.sendKeys("dasd");
		
		Utility.captureScreenshot(driver, "Password");
		
		WebElement uSign=driver.findElement(By.xpath("//input[@name='login']"));
		uSign.click();
		
		Utility.captureScreenshot(driver, "Valid Login");
		
		Thread.sleep(5000);
	}
		
	public boolean verifiedValidLogin()
	{
		
		String expectedtitle= "Find a Flight: Mercury Tours:";
		String actualtitle= driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			//System.out.println("PASS");
			return true;
		}
		else
		{
			//System.out.println("FAIL");
			return false;
		}
	}

	public void appClose()
	{
		
		driver.close();
		
	}

	public void invalidLogin() throws IOException, InterruptedException
	{
		
		WebElement uName=driver.findElement(By.xpath("//input[@name='userName']"));
		uName.sendKeys("dasd");
		
		Utility.captureScreenshot(driver, "Wrong id");
		
		WebElement uPassword=driver.findElement(By.xpath("//input[@name='password']"));
		uPassword.sendKeys("dass");
		
		Utility.captureScreenshot(driver, "Wrong Password");
		
		WebElement uSign=driver.findElement(By.xpath("//input[@name='login']"));
		uSign.click();
		
		Utility.captureScreenshot(driver, "Invalid Login");
		
		Thread.sleep(3000);

	}

	public boolean verifiedInvalidLogin()
	{
		String expectedtitle= "Sign-on: Mercury Tours";
		String actualtitle= driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			//System.out.println("PASS");
			return true;
		}
		else
		{
			//System.out.println("FAIL");
			return false;
		}
	  }

	public void nevigateBack() throws IOException
	{
		driver.navigate().back();
		
		Utility.captureScreenshot(driver, "Get Back to the Page");
		
	}

	}


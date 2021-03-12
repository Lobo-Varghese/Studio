package com.asg.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class browserutility {
public static WebDriver driver;
	public static void OpenBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("http://localhost:3030/projects");
		driver.manage().window().maximize();
		Thread.sleep(15000);
	
		
	}
	
	public void OpenProject(String arg1) throws Exception
	{
	    WebElement enterinsearch=driver.findElement(By.id("input-search"));
	    enterinsearch.clear();
	    enterinsearch.sendKeys(arg1);
	    Thread.sleep(4000);
	    WebElement openproject=driver.findElement(By.xpath("//td[text()='"+arg1+"']"));
		Actions acc=new Actions(driver);
		Thread.sleep(4000);
		acc.doubleClick(openproject).build().perform();
		Thread.sleep(4000);
	}
	
	
}

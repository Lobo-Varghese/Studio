package com.asg.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Screenshots extends browserutility {

	public static void highlightandtakescreenshot(WebElement name) throws IOException, InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		jse.executeScript("arguments[0].setAttribute('style','border: 2px solid red');",name);
		Thread.sleep(4000);
		// Take a ScreenShot and set the output as FILE type
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// store the screenshot to your local machine
		Date d=new Date();
		long time=d.getTime();
		FileUtils.copyFile(scrFile, new File("./Screenshots/screenshot_"+timestamp()+".png"), true);
	}
	
	
	public static String timestamp()
	{
		Date d=new Date();
		SimpleDateFormat sdp=new SimpleDateFormat("yyyyMMddHHmmss");
		String name=sdp.format(d);
		System.out.println(name);
		return name;
	}
}

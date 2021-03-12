package com.asg.utility;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	
	
	@Test
	public static void report(String name,String feature,String desc) throws IOException {
		System.out.println("Hello");
	ExtentHtmlReporter report=new ExtentHtmlReporter("./target/uimodel.html");
	ExtentReports er=new ExtentReports();
	er.attachReporter(report);
	ExtentTest logger= er.createTest(feature,desc);		
	logger.log(Status.INFO, name);
	logger.addScreenCaptureFromPath("./Screenshots/screenshot.png");
	er.flush();
	}
}

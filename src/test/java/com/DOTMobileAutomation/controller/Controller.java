package com.DOTMobileAutomation.controller;

import com.DOTMobileAutomation.utilities.AndroidSetup;
import com.DOTMobileAutomation.utilities.Report;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Controller {
	public static RemoteWebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  Report.StartTest();
	  Report.AuthorName();
	  AndroidSetup.launchApp();
	  test.log(LogStatus.PASS, "App launched successfully");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  AndroidSetup.closeApp();
	  test.log(LogStatus.FAIL, "App closed successfully");
	  Report.EndTest();
  }

  @BeforeSuite
  public void beforeSuite() {
	  Report.Reports();
	  
  }

  @AfterSuite
  public void afterSuite() {
	  Report.Flush();
	  Report.Close();
  }

}

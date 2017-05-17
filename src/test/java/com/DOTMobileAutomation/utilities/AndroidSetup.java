package com.DOTMobileAutomation.utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.DOTMobileAutomation.controller.Controller;
import com.DOTMobileAutomation.testdata.TestData;

public class AndroidSetup extends Controller {
	 
	  public static void launchApp() throws MalformedURLException {
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", TestData.DeviceName);
		  cap.setCapability("browserName", "");
		  cap.setCapability("platformName", TestData.PlatformName); 
		  cap.setCapability("version", TestData.Version); //Mobile O.S. version
		  cap.setCapability("appiumVersion", TestData.AppiumVersion); //Appium Version
		  
		  cap.setCapability("appPackage", TestData.AppPackage); //Package Name
		  cap.setCapability("appActivity", TestData.AppActivity); //Activity Name
		  cap.setCapability("app", TestData.App); //app name
		  cap.setCapability( "appWaitActivity", TestData.AppWaitActivity);
//		   AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);		   
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	  }


	  public static void closeApp() throws InterruptedException {
		 Thread.sleep(2000);
		  driver.quit();
	  }
}

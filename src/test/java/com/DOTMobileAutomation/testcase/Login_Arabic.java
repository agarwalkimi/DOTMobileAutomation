package com.DOTMobileAutomation.testcase;

import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.DOTMobileAutomation.controller.Controller;
import com.DOTMobileAutomation.testdata.TestData;

public class Login_Arabic extends Controller{
	 @Test
	  public void login_Arabic() throws FileNotFoundException {
		 
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_sign_in")).click();
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_arabic")).click();   
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_email_login")).sendKeys(TestData.email);
		driver.navigate().back();
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_password_login")).sendKeys(TestData.password);
		driver.navigate().back();
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_login_submit")).click();
	 }
}

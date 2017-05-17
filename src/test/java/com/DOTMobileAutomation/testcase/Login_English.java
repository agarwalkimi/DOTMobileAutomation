package com.DOTMobileAutomation.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DOTMobileAutomation.objectrepository.loginScreen;
import com.DOTMobileAutomation.testdata.TestData;
import com.DOTMobileAutomation.utilities.AndroidSetup;

public class Login_English extends AndroidSetup{

	  @Test
	  public void login_English() throws InterruptedException {
		 
		  loginScreen ls = new loginScreen();
		  WebElement signInBtn = ls.getLoginBtn(driver);
		  WebElement englishBtn = ls.getEnglishBtn(driver);
		  WebElement email = ls.getEmail(driver);
		  WebElement password = ls.getPassword(driver);
		  WebElement loginBtn = ls.getLoginBtn(driver);
		  signInBtn.click();
		  Thread.sleep(1000);
		  englishBtn.click();
		  email.sendKeys(TestData.email);
			driver.navigate().back();
		  password.sendKeys(TestData.password);
		  driver.navigate().back();
		  loginBtn.click();
/*		  driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_sign_in")).click();
		   driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_english")).click();
		   
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_email_login")).sendKeys(TestData.email);
		driver.navigate().back();
		

		driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_password_login")).sendKeys(TestData.password);
		driver.navigate().back();
		driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_login_submit")).click();*/
	  }
	  
}

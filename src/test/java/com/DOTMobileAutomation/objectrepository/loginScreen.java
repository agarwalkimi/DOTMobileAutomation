package com.DOTMobileAutomation.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginScreen {

	public WebElement getSignInBtn(WebDriver driver)
	{
		WebElement signInBtn = driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_sign_in"));
		return signInBtn;
	}
	public WebElement getEnglishBtn(WebDriver driver)
	{
		WebElement englishBtn = driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_english"));
		return englishBtn;
	}
	public WebElement getEmail(WebDriver driver)
	{
		WebElement email = driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_email_login"));
		return email;
	}
	public WebElement getPassword(WebDriver driver)
	{
		WebElement password = driver.findElement(By.id("dotrips.com.dotrips.qa:id/editText_password_login"));
		return password;
	}
	public WebElement getLoginBtn(WebDriver driver)
	{
		WebElement loginBtn = driver.findElement(By.id("dotrips.com.dotrips.qa:id/button_login_submit"));
		return loginBtn;
	}
}

package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPass;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String title()
	{
		return driver.getTitle();
	}
	
	public void Login()
	{
		userEmail.sendKeys(prop.getProperty("username"));
		userPass.sendKeys(prop.getProperty("password"));
		LoginButton.click();
		
	}
}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		TestBase ab = new TestBase();
//		ab.initialization();
//		
//		LoginPage aa = new LoginPage();
//		aa.title();
//		aa.Login();
//
//	}
//
//}

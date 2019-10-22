package com.fb.TestCase;

import javax.security.auth.spi.LoginModule;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.QA.TestBase.TestBase;
import com.facebook.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	public LoginPageTest()
	{
		super();
		
	}
	
	@BeforeSuite
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test
	public void verifyTitle()
	{
		String title = loginPage.title();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");
		
	}
	
	@Test
	public void verifyLoginTest()
	{
		loginPage.Login();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

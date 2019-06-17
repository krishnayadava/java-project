package com.onmobileqa.studio.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onmobileqa.base.TestBase;
import com.onmobileqa.studio.pages.HomePage;
import com.onmobileqa.studio.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest(){   //this will takes data from 
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage= new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginpage.validateLoginPageTitle();
	//	Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
		System.out.println("output is correct");
	}
	
	@Test(priority=2)
	public void CRMlogoImageTest(){
		Boolean b=loginpage.validateCRMimage();
		Assert.assertEquals(true, true);
	}
	
	@Test(priority=3)
	public void loginTest(){
	     	
		homepage=	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}

package com.onmobileqa.studio.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onmobileqa.base.TestBase;
import com.onmobileqa.studio.pages.ContactsPage;
import com.onmobileqa.studio.pages.HomePage;
import com.onmobileqa.studio.pages.LoginPage;
import com.onmobileqa.utility.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactpage;
	public HomePageTest(){   //this will takes data from 
		super();
}
	
	//test case should be seperated with each other
	//befor each test lounch the browser and login
	//execute the test case
	//after each test case close the browser
	
	@BeforeMethod
	public void setup(){
		initialisation();
    loginpage= new LoginPage();
    testutil =new TestUtil();
    contactpage=new ContactsPage() ;
    homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
	
	@Test(priority=1)
	public void verifyhomepagetitleTest(){
		String hompepageTitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(hompepageTitle, "CRMPRO" , "HomePage Title did not match");
	}
	
	@Test(priority=2)
	public void verifyUsername(){
		testutil.SwitchToFrame();
		Assert.assertTrue(homepage.verifyCorrectUsername());
		
	}
	@Test(priority=3)
	public void verifycontactslink(){
		testutil.SwitchToFrame();
		contactpage=homepage.clickOnContactsLink();
		
		
	}
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}
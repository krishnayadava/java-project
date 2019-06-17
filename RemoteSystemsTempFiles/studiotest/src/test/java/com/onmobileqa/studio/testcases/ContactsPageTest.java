package com.onmobileqa.studio.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onmobileqa.base.TestBase;
import com.onmobileqa.studio.pages.ContactsPage;
import com.onmobileqa.studio.pages.HomePage;
import com.onmobileqa.studio.pages.LoginPage;
import com.onmobileqa.utility.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactpage;
	String sheetname="contacts";
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialisation();
    loginpage= new LoginPage();
    testutil =new TestUtil();
    contactpage=new ContactsPage() ;
    homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    testutil.SwitchToFrame();
    contactpage=homepage.clickOnContactsLink();
    
    }
	
//	@Test(priority=1)
//	public void contactTest(){
//		Assert.assertTrue(contactpage.verifycontactPage(), "contact label is missing on the page");
//	}

//	@Test(priority=2)
//	public void selectConactByname(){
//		contactpage.SelectContactsByname("KrishnaAA yadav");	
//	}
	
	
	@Test(dataProvider="getTestData")
	public void validateNewContact() throws IOException{
		homepage.clickOnNewContacts();
		
		Iterator<Object[]> object=TestUtil.getTestData();
		
		  
		

		System.out.println(object);
		//contactpage.createNewContact(ob[0].title ft_name, lt_name, company_Name);
		
		
		
		
	}
	
	@AfterMethod
	public void tear(){
		driver.close();
	}
}
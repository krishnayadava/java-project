package com.com.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
@BeforeSuite
public void setup(){
	System.out.println("@BeforeSuite--setting up systemproperty---executed 1st");
}

@BeforeTest
public void lounchbrowser(){
	System.out.println("@BeforeTest--louncing the browser will be executed 2nd");
}

@BeforeClass
public void enterurl(){
	System.out.println("@BeforeMethod--enter url will be executed 4th");
}


@BeforeMethod
public void login(){
	System.out.println("@BeforeCLass--login will be executed 3rd");
}


@Test
public void Searchtext(){
	System.out.println("@Test--Searchtext will be executed 5th");
}

@Test
public void googleLogoTest(){
	System.out.println("googleLogoTest()--googlelogotest will be executed 5th");
}


@AfterMethod
public void logout(){
	System.out.println("@AfterMethod--close browser will be executed 6th");
}

@AfterClass
public void closebrowser(){
	System.out.println("@AfterClass--close browser will be executed 7th");
}

@AfterTest
public void deleteAllcookies(){
	System.out.println("@AfterTests--close browser will be executed 8th");
}

}

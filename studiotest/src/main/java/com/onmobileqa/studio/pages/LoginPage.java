package com.onmobileqa.studio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onmobileqa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	@FindBy(name= "username")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath= "//button[contains(@text(), 'Sign Up')]")
	WebElement SignUp;
	
	@FindBy(xpath= "//img[contains(@class,'img-responsive')]")
	WebElement CRMlogo;
	
	//Now We have to initialse all the obove objects repository
	//so we will initialise webelemnt with the help of pagefactory
	
    //Initialising the page objects
	public LoginPage(){
		                         
		PageFactory.initElements(driver, this); // current class object will be initialse by this driver
		                                                   //all the above elements will be initailase by driver
		                                                  // this=LoginPage.class
		System.out.println("mohan");	
	}
	//Actions:--
	public String validateLoginPageTitle(){
		   return driver.getTitle();	
	}
	
	public boolean validateCRMimage(){
		return CRMlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		driver.manage().window().maximize();
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
	}	
}

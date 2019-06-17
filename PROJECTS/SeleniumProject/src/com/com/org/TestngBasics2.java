package com.com.org;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics2 {

  WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
		}
	
	@BeforeTest
	public void lounchbrowser(){
    driver= new ChromeDriver();  
	}
	
	@BeforeClass
	public void Urlget(){
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	@BeforeMethod
	public void loginPage(){
		String URL =driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("the url is " +URL);
	driver.manage().deleteAllCookies();
    }
	
	@Test(priority=1,groups="mail")
	public void EmailId(){
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yadav11.k.m@gmail.com");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test(priority=2,groups="mail")
	public void passwrd(){
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("uralone123@*.");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test(priority=3,groups="login")
	public void login(){
	driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
//	@AfterMethod
//	public void tearDown(){
//	driver.quit();
//	}
	
}
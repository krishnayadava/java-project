package com.com.org;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleLinkTest {

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
	
	@Test
	public void loginPage(){
	String URL =driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("the url is " +URL);
	driver.manage().deleteAllCookies();
	
	Assert.assertEquals(URL, "https://www.facebook.com");
	
	}
	}
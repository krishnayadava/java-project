package com.com.org;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


     @Test
     public class tedt { 
	
	 static WebDriver w;
	 
	 
	
	 @Test(priority=1,description="open chrome browser")
	   
	    public void Chrmoeopen(){ 
		   System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\Newfolder\\new\\chromedriver.exe");
		 //  WebDriver w= new ChromeDriver();
			
		        
	 //URL access
		    	w.get("http://172.16.5.165:8088/BasicPlatform/html/Login.jsp");
			    w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait
			    String currentUrl= w.getCurrentUrl();
			    Assert.assertTrue(currentUrl.contains("html/Login.jsp"));
			   
	   
	 }
	 //Login credentials
			
	      
	 
	      @Test      //(priority= 2, description="login to with username and password")
		  public void login(){
	    	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\Newfolder\\new\\chromedriver.exe");
	    	  WebDriver w= new ChromeDriver();
	    	     w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	     w.findElement(By.name("username")).sendKeys("admin");
			     w.findElement(By.name("password")).sendKeys("admin");
			     w.findElement(By.id("submit")).click();
			     w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			     Boolean status= w.findElement(By.xpath("//*[@id='pageContainer']/div[1]/div[1]/a")).isDisplayed();
			
			    //   Assert.assertTrue(status); // if this condition is true than only it will pass
		}
}
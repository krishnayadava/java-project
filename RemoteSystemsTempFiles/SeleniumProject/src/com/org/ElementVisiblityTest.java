package com.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblityTest {
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		Boolean b=  driver.findElement(By.id("submitButton")).isDisplayed();
		
	    System.out.println(b);
		
	    Boolean p=  driver.findElement(By.id("submitButton")).isEnabled();
	     
	    System.out.println(p);
	    
	    Boolean q=  driver.findElement(By.name("agreeTerms")).isSelected();
	    		
	    System.out.println(p);
	    
	    driver.close();
	    
	}
	
}
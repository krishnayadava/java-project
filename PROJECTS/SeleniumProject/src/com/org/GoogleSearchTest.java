package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
	
	public static void main (String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
		

		//WebDriver w= new ChromeDriver(); //for lounching browser

WebDriver w = new ChromeDriver(); 

		// Webdriver is an interface which contains some function which are implemented in chrome driver class 
	
	   // Step 2--- Enter the URL
		
		
	   w.get("https://www.google.co.in//");
		 
	  // Step 3--- Search for the text box
		
		//handle text
		 w.findElement(By.id("lst-ib")).sendKeys("selenium");
		// w.switchTo().frame("foo"); 
		 //handle buttom
		 WebDriverWait wait = new WebDriverWait (w, 50);
		// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")));
		 
		 w.findElement(By.name("btnK")).click();
		// w.findElement(By.xpath( //*[@id="tsf"]/div[2]/div[3]/center/input[1]));
	    
	}
}

package com.org;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CopyAndPaste {
		

			
			public static void main(String[]args) throws InterruptedException{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
				
				  WebDriver  w= new ChromeDriver();
				  
				  w.get("https://www.google.com/advanced_search");
				  
				  w.findElement(By.id("xX4UFf")).sendKeys("hi rock star");
				  
				  w.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
				  
				  w.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
				  
				  
				  w.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"v");
				  
				  w.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
				  
				  w.findElement(By.id("t2dX1c")).sendKeys(Keys.CONTROL+"v");
				  
				  
				  
				  
				  

}}

package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwordSimulation {
	
	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
	driver.navigate().to("https://www.youtube.com/");
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
}
}
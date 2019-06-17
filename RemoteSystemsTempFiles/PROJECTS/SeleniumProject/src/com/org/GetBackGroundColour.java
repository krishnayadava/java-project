package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GetBackGroundColour {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		
		w.get("https://www.google.com");

		
	   String s= w.findElement(By.id("btnK")).getCssValue("background-colour");	
	   System.out.println(s);
	}
}

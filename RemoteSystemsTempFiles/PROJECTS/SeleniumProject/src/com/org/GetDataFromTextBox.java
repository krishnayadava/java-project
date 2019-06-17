package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromTextBox {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		
		w.get("https://www.google.com/advanced_search");
		
		
		//get data from text boox
		w.findElement(By.id("xX4UFf")).sendKeys("krishna");
		
		String s=w.findElement(By.id("xX4UFf")).getAttribute("value");
		
		System.out.print(s);
	}

}

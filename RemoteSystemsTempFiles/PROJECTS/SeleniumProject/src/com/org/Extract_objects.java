package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Extract_objects {
	
	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");	
		WebDriver w= new ChromeDriver();
		
		w.get("https://www.w3schools.com/html/html_tables.asp");
		
		String name=w.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]")).getText();
		System.out.print(name);
	}

}

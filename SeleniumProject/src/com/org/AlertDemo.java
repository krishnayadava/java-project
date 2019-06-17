package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertDemo {
	
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
		
		  WebDriver  w= new ChromeDriver();  //lounch the driver
		  
		  // Alert mtlb agar kuch select nhi krte to bolte please select given field
		  
		  w.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		  
		  //click on search buttom
		  w.findElement(By.xpath("//*[@id='sampleform']/table/tbody/tr[10]/td/input")).click();
		  
		  
		  //it consist either two of things OK or cancel
		  // for OK
		//  w.switchTo().alert().accept();
		  
		  //for Cancel
		  
		  w.switchTo().alert().dismiss();
		  
		 String s= w.getCurrentUrl();
		 System.out.println(s);
		  
		  String p= w.getWindowHandle();
		  
		  System.out.println(p);
		  
		  //enter the city
		 // w.findElement(By.id("src")).sendKeys("Hyderabad");
		  
	}

}

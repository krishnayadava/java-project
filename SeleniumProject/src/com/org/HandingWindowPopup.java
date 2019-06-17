package com.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingWindowPopup {
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]"  )).click();
		
		Set<String> id =driver.getWindowHandles(); //ID will store all the window id
				
		Iterator<String> iterator = id.iterator();  //ID ko iterate krk daal diya
		
		String ParentId=iterator.next();
		
		System.out.println("Parent id is" +ParentId); //Will print parent id
		
		String ChildId=iterator.next();
		
		System.out.println("Child id is" +ChildId); //Will print parent id
		
		driver.switchTo().window(ChildId);
		
		System.out.println("titel is " +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentId);
	}

}

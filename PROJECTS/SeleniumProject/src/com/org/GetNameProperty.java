package com.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class GetNameProperty {
		
		public static void main(String[]args) throws InterruptedException{
			
			
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
			WebDriver w= new ChromeDriver();
			
			w.get("https://www.google.com/advanced_search");
			
			
			//get first webdriver name property
			Thread.sleep(500);
			String s= w.findElement(By.id("logo")).getAttribute("title");
			System.out.println(s);
		}

	}



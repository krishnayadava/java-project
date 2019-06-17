package com.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDownHandle {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	
	   List<WebElement> values= driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	   

	   
	   for(int i=0; i<values.size(); i++){
		   
		System.out.println(values.get(i).getText());
		
		if(values.get(i).getText().contains("Java")){
			
			values.get(i).click();
		}
		   
	   }
	   
	
	}
	

}

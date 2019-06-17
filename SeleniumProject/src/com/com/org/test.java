package com.com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		driver=new ChromeDriver();

        String baseUrl = "http://172.19.113.36:8080/esp/";
        String actualTitle = "";
        driver.get(baseUrl);//

        driver.findElement(By.id("username")).sendKeys("milind.kulkarni@onmobile.com");
      //  Thread.sleep(10000);

        driver.findElement(By.id("pass")).sendKeys("admin");
        //Thread.sleep(10000);

        driver.findElement(By.id("Login")).click();
        Thread.sleep(10000);

        
        


      //  actualTitle = driver.getTitle();
        
        try{
       // driver.findElement(By.id("signOut")).click();  
        Select dropdown = new Select(driver.findElement(By.id("signOut")));
        
        //Select dropdown = new Select(driver.findElement(By.id("Logout")));
        
        dropdown.selectByValue("Logout");
        }
        catch(Exception ex){
        	System.out.println("not able to logout");
        	ex.printStackTrace();
        }
        
        Thread.sleep(2000);
       // driver.findElement(By.name("Logout")).click();
        

        System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        
        Thread.sleep(3000);
        driver.quit();

        System.exit(0);

	}

}

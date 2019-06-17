package com.org;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class DownloadingFile {
		
		public static void main(String[]args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
			
			  WebDriver  w= new ChromeDriver();
			
			w.get("https://www.google.com/");
			
			w.findElement(By.id("lst-ib")).sendKeys("java download");
       
			w.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
			
			Thread.sleep(400);
			
			w.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
			
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/a/span")).click();
			
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/a/span")).click();
			
			
			
}
}
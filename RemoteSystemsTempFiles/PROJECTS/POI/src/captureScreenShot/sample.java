package captureScreenShot;

	import java.io.File;
import java.io.IOException;

	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Screenshotlibrary.Utility;
	public class sample {

		
		
		@Test
		public void captureShreenShot(){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromeDriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			driver.get("https://www.facebook.com/");
			Utility.captureScreenshot(driver, "fblogin");			
			
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yadav11.k.m@gmail.com");
			Utility.captureScreenshot(driver, "email entered");
			
			
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("uralone123@*.");
			Utility.captureScreenshot(driver, "paswrd entered");
			
			
			driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
			Utility.captureScreenshot(driver, "clicked on login");
			
					
			System.out.println("screen shot taken");
			
		}

	}




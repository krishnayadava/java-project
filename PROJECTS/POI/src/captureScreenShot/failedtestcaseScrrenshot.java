package captureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Screenshotlibrary.Utility;

public class failedtestcaseScrrenshot {
	
	
	WebDriver driver;
	
	@Test
	public void scrrenshot(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "fblogin");			
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yadav11.k.m@gmail.com");
		Utility.captureScreenshot(driver, "email entered");
		
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("uralone123@*.");
		Utility.captureScreenshot(driver, "paswrd entered");
		
		
		driver.findElement(By.xpath("//*[@id='u_0']")).click();
		Utility.captureScreenshot(driver, "clicked on login");
		
		
		
	}
	
	@AfterMethod
	public void failedtest(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			
		Utility.captureScreenshot(driver, result.getName());	
			
			
		}
		
	}

}

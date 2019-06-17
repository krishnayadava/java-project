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

public class facebookApp {
	
	
	@Test
	public void captureShreenShot(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yadav11.k.m@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("uralone123@*.");
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("./Scrrenshots/facebook.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("screen shot taken");
		
	}

}

package com.onmobileqa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.onmobileqa.utility.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){  //constructor is defined here
		
		prop= new Properties();
		
		
			try {
				FileInputStream ip= new FileInputStream("D:\\study\\QA\\studiotest\\src\\main\\java\\com\\onmobileqa\\configproperties\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}



public static void initialisation(){
	      String BrowserName=  prop.getProperty("browser");
	      
	      if(BrowserName.equals("chrome")){
	    	  
	    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
	    	  
	    	  driver = new ChromeDriver();
	      }
	      else if(BrowserName.equals("firefox")){
		    	  
		       System.setProperty("webdriver.gecko.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		    	  
		     driver = new ChromeDriver();
		     driver.manage().window().maximize();
	      }
	  //    driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	      driver.get(prop.getProperty("url"));
}
}
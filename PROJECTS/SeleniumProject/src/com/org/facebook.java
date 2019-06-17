package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
	public static void main(String[] args) {
		
	
	        // declaration and instantiation of objects/variables
	                WebDriver driver ;
	                //System.setProperty("webdriver.gecko.driver","C:\\Users\\deepika.kp\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	                //DesiredCapabilities dc = DesiredCapabilities.firefox();
	                // dc.setCapability("marionette", true);
	                System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
	                 
	                  driver = new ChromeDriver();
	         //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	       //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         //Launch website
	       //  driver.navigate().to("https://google.com");
	         
	         //Maximize the browser
	       //  driver.manage().window().maximize();
	         
	                //   WebDriver driver = new FirefoxDriver(dc);
	                //driver = new FirefoxDriver(dc);
	                
	        String baseUrl = "https://www.facebook.com//";
	       // String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);//
	     //   String tagname=driver.findElement(By.id("pass")).getTagName();
	        
	        driver.findElement(By.id("email")).sendKeys("yadav11.k.m@gmail.com");
	        
	        driver.findElement(By.id("pass")).sendKeys("uralone123@*.");
	        
	        driver.findElement(By.id("loginbutton")).click();
	        
	       // System.out.println(tagname);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	       /* if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }*/

	  //close Fire fox
	        driver.quit();

	        // exit the program explicitly
	        System.exit(0);
	    }



}

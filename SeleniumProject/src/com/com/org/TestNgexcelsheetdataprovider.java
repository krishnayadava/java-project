package com.com.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgexcelsheetdataprovider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
		
	    driver= new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
		
	}
	    
	@Test(dataProvider="getTestData")
	public void login(String username, String password){
		
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
	
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
	
	driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	    
	}
	
	@DataProvider
	public static Iterator<Object[]> getTestData() throws IOException{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		
		File src = new File("C:\\Users\\krishna.yadav\\Desktop\\book1.xlsx");
		
		
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
			int rowcount=sheet1.getLastRowNum(); // return total row number
			
			for (int i=0; i<rowcount+1; i++){
				
				String username=sheet1.getRow(i).getCell(0).getStringCellValue();
				String password=sheet1.getRow(i).getCell(1).getStringCellValue();
				System.out.println(username);
				System.out.println(password);
				Object ob[] = {username,password};
				myData.add(ob);
			}
			
			return myData.iterator();
		
		
		
	}
	
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
		
		
	}
	}



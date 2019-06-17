package com.org;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ivr_call_test { 
		
		public static void main(String[]args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\Newfolder\\new\\chromedriver.exe");
			WebDriver w= new ChromeDriver();
			
			//URL access
			
			w.get("http://172.16.5.165:8088/BasicPlatform/html/Login.jsp");
			
			
			//Login credentials
			w.findElement(By.name("username")).sendKeys("admin");
			
			w.findElement(By.name("password")).sendKeys("admin");
			
			w.findElement(By.id("submit")).click();
			
//			//clicking on create new app
			w.findElement(By.linkText("Create New App")).click();
			
			
			Thread.sleep(4000);
			//Using action class constructor for drag and drop
			
			Actions builder= new Actions(w);
			
			
			//finding location of elements
			WebElement start = w.findElement(By.id("widget-start-1"));
			WebElement prompt = w.findElement(By.xpath("//*[@id='prompt']"));
			WebElement drop = w.findElement(By.id("tabs-Page1"));
			WebElement reject=w.findElement(By.id("reject"));
			
			
			//find
			w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			org.openqa.selenium.Point point = start.getLocation();
			int xaxis = point.getX();
			int yaxis = point.getY();
			int y = yaxis + 10;
			int x = xaxis - 20;
			Actions act = new Actions(w);
			builder.clickAndHold(prompt).moveToElement(drop, x, y).release().build().perform();
			
			Thread.sleep(4000);
			w.findElement(By.xpath("//*[@id='widget-prompt-2-table-row-1-input']")).sendKeys("demo.wav");
			builder.clickAndHold(reject).moveToElement(drop, x+3, y+200).release().build().perform();
			
			//Connecting the two widgets
			//start with prompt
			WebElement c1 = w.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
			WebElement c2 = w.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
			act.clickAndHold(c1).moveToElement(c2).release().build().perform();
			
			
			
			
			//prompt with reject
			WebElement c3 = w.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][2]"));
			WebElement c4 = w.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
			act.clickAndHold(c3).moveToElement(c4).release().build().perform(); 
			Thread.sleep(4000);
			 
			//configuring app
			//w.findElement(By.xpath("//*[@id='configureAppBtn']"));;
			//w.findElement(By.id("appSupportedLang"));
			//w.findElement(By.xpath("/html/body/div[37]/div[11]/div/button[1]/span"));
			//Thread.sleep(4000);
			//w.findElement(By.xpath("//span[contains(text(),'Back to App')]"));
			
		    //CONFIGURING APP
			WebElement conf = w.findElement(By.xpath("//span[contains(text(),'Configure App')]"));
			conf.click();
			WebElement lang = w.findElement(By.id("appSupportedLang"));
			lang.click();
			Thread.sleep(40000);
			
			WebElement eng = w.findElement(By.xpath("/html/body/div[38]/div[11]/div/button[1]/span"));
			eng.click();
			WebElement back = w.findElement(By.xpath("//span[contains(text(),'Back to App')]"));
			back.click();
			
			//SAVING APP
			w.findElement(By.xpath("//*[@id='buttonSave']/span[1]")).click();
			w.findElement(By.xpath("//*[@id='canvasSaveBtn']")).click();
			
			
			//PUBLISHING APP
			Thread.sleep(4000);
			w.findElement(By.xpath("//*[@id='buttonPublish']/span[1]")).click();
			w.findElement(By.xpath("//*[@id='canvasDeployBtn']")).click();
			
			Thread.sleep(4000);
			//DOWNLOADING APP
			w.findElement(By.xpath("//*[@id='buttonPublish']/span[1]")).click();
			w.findElement(By.xpath("//*[@id='canvasDeployAndDownloadBtn']")).click();
			w.findElement(By.xpath("/html/body/div[27]/div[11]/div/button[1]/span")).click();
	        		
			 
}
}
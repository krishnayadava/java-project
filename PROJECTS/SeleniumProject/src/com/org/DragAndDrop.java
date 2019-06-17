package com.org;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class DragAndDrop {
		
		public static void main(String[]args){
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
			WebDriver w= new ChromeDriver();
			
            w.get("https://www.jotform.com/build/82716142473456/widget/add/53201a2d6866be393e000028");
            w.manage().window().maximize();
            
 //           new Select(w.findElement(By.xpath("/html/body/div[3]/header/div/div/div[3]/ul/li[4]/a"))).S;
            
            
           
            //Action class ka object bnayeneg w k help se
            Actions builder = new Actions(w);
            
            //Source jaha se uthana hai
            WebElement source= w.findElement(By.xpath("//*[@id='field_item_control_head']/div[2]"));
            
            //destination jaha dalna hai
            WebElement destination= w.findElement(By.id("field_item_control_fullname"));
            
            
            
            
}
}
package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToolTipText {
	
	public static void main(String[]args){
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		
		w.get("https://www.google.com/search?source=hp&ei=yy6vW--5Gdn6rQHarKyYDQ&q=advanced+search&oq=advanced+search&gs_l=psy-ab.3..0l10.445.5135.0.5456.17.12.0.3.3.0.1533.2443.0j2j1j1j8-1.5.0....0...1c.1.64.psy-ab..9.8.2490.0..35i39k1j0i131k1.0.tycoHo5KTJk");
		
		String s= w.findElement(By.id("logo")).getAttribute("title");
		System.out.println(s);
	}

}

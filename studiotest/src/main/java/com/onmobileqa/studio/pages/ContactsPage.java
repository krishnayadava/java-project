package com.onmobileqa.studio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import com.onmobileqa.base.TestBase;
import com.onmobileqa.utility.TestUtil;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	 WebElement contacts;
	
	@FindBy(name="contact_id")
	WebElement contactsid;
	
	@FindBy(name="first_name")
	WebElement firstnamee;
	
	@FindBy(name="surname")
	WebElement lastnamee;
	
	@FindBy(name="client_lookup")
	WebElement companynamee;
	
	@FindBy(xpath="//input[@class='button'][2]")
	WebElement save;
	
	public ContactsPage(){
    PageFactory.initElements(driver, this); // current class object will be initialse by this driver
		                                                   //all the above elements will be initailase by driver
		                                                   // this=LoginPage.class	
    }
	public boolean verifycontactPage(){
		return contacts.isDisplayed();
	}
	
	public void SelectContactsByname(String name){
		contactsid.click();
		
	}
	public void createNewContact(String title, String firstname, String lastname, String companyName){
		Select select=new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstnamee.sendKeys(firstname);
		lastnamee.sendKeys(lastname);
		companynamee.sendKeys(companyName);
		save.click();
		
	}
	
}

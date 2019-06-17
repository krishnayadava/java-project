package com.onmobileqa.studio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onmobileqa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: krishna mohan')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	WebElement NewContact;
	
	@FindBy(xpath="//a[contains(text(), 'Deals']")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks']")
	WebElement TasksLink;
	
	//Initialising the page objects means above elements will be initilase
		public HomePage(){
			                         
			PageFactory.initElements(driver, this); // current class object will be initialse by this driver
			                                                   //all the above elements will be initailase by driver
			                                                   // this=LoginPage.class
			
		}
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
        public ContactsPage clickOnContactsLink(){
        
        	contactsLink.click();
        	return new ContactsPage();
        }
        
        public DealsPage DealLink(){
        	DealsLink.click();
        	return new DealsPage();
        }
        public TaskPage TaskLink(){
        	TasksLink.click();
        	return new TaskPage();
        }
        public boolean verifyCorrectUsername(){
        	return usernameLabel.isDisplayed();
        	
        }
        public void clickOnNewContacts(){
        	Actions action= new Actions(driver);
        	action.moveToElement(contactsLink).build().perform();
        	NewContact.click();
        }
        	
        }
			
			
		
			
			
			
			
			
			


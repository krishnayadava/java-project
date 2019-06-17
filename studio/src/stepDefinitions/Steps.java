package stepDefinitions;
import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
public class Steps {
	static WebDriver driver;
	static String appname;
	
	
//private ContextSteps contextSteps;
//public Steps(ContextSteps contextSteps) {
  //  this.contextSteps = contextSteps;
//}
@BeforeClass
/*public static void setup(){
	 String exePath = "C:\\Users\\lalita.mor\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
	
		
		driver = new ChromeDriver();
}*/
	
	@Given("^User is on Home Page$")
	public static void homePage() {
		//driver=contextSteps.getDriver();
	//DesiredCapabilities dc = new DesiredCapabilities();
	//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
	
		String exePath = "C:\\Users\\lalita.mor\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver = new ChromeDriver();
		
		driver.get("http://172.16.30.37:8088/BasicPlatform/html/Login.jsp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}

	@Given("^login with correct username and password$")
	public static void login()
	{
		WebElement user = driver.findElement(By.id("username"));
		user.click();
		user.sendKeys("lalita.mor");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.click();
		pwd.sendKeys("lalita");
		WebElement login = driver.findElement(By.id("submit"));
		login.click();}
	@When("^User Navigate to create app page$")
	public static void createApp()
	{
	WebElement create = driver.findElement(By.partialLinkText("Create New App"));
	create.click();
	}
	@When("^drag and drop prompt widget$")
	public void dragDrop() {
		System.out.println("lalita");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement prompt = driver.findElement(By.xpath(
				"/html/body/div[@id='jsPlumb_1_6']/div[@id='leftMenuAccordian']/div[@id='leftMenu']/div[@id='basic']/div[@id='prompt']/table/tbody/tr/td[2]"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 10;
		int x = xaxis - 20;
		Actions act=new Actions(driver);
		act.clickAndHold(prompt).moveToElement(drop, x, y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^drag and drop Dateinput widget$")
	public void dragDropDateInput() {
		System.out.println("lalita");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement dateIn = driver.findElement(By.id("dateInput"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 10;
		int x = xaxis - 20;
		Actions act=new Actions(driver);
		act.clickAndHold(dateIn).moveToElement(drop, x, y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^drag and drop second Dateinput widget$")
	public void dragSecondDropDateInput() {
		System.out.println("lalita");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement dateIn = driver.findElement(By.id("dateInput"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 300;
		int x = xaxis +200;
		Actions act=new Actions(driver);
		act.clickAndHold(dateIn).moveToElement(drop, x, y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][5]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	@When("^drag and drop second prompt widget$")
	public void dragDropprompt2() {
		System.out.println("lalita");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement prompt = driver.findElement(By.xpath(
				"/html/body/div[@id='jsPlumb_1_6']/div[@id='leftMenuAccordian']/div[@id='leftMenu']/div[@id='basic']/div[@id='prompt']/table/tbody/tr/td[2]"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 50;
		int x = xaxis - 20;
		Actions act=new Actions(driver);
		act.clickAndHold(prompt).moveToElement(drop).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][2]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	@When("^drag and drop second simple menu widget$")
	public void dragSimple2() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simple = driver.findElement(By.id("simpleMenu"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+400;
		int x = xaxis+500;
		Actions act=new Actions(driver);
		act.clickAndHold(simple).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][2]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	@When("^drag and drop jump to state widget$")
	public void dragJumpToState() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simple = driver.findElement(By.id("jumpToState"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+400;
		int x = xaxis+500;
		Actions act=new Actions(driver);
		act.clickAndHold(simple).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	
	@When("^drag and drop jump to state widget and connect to skip dtmf$")
	public void dragJumpToStateSkip() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simple = driver.findElement(By.id("jumpToState"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+400;
		int x = xaxis+500;
		Actions act=new Actions(driver);
		act.clickAndHold(simple).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][5]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^drag and drop jump to page widget$")
	public void dragJumpToPage() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simple = driver.findElement(By.id("jumpToPage"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+400;
		int x = xaxis+500;
		Actions act=new Actions(driver);
		act.clickAndHold(simple).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][2]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^drag and drop jump to page widget and connect to max error$")
	public void dragJumpToPageMaxerr() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simple = driver.findElement(By.id("jumpToPage"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+200;
		int x = xaxis+200;
		Actions act=new Actions(driver);
		act.clickAndHold(simple).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][5]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^drag and drop hangup widget and give hangup name$")
	public void dragDropphangup() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement hangup = driver.findElement(By.xpath(
				"//*[@id='hangup']"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 500;
		int x = xaxis + 500;
		Actions act=new Actions(driver);
		act.clickAndHold(hangup).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
		WebElement hangupTitle=driver.findElement(By.xpath("//*[@title='Hangup Code']"));
		Thread.sleep(2000);
		hangupTitle.click();
		hangupTitle.sendKeys("automation");
}
	
	@When("^drag and drop simple menu$")
	public void dragDropSimpleMenu() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement simpleMenu = driver.findElement(By.id("simpleMenu"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis + 10;
		int x = xaxis - 20;
		Actions act=new Actions(driver);
		act.clickAndHold(simpleMenu).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][2]"));
	act.clickAndHold(c1).moveToElement(c2).release().build().perform();
	}
	
	@When("^Enter Intro Prompt in simple Menu$")
	public static void introSimpleMenu()
	{
	WebElement intro=driver.findElement(By.xpath("//*[@name='introPrompt']"));
intro.click();
	intro.sendKeys("intro");}
	
	@When("^Enter Intro Prompt in Date Input \"(.*)\"$")
	public static void introDateInput(String prompt)
	{
	WebElement intro=driver.findElement(By.xpath("//*[contains(@id,'prePromptName-input')]"));
intro.click();
	intro.sendKeys(prompt);}
	
	@When("^Enter Date format in Date Input \"(.*)\"$")
	public static void dateFormatDateInput(String format)
	{
	WebElement date=driver.findElement(By.xpath("//*[contains(@id,'dateFormat-input')]"));
date.click();
	date.sendKeys(format);}
	@When("^Select date input widget$")
	public static void SelectDateInput()
	{
		WebElement date=driver.findElement(By.xpath("//*[@title='Date Input']"));
	date.click();
	}
	@When("^select prompt base for Date input in prompt path is \"(.*)\"$")
	public static void promptBaseDateInput(String path)
	{
		WebElement pro=driver.findElement(By.id("selectDatePromptPath"));
	Select 	prompt=new Select(pro);
	prompt.selectByVisibleText(path);
		
	
	}
	
	@When("^Enter Grammar in simple Menu$")
	public static void grammarSimpleMenu()
	{
	WebElement intro=driver.findElement(By.xpath("//*[@name='key'][@class='dd dtmfKey']"));
intro.click();
	intro.sendKeys("1");
	}
	@When("^Enter option Name in simple Menu$")
	public static void nameSimpleMenu()
	{
	WebElement name=driver.findElement(By.xpath("//*[@name='optionName'][@class='dd dtmfKey']"));
name.click();
	name.sendKeys("test");
	}
	
	@When("^Select settings of widget$")
	public static void settingSimpleMenu() throws InterruptedException
	{
		WebElement setting=driver.findElement(By.xpath("//*[@class='setting']"));
		setting.click();
		Thread.sleep(1000);
	}
	@When("^delete prompt widget$")
	public static void deletePromptWidget() throws InterruptedException
	{WebElement prompt2=driver.findElement(By.xpath("//*[@title='Prompt'][2]"));
	prompt2.click();
	Thread.sleep(1000);
		WebElement close=driver.findElement(By.xpath("//div[@title='Prompt'][2]/table/tbody/tr/td/a[@class='closeWidget']"));
		close.click();
		driver.switchTo().alert().accept();
	}
	@When("^Rename widget name as \"(.*)\"$")
	public static void widgetName(String widgetnm) throws InterruptedException
	{
		WebElement widgetName=driver.findElement(By.xpath("//*[@class='widgetName']"));
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(widgetName).click().sendKeys(widgetnm).build().perform();
	
	}
	
	@When("^Rename jump to state widget name as \"(.*)\"$")
	public static void jumpStatewidgetName(String widgetnm) throws InterruptedException
	{
		WebElement widgetName=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'-table')]/tbody/tr[1]/td[1]"));
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(widgetName).click().sendKeys(widgetnm).build().perform();
	
	}
	@When("^Rename jump to page widget name as \"(.*)\"$")
	public static void jumpPagewidgetName(String widgetnm) throws InterruptedException
	{
		WebElement widgetName=driver.findElement(By.xpath("//*[contains(text(),'jumpToPage')]"));
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(widgetName).click().sendKeys(widgetnm).build().perform();
	
	}
	@Given("^create new page with name \"(.*)\"$")
	public static void newPage(String pageName) throws InterruptedException
	{
		WebElement newButton=driver.findElement(By.id("buttonNew"));
		Actions act=new Actions(driver);
	act.moveToElement(newButton).click().build().perform();
	act.moveToElement(driver.findElement(By.id("add_tab"))).click().build().perform();
	driver.findElement(By.id("tab_title")).click();
	Thread.sleep(500);
	driver.findElement(By.id("tab_title")).sendKeys(pageName);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[13]/div[11]/div/button[1]/span")).click();
	Thread.sleep(500);
	}
	@Given("^Select first page$")
	public static void firstPage(String pageName) throws InterruptedException
	{
	driver.findElement(By.xpath("//*[@id='tabs']/ul/li[1]")).click();
		
		
	}
	
	
	@Then("^Verify jump name is \"(.*)\"$")
	public static void jumpWidgetName(String exp)
	{
		WebElement name=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'-table')]/tbody/tr[1]/td[1]"));
		String widgetName=name.getText();
		if(widgetName.equals(exp))
		{
			System.out.println("Test case pass and widget name is "+widgetName);
		}
		else
		{
			System.out.println("Test case failed and widget name is "+widgetName);
		}
		
	}
	
	@Then("^Verify widget name in jump to page is \"(.*)\"$")
	public static void jumpPageWidgetName(String exp)
	{
		WebElement name=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage')][contains(@id,'-table')]/tbody/tr[1]/td[1]"));
		String widgetName=name.getText();
		if(widgetName.equals(exp))
		{
			System.out.println("Test case pass and widget name is "+widgetName);
		}
		else
		{
			System.out.println("Test case failed and widget name is "+widgetName);
		}
		
	}
	
	@Then("^verify value of state in GUI is \"(.*)\"$")
	public static void defaultState(String exp)
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'table-row-1')]/td[1]"));
		String defaultState=state.getText();
		if(defaultState.equals(exp))
		{
			System.out.println("Test case pass and value of next state is "+defaultState);
		}
		else
		{
			System.out.println("Test case failed and value of next state is "+defaultState);
		}
		
	}
	
	@Then("^verify value of page in GUI is \"(.*)\"$")
	public static void defaultpage(String exp)
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage')][contains(@id,'table')][1]/tbody/tr[2]/td[1]"));
		String defaultState=state.getText();
		if(defaultState.equals(exp))
		{
			System.out.println("Test case pass and value of next page is "+defaultState);
		}
		else
		{
			System.out.println("Test case failed and value of next page is "+defaultState);
		}
		
	}
	@When("^Drag and drop Digits input$")
	public static void dragDropDigitInput()
	{
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement digit=driver.findElement(By.id("digitsInput"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+10;
		int x = xaxis-20;
		Actions act=new Actions(driver);
		act.clickAndHold(digit).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
		
		
	}
	
	
	@When("^Drag and drop second Digits input$")
	public static void dragDropDigitInputSec()
	{
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement basic = driver.findElement(By.id("ui-accordion-leftMenu-header-0"));
		basic.click();
		WebElement digit=driver.findElement(By.id("digitsInput"));
		WebElement drop = driver.findElement(By.id("tabs-Page1"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement start = driver.findElement(By.id("widget-start-1"));
		org.openqa.selenium.Point point = start.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		int y = yaxis+300;
		int x = xaxis+300;
		Actions act=new Actions(driver);
		act.clickAndHold(digit).moveToElement(drop,x,y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][4]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][6]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
		
		
	}
	

	
	
	@When("^Enter intro prompt long in digits input is \"(.*)\"$")
	public static void promptLong(String longpro )
	{
		WebElement prom=driver.findElement(By.xpath("//*[contains(@id,'-prePromptName-input')]"));
		prom.click();
		prom.sendKeys(longpro);
	}
	
	
	@Given("^Select second Digit Input widget$")
	public static void secDigit()
	{
		WebElement digIn=driver.findElement(By.xpath("//*[@title='Digits Input'][2]"));
		digIn.click();
		
	}
	
	@When("^Delete second Digit Input widget$")
	public static void delDigit()
	{
		WebElement digclo=driver.findElement(By.xpath("//div[@title='Digits Input'][2]/table/tbody/tr/td/*[contains(@id,'widget-digitsInput-')] [contains(@id,'close')]"));
		digclo.click();
		driver.switchTo().alert().accept();
		
	}
	
	@When("^Enter intro prompt short in digits input is \"(.*)\"$")
	public static void promptShort(String shortpro )
	{
		WebElement prom=driver.findElement(By.xpath("//*[contains(@id,'introPromptShort-input')]"));
		prom.click();
		prom.sendKeys(shortpro);
	}
	
	@Given("^Select Digits input widget$")
	public static void digitIn()
	{
		WebElement prom=driver.findElement(By.xpath("//*[contains(@id,'widget_digitsInput_')]"));
		prom.click();
	}
	
	@When("^Enter min length is \"(.*)\"$")
	public static void minLen(String min)
	{
		WebElement len=driver.findElement(By.xpath("//*[contains(@id,'table-row-minLength-input')]"));
		len.click();
		len.sendKeys(min);
	}
	
	
	@When("^Enter max length is \"(.*)\"$")
	public static void maxLen(String max)
	{
		WebElement len=driver.findElement(By.xpath("//*[contains(@id,'table-row-maxLength-input')]"));
		len.click();
		len.sendKeys(max);
	}
	
	@When("^delete jump to page$")
	public static void delJump()
	{
		WebElement del=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage-')][contains(@id,'close')]"));
		del.click();
		driver.switchTo().alert().accept();
	}
	/*@Then("^verify value of page in GUI is \"(.*)\"$")
	public static void defaultPage(String exp)
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage')][contains(@id,'table-row-1')]/td[1]"));
		String defaultState=state.getText();
		if(defaultState.equals(exp))
		{
			System.out.println("Test case pass and value of next state is "+defaultState);
		}
		else
		{
			System.out.println("Test case failed and value of next state is "+defaultState);
		}
		
	}*/
	@When("^Select previous state$")
	public static void previousState()
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'table-row-1')]/td[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(state).click().build().perform();
	}
	
	@When("^Select page1$")
	public static void page1()
	{
		WebElement page=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage')][contains(@id,'table-row-1')]/td[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(page).click().build().perform();
	}
	@When("^Select next avilable state in option$")
	public static void avilableState()
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'table-row-1')]/td[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(state).doubleClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	@When("^Select next avilable page in option$")
	public static void avilablePage()
	{
		WebElement state=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToPage')][contains(@id,'table-row-1')]/td[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(state).doubleClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	@Given("^Select Jump to state widget$")
	public static void selectJumpState() throws InterruptedException
	{
		
		WebElement jump=driver.findElement(By.xpath("//*[@title='Jump To State']"));
		jump.click();
		
		Thread.sleep(1000);
		
	
	}
	
	@Given("^Select Jump to page widget$")
	public static void selectJumpPage() throws InterruptedException
	{
		WebElement jump=driver.findElement(By.xpath("//*[@title='Jump To Page']"));
		jump.click();
		
		Thread.sleep(1000);
		
	
	}
	
	@When("^Rename widget name and variable as \"(.*)\"$")
	public static void widgetNameVariable(String tag) throws InterruptedException
	{
		WebElement widgetName=driver.findElement(By.xpath("//*[@class='widgetName']"));
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(widgetName).click().sendKeys(tag).sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}
	@When("^Enter prompt name$")
	public static void promptName()
	{
		WebElement inpt = driver.findElement(By.xpath("//tr[@class='simplePrompt']/td/input"));
		inpt.click();
		inpt.sendKeys("demo");
	}	
	
	@When("^configure supported language$")
	public static void configureLang()
	{
		WebElement conf = driver.findElement(By.xpath("//span[contains(text(),'Configure App')]"));
		conf.click();
		WebElement lang = driver.findElement(By.id("appSupportedLang"));
		lang.click();
		WebElement eng = driver.findElement(By.xpath("/html/body/div[37]/div[11]/div/button[1]/span"));
		eng.click();
		WebElement back = driver.findElement(By.xpath("//span[contains(text(),'Back to App')]"));
		back.click();
	}	
	@When("^select Hangup widget$")
	public static void selectHangup()
	{
	WebElement selectHangup=driver.findElement(By.xpath("//div[@title='Hang Up']"));
	selectHangup.click();
	
	}
	@When("^Rename Hangup widget$")
	public static void renameHangup()
	{Actions act=new Actions(driver);
		WebElement renameHangup=driver.findElement(By.xpath("//div[@title='Hang Up']/table/tbody/tr/td[@class='widgetName']"));
		act.moveToElement(renameHangup).click().sendKeys("HangupTest").build().perform();
	}
	@When("^close Hangup Widget$")
	public static void closeHangup()
	{
	WebElement closeHangup=driver.findElement(By.xpath("//div[@title='Hang Up']/table/tbody/tr/td/a[@class='closeWidget']"));
	closeHangup.click();
	driver.switchTo().alert().accept();
	}
	@When("^save application$")
	public static void saveApp()
	{
		WebElement savelist = driver.findElement(By.xpath("//*[@id='buttonSave']"));
		savelist.click();
		WebElement saveApp = driver.findElement(By.id("canvasSaveBtn"));
		saveApp.click();
	}	
	
	
	/*@When("^save application with alert$")
	public static void saveAppAlert() throws InterruptedException
	{
		WebElement savelist = driver.findElement(By.xpath("//*[@id='buttonSave']"));
		savelist.click();
		WebElement saveApp = driver.findElement(By.id("canvasSaveBtn"));
		
		saveApp.click();
		JavascriptExecutor js ;  
		((JavascriptExecutor)driver).executeScript(document., arg1)
		
		
			
	
		   
	}	*/
	
	@When("^publish application$")
	public static void publishApp() throws InterruptedException
	{
		WebElement publishList = driver.findElement(By.id("buttonPublish"));
		publishList.click();
		WebElement publishApp = driver.findElement(By.id("canvasDeployBtn"));
		publishApp.click();
		driver.switchTo().alert().accept();
	}	
	@Given("^select created app$")
	public static void selectApp()
{
		
		String appPath="editApp-"+appname+"-voice";
		WebElement selectApp=driver.findElement(By.id(appPath));
		selectApp.click();
	}
	@Given("^select prompt Widget$")
	public static void selectWidget()
	{
		WebElement promptWidget=driver.findElement(By.xpath("//*[@title='Prompt']"));
		promptWidget.click();
	}
	@Given("^select Simple Menu Widget$")
	public static void selecsimpletWidget()
	{
		WebElement simpleMenuWidget=driver.findElement(By.xpath("//*[@title='Simple Menu'][1]"));
		simpleMenuWidget.click();
	}
	@Given("^select second Simple Menu Widget$")
	public static void selecsimpletWidget2() throws InterruptedException
	{
		WebElement simpleMenuWidget=driver.findElement(By.xpath("//div[@title='Simple Menu'][2]"));
		simpleMenuWidget.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
	}
	
	@When("^Delete simple menu$")
	public static void deleteSimple() throws InterruptedException
	{
		WebElement simpleMenuWidget=driver.findElement(By.xpath("//*[@title='Simple Menu'][2]"));
		Actions act=new Actions(driver);
act.moveToElement(simpleMenuWidget).click().build().perform();
		Thread.sleep(1000);
		
		WebElement del=driver.findElement(By.id("widget-simpleMenu-3-close"));
		act.moveToElement(del).click().build().perform();
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@When("^Delete Date Input$")
	public static void deleteDate() throws InterruptedException
	{
		WebElement dateInputWidget=driver.findElement(By.xpath("//*[@title='Date Input'][2]"));
		Actions act=new Actions(driver);
act.moveToElement(dateInputWidget).click().build().perform();
		Thread.sleep(1000);
		
		WebElement del=driver.findElement(By.id("widget-dateInput-4-close"));
		act.moveToElement(del).click().build().perform();
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@When("^Delete jump to state$")
	public static void deleteJumpToState() throws InterruptedException
	{
		
		
		WebElement del=driver.findElement(By.xpath("//*[contains(@id,'widget-jumpToState-')][contains(@id,'close')]"));
		del.click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	
	@When("^select setting button$")
	public static void promptSetting()
	{
		WebElement setting=driver.findElement(By.id("widget-prompt-2-table-row-1-setting"));
		setting.click();
	}
	@When("^delete prompt$")
	public static void deletePrompt()
	{
		WebElement delete=driver.findElement(By.xpath("//*[@class='deletePrompt']"));
		delete.click();
		driver.switchTo().alert().accept();
	}
	
	@When("^delete choice$")
	public static void deleteChoice()
	{
		WebElement delete=driver.findElement(By.xpath("//*[@class='deleteChoice']"));
		delete.click();
		driver.switchTo().alert().accept();
	}
	@When("^select content base in prompt path$")
	public static void contentPromptPath()
	{
		Select promptPath=new Select(driver.findElement(By.id("selectPromptPath")));
		promptPath.selectByValue("content_base");
	}
	@Then("^check default prompt path in GUI \"(.*)\"$")
	public static void appPromptBase(String expected)
	{
		Select promptPath=new Select(driver.findElement(By.id("selectPromptPath"))); 
		WebElement selected=promptPath.getFirstSelectedOption();
		String actual=selected.getText();
		if (actual.equals(expected))
				{System.out.println("Test case pass and default prompt path in GUI is"+actual);
				
				}
		else
		{System.out.println("Test case failed and default prompt path in GUI is"+actual);
		
		}
	}
	
	@Then("^check default prompt path for date input in GUI \"(.*)\"$")
	public static void appPromptBaseDate(String expected)
	{
		Select promptPath=new Select(driver.findElement(By.id("selectDatePromptPath"))); 
		WebElement selected=promptPath.getFirstSelectedOption();
		String actual=selected.getText();
		if (actual.equals(expected))
				{System.out.println("Test case pass and default prompt path in GUI is"+actual);
				
				}
		else
		{System.out.println("Test case failed and default prompt path in GUI is"+actual);
		
		}
	}
	
	@Then("^verify default value of Inter Digit Timeout in GUI is \"(.*)\"$")
	public static void interDigitTimeout(String expected)
	{
		WebElement interDigit=driver.findElement(By.id("interDigitTimeout")); 
		
		String actual=interDigit.getAttribute("value");
		if (actual.equals(expected))
				{System.out.println("Test case pass and default value of inter digit timeout in GUI is"+actual);
				
				}
		else
		{System.out.println("Test case failed and default value of inter digit timeout in GUI is"+actual);
		
		}
	}
	@Then("^check default Play scheme in GUI \"(.*)\"$")
	public static void defaultPlayScheme(String expected)
	{
		Select playScheme=new Select(driver.findElement(By.id("selectPlayScheme")));
	WebElement defaultPlayScheme=playScheme.getFirstSelectedOption();
	String playSchemeValue=defaultPlayScheme.getText();
	if (playSchemeValue.equals(expected))
	{System.out.println("Test case pass and default Play scheme in GUI is"+playSchemeValue);
	
	}
else
{System.out.println("Test case failed and default Play scheme in GUI is"+playSchemeValue);

}
	}
	@Then("^check default value of Nth Prompt checkbox$")
	public static void defaultNthPrompt()
	{
		WebElement nthPrompt=driver.findElement(By.xpath("//input[@id='nthPrompt']"));
		Boolean nth=nthPrompt.isSelected();
		String actual=Boolean.toString(nth);
		if (actual.equals("false"))
		{System.out.println("Testcase passed and Nth prompt checkbox is not selected");
		
		}
	else
	{System.out.println("Test case failed and Nth prompt checkbox is selected");

	}}
	@Then("^verify default value of hotword in GUI is \"(.*)\"$")
	public static void defaultHotword(String expected)
	{
		WebElement hotword=driver.findElement(By.xpath("//input[@id='hotword']"));
		Boolean word=hotword.isSelected();
		String actual=Boolean.toString(word);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and hotword checkbox is not selected");
		
		}
	else
	{System.out.println("Test case failed and hotword checkbox is selected");

	}}
	
	@Then("^verify default value of Disable Universal Grammar in GUI is \"(.*)\"$")
	public static void defaultDisableUG(String expected)
	{
		WebElement disableUG=driver.findElement(By.xpath("//input[@id='disableUG']"));
		Boolean actual=disableUG.isSelected();
		System.out.println(actual);
		String actual1=Boolean.toString(actual);
		if (actual1.equals(expected))
		{System.out.println("Testcase passed and Disable Universal Grammar checkbox is not selected");
		
		}
	else
	{System.out.println("Test case failed and Disable Universal Grammar checkbox is selected");

	}}
	
	
	@Then("^verify default value of Consent Logs in GUI is \"(.*)\"$")
	public static void defaultConsetLogs(String expected)
	{
		WebElement consentLog=driver.findElement(By.xpath("//input[@id='chkBoxConsentLogs']"));
		Boolean consent=consentLog.isSelected();
		String actual=Boolean.toString(consent);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and Consent Logs checkbox is selected");
		
		}
	else
	{System.out.println("Test case failed and Consent Logs checkbox is not selected");

	}}
	@Then("^verify default value of Consent Logs for date input widget in GUI is \"(.*)\"$")
	public static void defaultConsetLogsDate(String expected)
	{
		WebElement consentLog=driver.findElement(By.xpath("//input[@id='chkBoxDateConsentLogs']"));
		Boolean consent=consentLog.isSelected();
		String actual=Boolean.toString(consent);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and Consent Logs checkbox is selected");
		
		}
	else
	{System.out.println("Test case failed and Consent Logs checkbox is not selected");

	}}
	
	@Then("^verify default value of Repeat Intro on Error is \"(.*)\"$")
	public static void defaultrepeatOnError(String expected)
	{
		WebElement repeatIntro=driver.findElement(By.xpath("//input[@id='chkBoxRepeatIntroOnError']"));
		Boolean repeat=repeatIntro.isSelected();
		String actual=Boolean.toString(repeat);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and Repeat Intro On Error checkbox is selected");
		
		}
	else
	{System.out.println("Test case failed and Repeat Intro On Error checkbox is not selected");

	}}
	
	
	@Then("^verify default value of Default Error Handling is \"(.*)\"$")
	public static void defaulterrorHandling(String expected)
	{
		WebElement errorHandling=driver.findElement(By.xpath("//input[@id='chkBoxErrorHadling']"));
		Boolean error=errorHandling.isSelected();
		String actual=Boolean.toString(error);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and Default Error Handling checkbox is selected");
		
		}
	else
	{System.out.println("Test case failed and Default Error Handling checkbox is not selected");

	}}
	
	@Then("^verify default value of Add Custom Prop is \"(.*)\"$")
	public static void defaultCustomSetting(String expected)
	{
		WebElement customProps=driver.findElement(By.xpath("//input[@id='customProps']"));
		Boolean cus=customProps.isSelected();
		String actual=Boolean.toString(cus);
		if (actual.equals(expected))
		{System.out.println("Testcase passed and Add custom Props checkbox is not selected");
		
		}
	else
	{System.out.println("Test case failed and Add custom Props checkbox is selected");

	}}
	
	@When("^select Nth Prompt checkbox$")
	public static void nthPrompt() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement nthPrompt1=driver.findElement(By.xpath("//input[@id='nthPrompt']"));
	
		nthPrompt1.click();
	}
	@When("^change tag Name \"(.*)\"$")
	public static void tagname(String tag) throws InterruptedException
	{
		WebElement tagName=driver.findElement(By.id("inputWidgetTagName"));
		tagName.click();
		tagName.clear();
		tagName.sendKeys(tag);
		Thread.sleep(1000);
	}
	
	@When("^change inter digit timeout \"(.*)\"$")
	public static void interdigitTimeout(String timeout)
	{
		WebElement timeOut=driver.findElement(By.id("interDigitTimeout"));
		timeOut.click();
		timeOut.clear();
		timeOut.sendKeys(timeout);
		
	}
	
	@When("^Enable Bargin Type Hotword$")
	public static void hotword() throws InterruptedException
	{
		WebElement hotword=driver.findElement(By.id("hotword"));
		hotword.click();
		Thread.sleep(1000);
		
		
	}
	
	@When("^Enable Custom props$")
	public static void cutomProp() throws InterruptedException
	{
		WebElement custom=driver.findElement(By.id("customProps"));
		custom.click();
		Thread.sleep(1000);
		}
	@When("^select add button of custom props$")
	public static void addCutomProp() throws InterruptedException
	{
		WebElement customAdd=driver.findElement(By.xpath("//*[@id='customProperties']/tbody/tr[2]/td[3]"));
		customAdd.click();
		Thread.sleep(1000);
		}
	
	@When("^enter custom prop name \"(.*)\"$")
	public static void cutomPropName(String name) throws InterruptedException
	{
		WebElement customPropName=driver.findElement(By.xpath("//*[@class='customPropname widgetSetting-item-required']"));
		customPropName.click();
		customPropName.sendKeys(name);
		Thread.sleep(1000);
		}
	@When("^Enter custom prop value \"(.*)\"$")
	public static void cutomPropValue(String value) throws InterruptedException
	{
		WebElement customPropValue=driver.findElement(By.xpath("//*[@class='customPropvalue widgetSetting-item-required']"));
		customPropValue.click();
		customPropValue.sendKeys(value);
		Thread.sleep(1000);
		}
	
	@When("^select disable universal grammar checkbox$")
	public static void disableUG() throws InterruptedException
	{
		WebElement disableUG=driver.findElement(By.id("disableUG"));
		disableUG.click();
		Thread.sleep(1000);
		
		
	}
	
	@When("^Enter second option as \"(.*)\"$")
	public static void secondOption(String option)
	{
		WebElement opt=driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/input[@class='dd dtmfKey'][@name='optionName']"));
		opt.click();
		opt.sendKeys(option);
	}
	
	@When("^Enter second dtmf as \"(.*)\"$")
	public static void secondDTMF(String dtmf)
	{
		WebElement dt=driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/input[@class='dd dtmfKey'][@name='key']"));
		dt.click();
		dt.sendKeys(dtmf);
	}
	
	@When("^Select add choice button$")
	public static void addChoice()
	{
		WebElement dt=driver.findElement(By.xpath("//*[@class='addChoice']"));
		dt.click();
	}
	
	@When("^disable consent logs$")
	public static void consentLogs()
	{
		WebElement consentLogs=driver.findElement(By.id("chkBoxConsentLogs"));
		consentLogs.click();
		
		
	}
	@When("^disable consent logs in date input$")
	public static void consentLogsDate()
	{
		WebElement consentLogs=driver.findElement(By.id("chkBoxDateConsentLogs"));
		if(consentLogs.isSelected())
		{
		consentLogs.click();
		}
		
	}
	@Then("^verify default value of termination key in Gui is \"(.*)\"$")
	public static void termGui(String exp)
	{
		Select termination=new Select(driver.findElement(By.id("termChar")));
		WebElement opt=termination.getFirstSelectedOption();
		String actual=opt.getText();
		if(actual.equals(exp))
		{
			System.out.println("Test case passed and default termination key in GUI is" +actual);
		}
		else
		{
			System.out.println("Test case failed and default termination key in xml is" +actual);
		}
	}		
	
	@Then("^verify default value of Define min max in Gui \"(.*)\"$")
	public static void minMax(String exp)
	{
		
		WebElement minMax=driver.findElement(By.id("dateInputDefineMinMax"));
		Boolean min=minMax.isSelected();
		String actual=Boolean.toString(min);
		if(actual.equals(exp))
		{
			System.out.println("Test case passed and Define min max checkbox in GUI is not selected");
		}
		else
		{
			System.out.println("Test case passed and Define min max checkbox in GUI is not selected");
		}
	}
	
	@When("^select termination key as \"(.*)\"$")
	public static void terminationKey(String exp)
	{
		Select termination=new Select(driver.findElement(By.id("termChar")));
		termination.selectByVisibleText(exp);
	}
	@When("^disable Repeat intro on error$")
	public static void repeatIntro()
	{
		WebElement repeatIntro=driver.findElement(By.id("chkBoxRepeatIntroOnError"));
		repeatIntro.click();
		
		
	}
	@When("^disable Default Error Handling$")
	public static void defaultError()
	{
		WebElement errorHandle=driver.findElement(By.id("chkBoxErrorHadling"));
		if(errorHandle.isSelected())
		{
		errorHandle.click();
		
		}
	}
	@When("^Enter NSP timeout as \"(.*)\"$")
	
		public static void nspTimeOut(String nsp)
		{
		WebElement nspTime=driver.findElement(By.id("inputNspTimeout"));
		nspTime.click();
		nspTime.clear();
		nspTime.sendKeys(nsp);
		
	}
	
	@When("^Enter nsp Prompt as \"(.*)\"$")
	
	public static void nspPrompt(String nspPrompt)
	{
	WebElement nspPro=driver.findElement(By.name("nspPrompt"));
	nspPro.click();
	nspPro.clear();
	nspPro.sendKeys(nspPrompt);
	
}
	
@When("^Enter Rejection Prompt as \"(.*)\"$")
	
	public static void rejPrompt(String rejPrompt)
	{
	WebElement rejPro=driver.findElement(By.name("rejPrompt"));
	rejPro.click();
	rejPro.clear();
	rejPro.sendKeys(rejPrompt);
	
}
	
	@When("^Max Error count as \"(.*)\"$")
	public static void maxErr(String max)
	{
	WebElement maxErr=driver.findElement(By.id("inputMaxErrorCount"));
	maxErr.click();
	maxErr.clear();
	maxErr.sendKeys(max);
	
}
	
	@When("^Select ignore all$")
	public static void ignoreAll()
	{
	WebElement ignoreAll=driver.findElement(By.name("Ignore All"));
	ignoreAll.click();
	}
	
	
	
	@When("^Enter Before prompt$")
	public static void beforePrompt()
	{
		WebElement before=driver.findElement(By.xpath("//*[@class='nthPrompt'][1]/td[1]/input"));
		before.click();
		before.sendKeys("bfrPrompt");
	}
	@When("^Enter After prompt$")
	public static void afterPrompt()
	{
		WebElement after=driver.findElement(By.xpath("//*[@class='nthPrompt'][1]/td[2]/input"));
		after.click();
		after.sendKeys("aftrPrompt");
	}
	@When("^Select add prompt button$")
	public static void addPrompt()
	{
		WebElement addPrompt=driver.findElement(By.xpath("//*[@class='addPrompt']"));
		addPrompt.click();
	}
	@When("^Enter second Before prompt$")
	public static void beforePrompt2()
	{
		WebElement before=driver.findElement(By.xpath("//*[@class='nthPrompt'][2]/td[1]/input"));
		before.click();
		before.sendKeys("bfrPrompt2");
	}
	@When("^Enter second After prompt$")
	public static void afterPrompt2()
	{
		WebElement after=driver.findElement(By.xpath("//*[@class='nthPrompt'][2]/td[2]/input"));
		after.click();
		after.sendKeys("aftrPrompt2");
	}
	@When("^provide N Value$")
	public static void nthValue()
	{
	WebElement nthValue=driver.findElement(By.id("nthPromptVal"));
	nthValue.click();
	nthValue.sendKeys("3");
	}
	@Then("^check default Bargein in GUI \"(.*)\"$")
	public static void defaultBargein(String expected)
	{
		Select bargein=new Select(driver.findElement(By.id("selectBargein")));
	WebElement defaultBargein=bargein.getFirstSelectedOption();
	String BargeinValue=defaultBargein.getText();
	if (BargeinValue.equals(expected))
	{System.out.println("Test case pass and default Bargein in GUI is"+BargeinValue);
	
	}
else
{System.out.println("Test case failed and default Bargein in GUI is"+BargeinValue);

}
	}
	
	@Then("^check default confirm input \"(.*)\"$")
	public static void defaultCnfInp(String expected)
	{
		
	WebElement cnf=driver.findElement(By.id("chkBoxConfirmInput"));
	Boolean cnfIn=cnf.isSelected();
	String confirmIn=Boolean.toString(cnfIn);
	if (confirmIn.equals(expected))
	{System.out.println("Test case pass and default confirm input in GUI is"+confirmIn);
	
	}
else
{System.out.println("Test case failed and default confirm input in GUI is"+confirmIn);

}
	}
	
	@When("^Enable confirm input$")
	public static void confirmIn()
	{
		WebElement cnf=driver.findElement(By.id("chkBoxConfirmInput"));
		if(!cnf.isSelected())
		{
			cnf.click();
		}
	}
	
	@When("^enter pre confirmation prompt is \"(.*)\"$")
	public static void preConfirm(String precnf)
	{
		WebElement cnf=driver.findElement(By.id("preConfirmationPrompt"));
		cnf.click();
		cnf.sendKeys(precnf);
	}
	@When("^enter confirmation prompt is \"(.*)\"$")
	public static void confirmPro(String cnfPro)
	{
		WebElement cnf=driver.findElement(By.id("confirmationPrompt"));
		cnf.click();
		cnf.sendKeys(cnfPro);
	}
	
	@When("^enter Re-enter DTMF is \"(.*)\"$")
	public static void reDTMF(String reDTMF)
	{
		WebElement cnf=driver.findElement(By.id("reenterDtmf"));
		cnf.click();
		cnf.sendKeys(reDTMF);
	}
	
	@When("^enter confirm DTMF is \"(.*)\"$")
	public static void cnDTMF(String confDTMF)
	{
		WebElement cnf=driver.findElement(By.id("confirmDtmf"));
		cnf.click();
		cnf.sendKeys(confDTMF);
	}
	
	
	@When("^Select Play Scheme as Random$")
	public static void randomPlayscheme()
	{
		Select playScheme=new Select(driver.findElement(By.id("selectPlayScheme")));
		playScheme.selectByValue("random_one");
	}
	@When("^select bargein as false$")
	public static void false_bargein()
	{
		Select bargein=new Select(driver.findElement(By.id("selectBargein")));
		bargein.selectByValue("false");
	}
	@When("^select standard prompt base in prompt path$")
	public static void standardPromptPath()
	{
		Select promptPath=new Select(driver.findElement(By.id("selectPromptPath")));
		promptPath.selectByValue("standard_prompt_base");
	WebElement selected=promptPath.getFirstSelectedOption();
	selected.getText();}
	@When("^save settings$")
	public static void savePrompt() 
	{
		WebElement savePrompt=driver.findElement(By.xpath("/html/body/div[14]/div[11]/div/button[1]/span"));
		savePrompt.click();
		
	}
	@When("^scroll down setting page$")
	public static void scrollSetting()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.id("settingDialog")), 100);
	}
	
	@When("^scroll basic widgt$")
	public static void scrollBasic() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.id("basic")), 300);
	
	}
	
	@When("^scroll down setting page more$")
	public static void scrollSetting2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.id("settingDialog")), 400);
	}
	@Then("^Read xml$")
	public static void comparePromptName()
	{
		appname = driver.findElement(By.id("appName")).getText();

		Session session = null;
		Channel channel = null;
		OutputStream outProxy = null;
		String str1 = "cat /opt/mas/appData/lalita.mor_";
		String str2 = str1 + appname.toLowerCase();
		String xml_command = str2 + "_1.0.0/" + appname + ".xml";

		try {
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			session = jsch.getSession("root", "172.16.30.37", 22);
			session.setPassword("Onm0bile");
			session.setConfig(config);
			session.connect();

			boolean res = session.isConnected();
			
			channel = session.openChannel("exec");
			ChannelExec cexe = ((ChannelExec) channel);
			((ChannelExec) channel).setCommand(xml_command);
			// channel.setInputStream(null);
			//((ChannelExec) channel).setErrStream(System.err);

			channel.connect();
			
			FileOutputStream fos = new FileOutputStream("d:/abc.xml");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// cexe.setOutputStream(bos);

			InputStream is = channel.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			int i = bis.read();
			while (i != -1) {
				bos.write(i);
				i = bis.read();
				//System.out.print(i);
			}
			bos.flush();
			fos.flush();
			bos.close();

			fos.close();
			is.close();
			channel.disconnect();
		      session.disconnect();
		      //System.out.println("sleeping...");
		      //Thread.sleep(10000);
		}
		catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
		//System.out.println("32sfdegf");
		
		 //domFactory.setNamespaceAware(true);
		 // builder;
	@Then("^compare result \"(.*)\" and \"(.*)\"$")
		public static void checkResult(String node1,String res1){
        try {
        	DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        	System.out.println("Entered into docunemt builder");
        	
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document dDoc = builder.parse("d:/abc.xml");
            //String node = dDoc.getElementsByTagName(node1).item(0).getTextContent();
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            XPathExpression expr =
                    xpath.compile(node1);
            NodeList nodeList = (NodeList)(expr.evaluate(dDoc, XPathConstants.NODESET));
            String node= nodeList.item(0).getNodeValue();
            System.out.println(node);
            System.out.println("Node : "+node);
            if (node.equals(res1))
            {
            	System.out.println("Test case passed");
            }
            else
            {
            	System.out.println("Test case failed");
            }
            
        } catch (Exception e) {
        	System.err.println(e);
            e.printStackTrace();
        }
}
	
	
	
	@Then("^compare count result \"(.*)\" and \"(.*)\"$")
	public static void checkResultnumber(String node1,int res1){
    try {
    	DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
    	System.out.println("Entered into docunemt builder");
    	
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document dDoc = builder.parse("d:/abc.xml");
        //String node = dDoc.getElementsByTagName(node1).item(0).getTextContent();
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();
        XPathExpression expr =
                xpath.compile(node1);
        NodeList node = (NodeList)(expr.evaluate(dDoc, XPathConstants.NODESET));
     int nodeNum=node.getLength();
        System.out.println(nodeNum);
        System.out.println("Node : "+nodeNum);
        if (nodeNum==res1)
        {
        	System.out.println("Test case passed");
        }
        else
        {
        	System.out.println("Test case failed");
        }
        
    } catch (Exception e) {
    	System.err.println(e);
        e.printStackTrace();
    }
}
	@After
	public static void closeBrowser()
	{
		driver.close();
	}
	
	

}

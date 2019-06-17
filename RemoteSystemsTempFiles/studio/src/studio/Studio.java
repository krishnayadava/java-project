package studio;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


public class Studio {
	
	static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public static void homePage() {
		String exePath = ("C:\\Users\\krishna.yadav\\Desktop\\Newfolder\\new\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://172.16.5.165:8088/BasicPlatform/html/Login.jsp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
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
	public void dragDrop(WebDriver driver) {
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
		Actions act = new Actions(driver);
		act.clickAndHold(prompt).moveToElement(drop, x, y).release().build().perform();
		WebElement c1 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][1]"));
		WebElement c2 = driver.findElement(By.xpath("//div[@class='_jsPlumb_endpoint  ui-draggable ui-droppable'][3]"));
		act.clickAndHold(c1).moveToElement(c2).release().build().perform();
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
	@When("^save application$")
	public static void saveApp()
	{
		WebElement savelist = driver.findElement(By.xpath("//*[@id='buttonSave']"));
		savelist.click();
		WebElement saveApp = driver.findElement(By.id("canvasSaveBtn"));
		saveApp.click();
	}	
	@When("^publish application$")
	public static void publishApp()
	{
		WebElement publishList = driver.findElement(By.id("buttonPublish"));
		publishList.click();
		WebElement publishApp = driver.findElement(By.id("canvasDeployBtn"));
		publishApp.click();
		driver.switchTo().alert().accept();
	}	
	@When("^Select add prompt button$")
	public static void addPrompt()
	{
		WebElement addPrompt=driver.findElement(By.xpath("//*[@class='addPrompt']"));
		addPrompt.click();
	}
	
	@Then("^Given prompt demo name should displayed under value tag of published xml$")
	public static void comparePromptName()
	{
		String appname = driver.findElement(By.id("appName")).getText();

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
			System.out.println("result is" + res);
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
		
		//System.out.println("32sfdegf");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		 //domFactory.setNamespaceAware(true);
		 // builder;
		
        try {
        	
        	System.out.println("Entered into docunemt builder");
        	System.out.println("sf");
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document dDoc = builder.parse("d:/abc.xml");
            String node = dDoc.getElementsByTagName("value").item(0).getTextContent();
           
            System.out.println("Node : "+node);
            if (node.equals("demo"))
            {
            	System.out.println("Test case passed");
            }
            else
            {
            	System.out.println("Test case false");
            }
        } catch (Exception e) {
        	System.err.println(e);
            e.printStackTrace();
        }
}
		
	
}

package parameterTest;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
	public class ParameterTest {

	  WebDriver driver;
		
		@Test
		@Parameters({"URL" , "emailid", "password"})
		public void setup(String URL, String emailid, String password){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna.yadav\\Desktop\\New folder\\new\\chromedriver.exe");		
			
	    driver= new ChromeDriver();  
		
		driver.get("URL");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("emailid");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		
//		@AfterMethod
//		public void tearDown(){
//		driver.quit();
//		}
		
	}
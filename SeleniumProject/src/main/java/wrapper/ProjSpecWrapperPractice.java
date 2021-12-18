package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjSpecWrapperPractice {
       
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		
		 Thread.sleep(2000);
		 driver.findElementByLinkText("CRM/SFA").click();
		 
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}
	
	//@DataProvider
	//public void getData() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
//}

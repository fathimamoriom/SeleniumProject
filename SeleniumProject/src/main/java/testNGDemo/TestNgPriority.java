package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestNgPriority {
    	
    	ChromeDriver driver;	
	
	@BeforeMethod
	public void login() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
	}
     @Test(priority= 1)
     public void createlead() {
    		
 		driver.findElementByLinkText("Leads").click();
 		driver.findElementByLinkText("Create Lead").click();
 		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
 		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
 	    driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
 	    driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
 	    driver.findElementById("createLeadForm_description").sendKeys("TCS");
 	    driver.findElementById("createLeadForm_description").sendKeys("1");
 	    driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
 	    driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
    }
     
     @Test (priority =2)
     public void createAccount() {
    	 driver.findElementByLinkText("Create Account").click();
    	 driver.findElementById("accountName").sendKeys("Hema Mali");
    	 driver.findElementByXPath("//input[@class='smallSubmit']").click();
    	 
    	 
     }

	
	
	@AfterMethod
	public void close() {
		driver.close();
}

}

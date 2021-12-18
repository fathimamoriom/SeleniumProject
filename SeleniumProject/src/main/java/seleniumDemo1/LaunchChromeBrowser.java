package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
     //Property set
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cored\\OneDrive\\Desktop\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		
	
  //Object driver
		
      ChromeDriver driver = new ChromeDriver();
      
      //Load URL
		
      driver.get("http://leaftaps.com/opentaps/control/main");
      
      //Browser maximize
      
      driver.manage().window().maximize();
		
      
      //Get Title
      
      driver.getTitle();
      
      //Title printout
      
       System.out.println(driver.getTitle());
       
       
       //implicitlyWait
      
     // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           
      //Thread.sleep(5000);
      
      //Find username
      
       driver.findElementById("username").sendKeys("DemoSalesManager"); 
     
      
      //Find password
      
      driver.findElementById("password").sendKeys("crmsfa");
      
      //Click login
      
      driver.findElementByClassName("decorativeSubmit").click();
      
      //Click CRM/SFA link
      
      driver.findElementByLinkText("CRM/SFA").click();
      
      //Click creat lead link
      
      driver.findElementByLinkText("Create Lead").click();
      
      //Enter company name
      
      driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
      
      //Enter first name
      
      driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
      
      //Enter last name
      
      driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
      
      //Enter title
      
      driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
      
      //Enter description
      
      driver.findElementById("createLeadForm_description").sendKeys("TCS");
      
      //Enter country code
      
      driver.findElementById("createLeadForm_description").sendKeys("1");
      
      //Enter department
      
      driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
      
      //Enter employee no
      
      driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
      
      //Enter web url
      
      driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
      
      //Enter zip code
      
      driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
      
      //Enter ph no
      
      driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
      
      //Enter mail address
      
      driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
      
      
      
    //  WebElement src = driver.findElementById("createLeadForm_dataSourceId");
      
     // Select dd = new Select(src);
      
    //  dd.selectByVisibleText("Direct Mail");
      
      WebElement src = driver.findElementById("createLeadForm_dataSourceId");
      Select dd = new Select(src);
      dd.selectByVisibleText("Employee");
      
      
      
      
      
      
      
      WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
      
      Select dd1 = new Select(ind);
      
      dd1.selectByVisibleText("E-tailer");
      
      WebElement own = driver.findElementByName("ownershipEnumId");

      Select dd2 = new Select(own);
      
      dd2.selectByVisibleText("Corporation");
      
      WebElement mktc = driver.findElementById("createLeadForm_marketingCampaignId");
      Select dd3 = new Select(mktc);
      dd3.selectByValue("CATRQ_CARNDRIVER");
      
      WebElement stat = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
      Select dd4 = new Select(stat);
      dd4.selectByVisibleText("California");
      
      
      //Click creat lead button
      
      driver.findElementByName("submitButton").click();
      
      //Print Title
      
     System.out.println(driver.getTitle());     
      
      Thread.sleep(5000);
      driver.close();
      
     /* driver.findElementByLinkText("Create Account").click();
      
      driver.findElementById("accountName").sendKeys("Hima Mali");
      
      WebElement inds = driver.findElementByName("industryEnumId");
      Select dd5 = new Select(inds);
      dd5.selectByVisibleText("Finance");
      
      WebElement own = driver.findElementByName("ownershipEnumId");
      Select dd6 = new Select(own);
      dd6.selectByVisibleText("S-Corporation");
      
      WebElement surs = driver.findElementById("dataSourceId");
      Select dd7 = new Select(surs);
      dd7.selectByVisibleText("Employee");
      
      WebElement intl = driver.findElementById("initialTeamPartyId");
      Select dd8 = new Select(intl);
      dd8.selectByValue("DemoSalesTeam1");
      
      WebElement mktc = driver.findElementById("marketingCampaignId");
      Select dd9 = new Select(mktc);
      dd9.selectByVisibleText("Automobile");*/
      
      
      
      
      
      
      
      
     
      
      
      
      
		
		
		
				
				
				
			}
}

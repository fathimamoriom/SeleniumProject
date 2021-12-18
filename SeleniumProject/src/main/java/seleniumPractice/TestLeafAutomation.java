package seleniumPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafAutomation {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	driver.getTitle();
	
	System.out.println(driver.getTitle());
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Create Account").click();
    
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
    dd9.selectByVisibleText("Automobile");
    
    WebElement state = driver.findElementById("generalStateProvinceGeoId");
    Select dd10 = new Select(state);
    dd10.selectByVisibleText("Alaska");
    
    driver.findElementByClassName("smallSubmit").click();
    
    
    driver.close();
		
		
		
		
		
		
		
		
		
	}

}

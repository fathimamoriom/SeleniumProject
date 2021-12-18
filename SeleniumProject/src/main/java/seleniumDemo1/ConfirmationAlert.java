package seleniumDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
	driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	
	//driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByXPath("//a[@style='color: black;']").click();
	
	driver.findElementByXPath("//a[text()='Create Lead']").click();
	
	driver.findElementByXPath("//a[text()='Merge Leads']").click();
	
	driver.findElementByXPath("//a[text()='Merge']").click();
	
	String ConfirmationAlert = driver.switchTo().alert().getText();

	
	System.out.println(ConfirmationAlert);
	
	Thread.sleep(5000);
	
	//driver.switchTo().alert().dismiss();
	
	driver.switchTo().alert().accept();
	
	
	
	driver.close();
	
	
	
	
		
		
		
		
		
		
		

	}

}

package seleniumDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPractice {

	public static void main(String[] args) throws InterruptedException {
		
		//property set
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();
		
		//click submit button
		
		driver.findElementByXPath("//input[@name='searchBtn'][1]").click();
		
		String SimpleAlertText = driver.switchTo().alert().getText();
		//String SimpleAlertText = driver.switchTo().alert().getText();
		
		System.out.println(SimpleAlertText);
		
		Thread.sleep(5000);
		
		//click ok button
		
		driver.switchTo().alert().accept();
	
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}

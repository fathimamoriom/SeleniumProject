package seleniumDemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
	
	String PromtAlert = driver.switchTo().alert().getText();
	
	System.out.println(PromtAlert);
	
	driver.switchTo().alert().sendKeys("I am Moriom");
	
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
	
	driver.close();
	
	//use Alert method
	
	/*Alert PromtAlert = driver.switchTo().alert();
	
	PromtAlert.getText();
	
	System.out.println(PromtAlert.getText());
	
	PromtAlert.sendKeys("I am Moriom");
	PromtAlert.accept();
	
	Thread.sleep(5000);*/
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

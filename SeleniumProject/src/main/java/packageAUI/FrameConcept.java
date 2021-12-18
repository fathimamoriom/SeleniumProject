package packageAUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		//driver..click();
		
		//switching in frame
	
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		
        //select item
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		item1.click();
		
		
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		item2.click();
		
	   driver.findElementByXPath("//li[text()='Item 3']").click();
	   
	   driver.findElementByXPath("//li[text()='Item 4']").click();
	   
	   WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
	   
	   item5.click();
	   
	   WebElement item6 = driver.findElementByXPath("//li[text()='Item 6']");
	   
	   item6.click();
	   
	   WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		
	   item7.click();
	   
	   driver.switchTo().defaultContent();
	   
	   driver.findElementByXPath("//a[text()='Demos']").click();
	   
	   Thread.sleep(3000);
	   
	   driver.close();
		
		
		
		
		
		

	}

}

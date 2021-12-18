package packageAUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightclick).perform();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}

package packageAUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementById("draggable");
		
		WebElement dest = driver.findElementById("droppable");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}

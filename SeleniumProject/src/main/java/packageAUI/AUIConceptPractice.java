package packageAUI;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUIConceptPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		//WebElement content = driver.findElementByXPath("//a[@class='menulink']");
		
		driver
		
		Actions action = new Actions(driver);
		
		action.moveToElement(content).perform();
		
		driver.findElementByXPath("//a[text()='Articles']").click();
		
		driver.close();

	}

}

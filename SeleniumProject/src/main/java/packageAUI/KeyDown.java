package packageAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class KeyDown {

	private static final TimeUnit SECOND = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cored\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, SECOND);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificWrapper{
     
        //public ChromeDriver driver;
	
		public ChromeDriver driver;
			
		@BeforeMethod
		public void login() throws InterruptedException { 
			
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
			driver = new ChromeDriver();
		
			//maximize
			driver.manage().window().maximize();
			
			//load URL
			driver.get("http://leaftaps.com/opentaps");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Enter Username - (Element level)
			driver.findElementById("username").sendKeys("DemoSalesManager");
			
			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");
			
			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();
			
			// click crm.sfa link
			Thread.sleep(2000);
			driver.findElementByLinkText("CRM/SFA").click();
			
			}
		
		@AfterMethod
		public void closeBrowser() { 
			driver.close();
		}

		
		@DataProvider
		public String[][] getData() {
		
			//create object of 2D Array/declare 2D Array and write size of array(Row & column)
			String [][] data = new String[3][3];
			
			
			data[0][0] = "TCS";
			data[0][1] = "Sumayla";
			data[0][2] = "Choudhury";
			
			data [1][0] = "ABC";
			data [1][1] = "Mahbub";
			data [1][2] = "Kabir";
			
			data [2][0] = "XYZ";
			data [2][1] = "Moriom";
			data [2][2] = "Akter";
			
			/*data [3][0] = "ABC";
			data [3][1] = "Mamun";
			data [3][2] = "Chy";
			
			data [4][0] = "CTS";
			data [4][1] = "Nilufar";
			data [4][2] = "Chowdhury";
			
			data [5][0] = "DXC";
			data [5][1] = "Mohd.";
			data [5][2] = "Shakil";*/
			
			//add return type and change return type of getData()
				return data;		
			
		}
		
}

package tc_ConnectInheritanceConcept;

import org.testng.annotations.Test;

import wrapper.ProjSpecWrapperPractice;


	 public class CreateAccounts extends ProjSpecWrapperPractice{
	@Test
       public void CreateAccounts() {
	
		
		
		driver.findElementByLinkText("Create Account").clear();
		driver.findElementById("accountName").sendKeys("Hema Mali");
		driver.findElementByClassName("smallSubmit").click();
		
	
	}
	}



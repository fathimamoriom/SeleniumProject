package testNGDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationOrder {
	//annotation maintain always annotation order not insert order
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Beforetest");
	}
		@BeforeMethod
		public void beforemethod() {
			System.out.println("beforemethod");
		}
		
		@BeforeSuite
		public void beforesuite() {
			System.out.println("beforesuite");
		}
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("beforeclass");
		}
	}


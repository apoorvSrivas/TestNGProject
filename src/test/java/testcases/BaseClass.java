package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	@BeforeTest(alwaysRun=true)   // With alwaysRun, these will run when you run tests in group using xml file suite. 
	public void method3() {
		
		System.out.println("Inside before Test");
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		
		System.out.println("Inside the before method. ");
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("Inside the after method.");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4() {
		
		System.out.println("Inside after Test");
	}
	

}

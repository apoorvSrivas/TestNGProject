package testcases;


import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	
	@Test(dependsOnMethods="test2")     // Instead of setting priority, we can give dependsOnMethods.
	public void test1() {
		
		System.out.println("Inside the home loan test 1");
	}
	
	
	@Test(groups = {"sanity", "regression"})
	public void test2() {
		
		System.out.println("Inside the home loan test 2");
	}
	
	
	
}

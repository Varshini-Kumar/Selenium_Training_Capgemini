package practice;

import org.testng.annotations.Test;

public class TestPractice {
	@Test
	public void loginTest() {
	System.out.println("---Executing login Method---");
}
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest() {
		System.out.println("---Executing logout Method2---");
	}
	

}

package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DemoBaseClass {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Executing BeforeSuit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing BeforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing AfterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Executing AfterTest");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("Executing AfterSuit");
	}


}

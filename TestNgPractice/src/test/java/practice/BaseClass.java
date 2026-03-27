package practice;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("---Exceuting before Suite---", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("---Exceuting before Test---", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("---Exceuting before Class---", true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito"); // opens browser in incognito mode
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Exceuting before Method---", true);
	}
	
	@AfterSuite
	public void afterSuit() {
		Reporter.log("---Exceuting after Suite---", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("---Exceuting after Test---", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("---Exceuting after Class---", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("---Exceuting after Method---", true);
	}

	
}
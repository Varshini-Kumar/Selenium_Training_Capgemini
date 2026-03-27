package genericUtility;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserBaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("---Exceuting before Suite---", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("---Exceuting before Test---", true);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		Reporter.log("---Exceuting before Class---", true);
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--incognito");
		copt.addArguments("--headless");
		EdgeOptions eopt = new EdgeOptions();
		eopt.addArguments("--inprivate");
		eopt.addArguments("--headless");
		FirefoxOptions fopt = new FirefoxOptions();
		fopt.addArguments("--private");
		fopt.addArguments("-headless");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(copt);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(eopt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(fopt);
		}
		else if(browser.equalsIgnoreCase("brave")){
			ChromeOptions copt1 = new ChromeOptions();
			copt1.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
 
			 driver = new ChromeDriver(copt1);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Exceuting before Method---", true);
		
	}
	@Test
	public void login() {
		// login with credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
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




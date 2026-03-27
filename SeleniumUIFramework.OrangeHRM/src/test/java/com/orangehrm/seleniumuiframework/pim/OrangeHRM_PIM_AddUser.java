package com.orangehrm.seleniumuiframework.pim;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.object_repository.PIMPage;

public class OrangeHRM_PIM_AddUser {
    WebDriver driver = null;
	LoginPage lp = new LoginPage(driver);
	DashBoardPage dbp = new DashBoardPage(driver);
	PIMPage pim = new PIMPage(driver);
	AddEmployeePage aemp = new AddEmployeePage(driver);
	
	

	@Test()
	public void Login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		//PiM
		dbp.clickPim_module();
		pim.clickAddButton();
		//add emp
		aemp.addEmp("varshini", "kumar", "k", "2489");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		//add credentials
		aemp.createCreditionals("user1","pass123");
//		// Verify Login
//		WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
//		if (Login_Verify.isDisplayed()) {
//			Reporter.log("Login Page Status : Passed", true);
//		} else {
//			Reporter.log("Login Page Status : Failed", true);
//		}
	}

//	@Test(priority = 3, dependsOnMethods = "Login")
//	public void addUser() throws InterruptedException {
//		// PIM -> Add user
//		driver.findElement(By.xpath("//span[.= 'PIM']")).click();
//		driver.findElement(By.xpath("//button[contains(. , ' Add')]")).click();
//
//		driver.findElement(By.name("firstName")).sendKeys("Ram");
//		driver.findElement(By.name("middleName")).sendKeys("kumar");
//		driver.findElement(By.name("lastName")).sendKeys("H");
//
//		WebElement Emp_id = driver.findElement(By.xpath("//label[. = 'Employee Id']/../..//input"));
//		Emp_id.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
//		Emp_id.sendKeys("121");
//
//		// Locate the checkbox input
//		WebElement toggle = driver.findElement(By.xpath("//p[. = 'Create Login Details']/..//label"));
//		toggle.click();
//		
//		driver.findElement(By.xpath("//label[. = 'Username']/../..//input")).sendKeys("ramco");
//		driver.findElement(By.xpath("//label[. = 'Password']/../..//input")).sendKeys("ramco123");
//		driver.findElement(By.xpath("//label[. = 'Confirm Password']/../..//input")).sendKeys("ramco123");
//
//		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//	}
//
//	@Test(priority = 3, dependsOnMethods = "Login")
//	public void admin_user() throws InterruptedException {
//		driver.findElement(By.xpath("//span[. = 'Admin']")).click();
//		
//		driver.findElement(By.xpath("//label[. = 'Username']/../..//input")).sendKeys("ramco");
//		
//		driver.findElement(By.xpath("//label[.='User Role']/../..//div[.='-- Select --']")).click();
//		driver.findElement(By.xpath("//span[.='ESS']")).click();
//		
//		WebElement Emp_name = driver.findElement(By.xpath("//input[@placeholder = 'Type for hints...']"));
//		Emp_name.sendKeys("Ram kumar");
//		Thread.sleep(2000);
//		Emp_name.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		
//		driver.findElement(By.xpath("//label[. ='Status']/../..//i")).click();
//		driver.findElement(By.xpath("//span[. = 'Enabled']")).click();
//		
//		driver.findElement(By.cssSelector("[type = 'submit']")).click();
//		
//		
//		// validate the data
//		WebElement verify=driver.findElement(By.xpath("//span[.=\"(1) Record Found\"]"));
//		if(verify.getText().equals("(1) Record Found")){
//			System.out.println("there is no entry");
//		}
//		else {
//			System.out.println("there is one entry");
//		}
//	}
	
//	@Test(priority = 5, dependsOnMethods = "Login")
//	public void LogOut() {
//		driver.findElement(By.className("oxd-userdropdown-tab")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		
//		//Verify LogOut
//		WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
//		if(Logout.isDisplayed()) {
//			Reporter.log("LogOut status : Passed", true);
//		} else {
//			Reporter.log("LogOut status : Failed", true);
//		}
//	}
	
}

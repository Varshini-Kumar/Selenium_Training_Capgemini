package com.orangehrm.seleniumuiframework.my_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyInfoTest {
	WebDriver driver = null; 
		@Test(priority = -1)
		public void LaunchingBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		@Test(priority = 1)
		public void Login() {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			//Verify Login
			WebElement Login_Verify = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-header-breadcrumb']"));
			if(Login_Verify.isDisplayed()) {
				Reporter.log("Login Page Status : Passed", true);
			}else {
				Reporter.log("Login Page Status : Failed", true);
			}
		}
		
		@Test(priority = 5)
		public void ChangeInfo() throws InterruptedException {
			driver.findElement(By.xpath("//span[. = 'My Info']")).click();
			
			WebElement ref = driver.findElement(By.xpath("//label[.='Employee Full Name']/../..//input[@name=\"firstName\"]"));
		
//			Actions act=new Actions(driver);
//			act.sendKeys(ref, "shdvgh").perform();
//			driver.findElement(By.name("middleName")).sendKeys(Keys.CLEAR , "Sree");
//			driver.findElement(By.name("lastName")).sendKeys(Keys.CLEAR , "H");
//			
//			driver.findElement(By.xpath("//label[ . = 'Employee Id']/../..//input")).sendKeys(Keys.CLEAR, "123");
//			
//			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//			
			
//			//LogOut
//			driver.findElement(By.className("oxd-userdropdown-tab")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			//LogIn
//			driver.findElement(By.name("username")).sendKeys("Admin");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			
			//Verify the detial updated
//			WebElement Username_Verify = driver.findElement(By.xpath("//p[@class = 'oxd-userdropdown-name']"));
//			String uname = Username_Verify.getText();
//			if(!uname.contains("Manju")) {
//				Reporter.log("UserName Change status : Passed (Should'nt change)", true);
//			} else {
//				Reporter.log("UserName Change status : Failed (Should change)", true);
//			}
//			
		}
//		@Test(priority = 7)
//		public void LogOut() {
//			driver.findElement(By.className("oxd-userdropdown-tab")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			
//			//Verify LogOut
//			WebElement Logout = driver.findElement(By.xpath("//h5[. = 'Login']"));
//			if(Logout.isDisplayed()) {
//				Reporter.log("LogOut status : Passed", true);
//			} else {
//				Reporter.log("LogOut status : Failed", true);
//			}
//		}
	}



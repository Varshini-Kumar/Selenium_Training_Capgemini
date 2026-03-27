package com.orangehrm.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeeTest {
	private void addNewEmployee() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		// pim module
		driver.findElement(By.xpath("//span[.= 'PIM']")).click();
		driver.findElement(By.xpath("//button[contains(. , ' Add')]")).click();
		// add emp
		driver.findElement(By.name("firstName")).sendKeys("Ram");
		driver.findElement(By.name("middleName")).sendKeys("kumar");
		driver.findElement(By.name("lastName")).sendKeys("H");
		
		WebElement Emp_id = driver.findElement(By.xpath("//label[. = 'Employee Id']/../..//input"));
		Emp_id.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
		Emp_id.sendKeys("121");

	}
}

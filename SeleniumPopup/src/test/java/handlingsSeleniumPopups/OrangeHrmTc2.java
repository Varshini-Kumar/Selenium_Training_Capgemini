package handlingsSeleniumPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTc2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
        // Click Admin
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		Thread.sleep(3000);
        // Click Add
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(3000);
        // Click User Role dropdown
		WebElement dropdown = driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]"));
		dropdown.click();

		// Select Admin
		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		String selectedval = driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")).getText();
		if (selectedval.contains("Admin")) {
			System.out.println("Admin is selected");
		} else {
			System.out.println("Admin is not selected");
		}

		// Reopen dropdown
		driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")).click();

		// Select ESS
		driver.findElement(By.xpath("//span[text()='ESS']")).click();

		String selectedval2 = driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")).getText();
		if (selectedval2.contains("ESS")) {
			System.out.println("ESS is selected");
		} else {
			System.out.println("ESS is not selected");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'ghost')]")).click();
		Thread.sleep(2000);

		// Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

		driver.quit();
	}
}
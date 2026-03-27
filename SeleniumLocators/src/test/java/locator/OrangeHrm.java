package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'user')]"));
		username.sendKeys("Admin");
		WebElement password = driver
				.findElement(RelativeLocator.with(By.xpath("//input[@type='password']")).below(username));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
		WebElement Button_Profile = driver
				.findElement(By.xpath("//i[@class ='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));

		Button_Profile.click();

		Button_Profile.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}

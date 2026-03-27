package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameMethod {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(7000);
     //locating username textfield
     driver.findElement(By.name("username")).sendKeys("Admin");
     //locating password textfield
     driver.findElement(By.name("password")).sendKeys("admin123");
	}

}

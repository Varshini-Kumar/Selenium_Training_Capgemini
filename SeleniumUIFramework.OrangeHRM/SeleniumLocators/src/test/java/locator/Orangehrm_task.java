package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Orangehrm_task {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.cssSelector("[type='submit']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[.='Recruitment']")).click();
	}

}

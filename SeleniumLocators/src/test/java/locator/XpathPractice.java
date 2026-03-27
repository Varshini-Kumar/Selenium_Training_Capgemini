package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.get("https://demoapps.qspiders.com/ui/login1.0");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("user");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

}

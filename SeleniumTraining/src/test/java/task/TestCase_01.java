package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_01 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
driver.manage().window().maximize();

Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.cssSelector("button[type='submit']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
WebElement searchele= driver.findElement(By.xpath("//label[.='Employee Name']/../../..//input[@placeholder='Type for hints...']"));
searchele.sendKeys("Adarsh");
Thread.sleep(2000);
searchele.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

	}

}

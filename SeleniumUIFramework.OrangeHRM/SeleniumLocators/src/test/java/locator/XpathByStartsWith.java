package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByStartsWith {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();

driver.get("https://www.ebay.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@id,'g')]")).sendKeys("toys");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[starts-with(@id,'gh')]")).click();

driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[starts-with(text(),'Digital ')]")).click();

	}

}
